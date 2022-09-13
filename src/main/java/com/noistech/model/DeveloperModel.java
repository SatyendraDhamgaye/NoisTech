/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noistech.model;


import com.noistech.beans.TblDeveloperBeans;
import com.noistechdb.DB.NoistechDB;
import java.io.IOException;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author habeel
 */
public class DeveloperModel {

    static String message = null;
    static String sql;
    PreparedStatement ps = null;
    Connection con = NoistechDB.conectdb();

    public void insert(TblDeveloperBeans D, HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {

            sql = "insert into tblDevelopers(Id,phone,Password,Username,name,Logincount,Authentification,facebook,Instagram,twitter,LinkedIn,DateTime,Logindatetime) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
           
            ps.setInt(1, D.getId());
            ps.setString(2, D.getPhone());
            ps.setString(3, D.getPassword());
            ps.setString(4, D.getUsername());
            ps.setString(5, D.getName());
            ps.setInt(6, D.getLoginCount());
            ps.setInt(7, D.getAuthentification());
            ps.setString(8, D.getFacebook());
            ps.setString(9, D.getInstagram());
            ps.setString(10, D.getTwitter());
            ps.setString(11, D.getLinkedIn());
            ps.setString(12, D.getDateTime());
            ps.setString(13, D.getLoginDateTime());
            int rc = ps.executeUpdate();

            if (rc == 1) {
                message = "Data inserted sucessfully";
            }

        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            response.sendRedirect("index.jsp?message=" + message);
        }

    }

    public void delete(TblDeveloperBeans D, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "delete from tblDevelopers where Id=?";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, D.getId());
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

    public void update(TblDeveloperBeans D, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "update tblDevelopers set phone=?,Password=?,Username=?,name=?,Logincount=?,Authentification=?,facebook=?,Instagram=?,twitter=?,LinkedIn=? where Id=?";
        try {
            ps = con.prepareCall(sql);

            ps.setString(1, D.getPhone());
            ps.setString(2, D.getPassword());
            ps.setString(3, D.getUsername());
            ps.setString(4, D.getName());
            ps.setInt(5, D.getLoginCount());
            ps.setInt(6, D.getAuthentification());
            ps.setString(7, D.getFacebook());
            ps.setString(8, D.getInstagram());
            ps.setString(9, D.getTwitter());
            ps.setString(10, D.getLinkedIn());
           
            ps.setInt(12, D.getId());
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

    public void select(TblDeveloperBeans D, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "select * from tblDevelopers";
        try {
            Statement sm;
            sm = con.createStatement();
            ResultSet rs = sm.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("Id"));
                System.out.println(rs.getString("phone"));
                System.out.println(rs.getString("password"));
                System.out.println(rs.getString("Username"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("Logincount"));
                System.out.println(rs.getInt("Authentification"));
                System.out.println(rs.getString("facebook"));
                System.out.println(rs.getString("Instagram"));
                System.out.println(rs.getString("twitter"));
                System.out.println(rs.getString("LinkedIn"));
                System.out.println(rs.getString("DateTime"));
                System.out.println(rs.getString("Logindatetime"));

            }
            int rc = sm.executeUpdate(sql);
            if (rc == 0) {
                System.out.println("selection successfull");
            }
        } catch (Exception e) {
            message = e.getMessage();
            System.out.println("cannot display due to" + message);

        } finally {
            response.sendRedirect("index.jsp?message=" + message);
        }

    }

}
