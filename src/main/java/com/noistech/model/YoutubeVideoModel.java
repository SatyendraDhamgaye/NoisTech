package com.noistech.model;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.Video;
import com.google.api.services.youtube.model.VideoListResponse;
import com.mysql.cj.protocol.Resultset;
import com.noistech.beans.TblVideosBeans;
import com.noistech.beans.VideoBeans;
import com.noistechdb.DB.NoistechDB;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author habeel
 */
public class YoutubeVideoModel {

    static String message = null;
    static String sql;
    PreparedStatement ps = null;
    Connection con = NoistechDB.conectdb();
    Resultset rs = null;
    CallableStatement cs = null;

    String API_KEY = " ";
    String Channel_Id = " ";

    public ArrayList<VideoBeans> getSingleVideoDetails(String VideoId) throws IOException {

        ArrayList<VideoBeans> beans = new ArrayList<>();
        try {
            YouTube youTube = new YouTube.Builder(new NetHttpTransport(), new JacksonFactory(), new HttpRequestInitializer() {

                @Override
                public void initialize(HttpRequest hr) throws IOException {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }).setApplicationName("noisyoutube").build();
            YouTube.Videos.List videoRequest = youTube.videos().list("snippet,contentDetails,statistics");
            videoRequest.setId(VideoId);
            videoRequest.setKey(API_KEY);
            VideoListResponse videoListResponse = videoRequest.execute();
            List<Video> videoList = videoListResponse.getItems();
            Video video = videoList.iterator().next();
            beans.add(new VideoBeans(
                    video.getId(),
                    video.getSnippet().getTitle(),
                    video.getSnippet().getDescription(),
                    video.getSnippet().getPublishedAt(),
                    video.getSnippet().getTags().toString(),
                    video.getSnippet().getThumbnails().getDefault().getUrl(),
                    video.getSnippet().getThumbnails().getMedium().getUrl(),
                    video.getSnippet().getThumbnails().getHigh().getUrl(),
                    video.getSnippet().getThumbnails().getStandard().getUrl(),
                    video.getSnippet().getThumbnails().getMaxres().getUrl(),
                    video.getContentDetails().getDuration(),
                    video.getStatistics().getViewCount(),
                    video.getStatistics().getLikeCount(),
                    video.getStatistics().getDislikeCount(),
                    video.getStatistics().getCommentCount()
            ));

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
        return beans;

    }
}
