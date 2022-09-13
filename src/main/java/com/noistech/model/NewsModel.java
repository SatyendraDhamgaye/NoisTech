/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noistech.model;

import com.mycompany.noisdev.UploadImageKit;
import com.noistech.beans.TblApksBeans;
import com.noistech.beans.TblNewsBeans;
import static com.noistech.model.ApkModel.sql;
import com.noistechdb.DB.NoistechDB;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author habeel
 */
public class NewsModel {

    static String message = null;
    static String sql;
    PreparedStatement ps = null;
    Connection con = NoistechDB.conectdb();

    public void insert(TblNewsBeans newsbeans, HttpServletRequest request, HttpServletResponse response) throws IOException {
        UploadImageKit imageKit = new UploadImageKit();
        try {

            sql = "insert into tblnews(Link,Keywords,title,description,thumbnail,content,postedby,category) values(?,?,?,?,?,?,?,?)";

            ps = con.prepareStatement(sql);
            ps.setString(1, newsbeans.getLink().replace(" ", "-"));
            ps.setString(2, newsbeans.getKeyword());
            ps.setString(3, newsbeans.getTitle());
            ps.setString(4, newsbeans.getDescription());
            ps.setString(5, imageKit.doUploadImageOnImageKit(newsbeans.getThumbnail()));
            ps.setString(6, newsbeans.getContent());
            ps.setString(7, newsbeans.getPostedBy());
            ps.setString(8, newsbeans.getCategory());
            int rc = ps.executeUpdate();
            if (rc >= 1) {
                message = "Data inserted sucessfully";
            }

        } catch (SQLException e) {

            message = e.getMessage();
        } finally {
            response.sendRedirect("addNews.jsp?message=" + message);
        }

    }

    public void delete(TblNewsBeans N, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "delete from tblnews where Id=?";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, N.getId());
            int rc = ps.executeUpdate();
            if (rc == 0) {
                message = "data deleted successfully";

            }
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            response.sendRedirect("index.jsp?message=" + message);
        }

    }

    public void update(TblNewsBeans N, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "update tblDevelopers set Link=?,Keywords=?,title=?,description=?,thumbnail=?,content=?,postedby=?,visits=? where Id=?";
        try {
            ps = con.prepareCall(sql);
            ps.setString(1, N.getLink());
            ps.setString(2, N.getKeyword());
            ps.setString(3, N.getTitle());
            ps.setString(4, N.getDescription());
            ps.setString(5, N.getThumbnail());
            ps.setString(6, N.getContent());
            ps.setString(7, N.getPostedBy());
            ps.setDouble(8, N.getVisits());

            ps.setInt(10, N.getId());

            int rc = ps.executeUpdate();
            if (rc == 0) {
                message = "data updated successfully";
            }
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            response.sendRedirect("index.jsp?message=" + message);
        }

    }

    public ArrayList<TblNewsBeans> select() {
        ArrayList<TblNewsBeans> arrayListNews = new ArrayList<>();
        try {
            sql = "select * from tblnews";
            ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                arrayListNews.add(new TblNewsBeans(
                        rs.getRow(),
                        rs.getInt("id"),
                        rs.getString("link"),
                        rs.getString("keywords"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("thumbnail"),
                        rs.getString("content"),
                        rs.getString("category"),
                        rs.getString("postedby"),
                        rs.getDouble("visits"),
                        rs.getString("datetime")
                ));
            }

        } catch (Exception e) {
            System.out.println("exception; " + e.getMessage());
        }
        return arrayListNews;

    }
    public ArrayList<TblNewsBeans> selectByLimit(int limit) {
        ArrayList<TblNewsBeans> arrayListNews = new ArrayList<>();
        try {
            sql = "select * from tblnews limit "+limit;
            ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                arrayListNews.add(new TblNewsBeans(
                        rs.getRow(),
                        rs.getInt("id"),
                        rs.getString("link"),
                        rs.getString("keywords"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("thumbnail"),
                        rs.getString("content"),
                        rs.getString("category"),
                        rs.getString("postedby"),
                        rs.getDouble("visits"),
                        rs.getString("datetime")
                ));
            }

        } catch (Exception e) {
            System.out.println("exception; " + e.getMessage());
        }
        return arrayListNews;

    }
    
    public TblNewsBeans selectById(int id) {
        TblNewsBeans singleNews = null;
        try {

            sql = "select * from tblnews where id = " + id;
            ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                singleNews = new TblNewsBeans(
                     rs.getRow(),
                        rs.getInt("id"),
                        rs.getString("link"),
                        rs.getString("keywords"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("thumbnail"),
                        rs.getString("content"),
                        rs.getString("category"),
                        rs.getString("postedby"),
                        rs.getDouble("visits"),
                        rs.getString("datetime")  
                );
            }

        } catch (Exception e) {
            System.out.println("exception; " + e.getMessage());
        } finally {
            
        }
        return singleNews;
    }
}
