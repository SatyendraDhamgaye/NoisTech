/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noistech.model;

import com.mycompany.noisdev.ExtractURL;
import com.noistech.beans.TblCategoryBeans;
import com.noistech.beans.TblNewsBeans;
import com.noistech.beans.TblVideosBeans;
import static com.noistech.model.CategoryModel.sql;
import static com.noistech.model.NewsModel.sql;
import com.noistechdb.DB.NoistechDB;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * /**
 *
 * @author habeel
 */
public class VideoModel {

    Connection con = NoistechDB.conectdb();
    Statement sm = null;
    PreparedStatement ps = null;
    CallableStatement cs = null;
    static String sql;
    static String message;
    ResultSet rs = null;

    public void insert(TblVideosBeans V, HttpServletRequest request, HttpServletResponse response) throws IOException {

        int status = doCheckExistence(ExtractURL.getVideoId(V.getLink()));
        if (status == 1) {
            sql = "insert into tblvideos(VideoID,link) values(?,?)";
            try {
                ps = con.prepareCall(sql);
                ps.setString(1, ExtractURL.getVideoId(V.getLink()));
                ps.setString(2, V.getLink());
                int rc = ps.executeUpdate();
                if (rc == 1) {
                    message = "data insserted sucessfully";
                }
            } catch (SQLException e) {
                message = e.getMessage();
            } finally {
                response.sendRedirect("addVideos.jsp?message=" + message);
            }
        } else if (status == 0) {
            message = "Already Exist";
            response.sendRedirect("addVideos.jsp?message=" + message);
        }
    }

    public void delete(TblVideosBeans V, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "delete from tblvideos where Id=?";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, V.getId());
            int rc = ps.executeUpdate();
            if (rc == 0) {
                message = "data deleted successfully";

            }
        } catch (SQLException e) {
            System.out.println("com.noistech.model.VideoModel.delete() " + e.getMessage());
            message = e.getMessage();
        } finally {
            response.sendRedirect("index.jsp?message=" + message);
        }

    }

    public void update(TblVideosBeans V, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "update tblvideos set VideoID=?,link=? where Id=?";
        try {
            ps = con.prepareCall(sql);
            ps.setString(1, V.getVideoId());
            ps.setString(2, V.getLink());
            ps.setInt(3, V.getId());
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

     public ArrayList<TblVideosBeans> select(){
        ArrayList<TblVideosBeans> arrayList = new ArrayList<>();
         System.out.println("test");
        try {
           
            sql="select * from tblvideos";
            ps=con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("call:"+rs.getRow());
                arrayList.add(new TblVideosBeans(
                rs.getRow(),
                rs.getInt("id"),
                rs.getString("VideoId"),
                rs.getString("link"),
                rs.getString("datetime")
                ));
            }
        
        } catch (SQLException e) {
            System.out.println("exception; "+e.getMessage());
        }
        return arrayList;
        

    }
      public TblVideosBeans selectById(int id) {
        TblVideosBeans singleVideos = null;
        try {

            sql = "select * from tblvideos where id = " + id;
            ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                singleVideos = new TblVideosBeans(
                rs.getRow(),
                rs.getInt("id"),
                rs.getString("VideoId"),
                rs.getString("link"),
                rs.getString("datetime")
                );
            }

        } catch (Exception e) {
            System.out.println("exception; " + e.getMessage());
        } finally {
            
        }
        return singleVideos;
    }
   

    public int doCheckExistence(String link) {
        sql = "select VideoId from tblvideos where VideoId = ?";
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, link);
            rs = cs.executeQuery();
            if (rs.next()) {
                if (rs.getRow() >= 1) {
                    return 0;
                }
            } else {
                return 1;
            }

        } catch (SQLException e) {
            System.out.println("com.noistech.model.VideoModel.doCheckExistence() : " + e.getMessage());
        }
        return 0;
    }
    
    
     public static void main(String[] args) {
        VideoModel m = new VideoModel();
        m.select();
    }
}
