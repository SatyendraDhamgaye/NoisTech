/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noistech.model;

import com.mycompany.noisdev.UploadImageKit;
import com.noistech.beans.TblApksBeans;
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
public class ApkModel {

    static String message = null;
    static String sql;
    PreparedStatement ps = null;
    Connection con = NoistechDB.conectdb();

    public void insert(TblApksBeans apkbeans, HttpServletRequest request, HttpServletResponse response) throws IOException {
        UploadImageKit imageKit = new UploadImageKit();
        try {

            sql = "insert into tblapks(Name,Link,Description,version,img) values(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, apkbeans.getName());
            ps.setString(2, apkbeans.getLink());
            ps.setString(3, apkbeans.getDescription());
            ps.setString(4, apkbeans.getVersion());
            ps.setString(5, imageKit.doUploadImageOnImageKit(apkbeans.getImg()));
            int rc = ps.executeUpdate();
            if (rc == 1) {
                message = "Data inserted sucessfully";
            }

        } catch (SQLException e) {
            System.out.println("com.noistech.model.ApkModel.insert() : " + e.getMessage());
            message = e.getMessage();
        } finally {
            response.sendRedirect("addApp.jsp?message=" + message);
        }

    }

    public void delete(TblApksBeans apkbeans, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "delete from tblapks where Id=?";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, apkbeans.getId());
            int rc = ps.executeUpdate();
            if (rc == 0) {
                message = "data deleted successfully";

            }
        } catch (Exception e) {
            System.out.println("com.noistech.model.ApkModel.delete() : " + e.getMessage());
            message = e.getMessage();
        } finally {
            response.sendRedirect("index.jsp?message=" + message);
        }

    }

    public void update(TblApksBeans apkbeans, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "update tblapks set Name=?,Link=?,Description=?,vesrion=?,img=? where Id=?";
        try {
            ps = con.prepareCall(sql);
            ps.setString(1, apkbeans.getName());
            ps.setString(2, apkbeans.getLink());
            ps.setString(3, apkbeans.getDescription());
            ps.setString(4, apkbeans.getVersion());
            ps.setString(5, apkbeans.getImg());
            ps.setInt(9, apkbeans.getId());
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

    public ArrayList<TblApksBeans> select() {
        ArrayList<TblApksBeans> arrayList = new ArrayList<>();
        try {

            sql = "select * from tblapks";
            ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                arrayList.add(new TblApksBeans(
                        rs.getRow(),
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("link"),
                        rs.getString("description"),
                        rs.getString("version"),
                        rs.getString("img"),
                        rs.getString("datetime"),
                        rs.getDouble("visits"),
                        rs.getDouble("download")
                ));
            }

        } catch (Exception e) {
            System.out.println("exception; " + e.getMessage());
        }
        return arrayList;

    }

    public TblApksBeans selectById(int id) {
        TblApksBeans singleApp = null;
        try {

            sql = "select * from tblapks where id = " + id;
            ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                singleApp = new TblApksBeans(
                        rs.getRow(),
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("link"),
                        rs.getString("description"),
                        rs.getString("version"),
                        rs.getString("img"),
                        rs.getString("datetime"),
                        rs.getDouble("visits"),
                        rs.getDouble("download")
                );
            }

        } catch (Exception e) {
            System.out.println("exception; " + e.getMessage());
        } finally {
            
        }
        return singleApp;

    }

}
