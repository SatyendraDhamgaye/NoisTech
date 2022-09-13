/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noistech.model;

import com.mycompany.noisdev.UploadImageKit;
import com.noistech.beans.TblNewsBeans;
import com.noistech.beans.TblPostBeans;
import static com.noistech.model.NewsModel.sql;
import com.noistechdb.DB.NoistechDB;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author habeel
 */
public class PostModel {

    static String message = null;
    static String sql;
    PreparedStatement ps = null;
    Connection con = NoistechDB.conectdb();

    public void insert(TblPostBeans beans, HttpServletRequest request, HttpServletResponse response) throws IOException {
        UploadImageKit imageKit = new UploadImageKit();
        sql = "insert into tblpost(link,title,keywords,description,content,thumbnail,videoid,category,postedby) values(?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, beans.getLink().replace(" ", "-"));
            ps.setString(2, beans.getTitle());
            ps.setString(3, beans.getKeywords());
            ps.setString(4, beans.getDescription());
            ps.setString(5, beans.getContent());
            ps.setString(6, imageKit.doUploadImageOnImageKit(beans.getThumbnail()));
            ps.setString(7, beans.getVideoId());
            ps.setString(8, beans.getCategoryIN());
            ps.setString(9, beans.getPostedby());
            int rs = ps.executeUpdate();
            if (rs >= 1) {
                message = "data inserted successfully";
            }
        } catch (SQLException e) {
            message = "unable to insert";
        } finally {
            response.sendRedirect("videoArticle.jsp?message=" + message);
        }

    }

    public String update(TblPostBeans beans, HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<TblPostBeans> select() {
        ArrayList<TblPostBeans> arrayList = new ArrayList<>();
        System.out.println("test");
        try {

            sql = "select * from tblpost";
            ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                arrayList.add(new TblPostBeans(
                        rs.getRow(),
                        rs.getInt("id"),
                        rs.getString("link"),
                        rs.getString("keywords"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("thumbnail"),
                        rs.getString("content"),
                        rs.getString("datetime"),
                        rs.getString("videoid"),
                        null,
                        rs.getString("category"),
                        rs.getString("postedby"),
                        rs.getInt("visits")
                ));
            }

        } catch (SQLException e) {
            System.out.println("exception; " + e.getMessage());
        }
        return arrayList;

    }
    
    public TblPostBeans selectById(int id) {
        TblPostBeans singlePost = null;
        try {

            sql = "select * from tblpost where id = " + id;
            ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                singlePost = new TblPostBeans(
                      rs.getRow(),
                        rs.getInt("id"),
                        rs.getString("link"),
                        rs.getString("keywords"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("thumbnail"),
                        rs.getString("content"),
                        rs.getString("datetime"),
                        rs.getString("videoid"),
                        null,
                        rs.getString("category"),
                        rs.getString("postedby"),
                        rs.getInt("visits")
                );
            }

        } catch (Exception e) {
            System.out.println("exception; " + e.getMessage());
        } finally {
            
        }
        return singlePost;
    }

}
