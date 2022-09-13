/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.noisdev;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import static com.mycompany.noisdev.App.timestamp;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/**
 *
 * @author habeel
 */
public class UploadImageKit {

    private static final String ALGORITHM = "HmacSHA1";
    private final static String PUBLIC_API_KEY = "CwKMwFZhlOhwxEnWH5HIUsph4t0=";
    private final static String PRIVATE_API_KEY = "9weLKGlvcjCbHjB8diSRdsbGdUI=";
    private final static String IMAGE_KIT_IMAGE_UPLOAD_URL = "https://upload.imagekit.io/rest/api/image/v2/utibsch38/";

    private static String sign(String content) {
        String encoded;
        try {
            SecretKeySpec signingKey = new SecretKeySpec(PRIVATE_API_KEY.getBytes(), ALGORITHM);
            Mac mac = Mac.getInstance(ALGORITHM);
            mac.init(signingKey);
            encoded = toHexString(mac.doFinal(content.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("exception sign : " + e.getMessage());
            throw new RuntimeException("Cannot create signature.", e);

        } catch (InvalidKeyException e) {
            System.out.println("exception sign : " + e.getMessage());
            throw new RuntimeException("Cannot create signature.", e);
        }
        return encoded;
    }

    private static String toHexString(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }

    protected static String timestamp() {
        return Long.toString(System.currentTimeMillis() / 1000L);
    }

    public String doUploadImageOnImageKit(String imagePath) {

        String URL = null;
        String filename = new File(imagePath).getName().toString();
        String time = timestamp();
        String content = "apiKey=" + PUBLIC_API_KEY + "&filename=" + filename + "&timestamp=" + time;
        String sig = sign(content);
        try {
            HttpResponse<JsonNode> uploadResponse = Unirest.post(IMAGE_KIT_IMAGE_UPLOAD_URL)
                    .header("accept", "application/json")
                    .field("file", new File(imagePath))
                    .field("filename", filename)
                    .field("apiKey", PUBLIC_API_KEY)
                    .field("signature", sig)
                    .field("timestamp", time)
                    // .field("useUniqueFilename", false) // To override existing image. (Default: True)
                    .asJson();
            JSONObject jsonResponse = uploadResponse.getBody().getObject();
            URL = (String) jsonResponse.get("url");
        } catch (UnirestException e) {
            e.printStackTrace();
            System.out.println("com.mycompany.noisdev.App.main() : " + e.getMessage());

        }
        return URL;
    }
}
