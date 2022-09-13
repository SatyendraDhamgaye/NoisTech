/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noistech.model;

import com.noistech.beans.TblCategoryBeans;
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
public class CategoryModel {

    Connection con = NoistechDB.conectdb();
    
    Statement sm = null;
    PreparedStatement ps = null;
    static String sql;
    static String message;

    public void insert(TblCategoryBeans categorybeans, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "insert into tblcategories(Name,counter) values(?,?)";
        try {
            ps = con.prepareCall(sql);

            ps.setString(1, categorybeans.getName());
            ps.setDouble(2, categorybeans.getCounter());

            int rc = ps.executeUpdate();
            if (rc == 0) {
                message = "data insserted sucessfully";
            }
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            response.sendRedirect("index.jsp?message" + message);
        }

    }

    public void delete(TblCategoryBeans categorybeans, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "delete from tblcategories where Id=?";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, categorybeans.getId());
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

    public void update(TblCategoryBeans categorybeans, HttpServletRequest request, HttpServletResponse response) throws IOException {

        sql = "update tblcategory set Name=?,counter=? where Id=?";
        try {
            ps = con.prepareCall(sql);
            ps.setString(1, categorybeans.getName());
            ps.setInt(2, categorybeans.getCounter());
            ps.setInt(3, categorybeans.getId());
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

    public ArrayList<TblCategoryBeans> select(){
        ArrayList<TblCategoryBeans> arrayList = new ArrayList<>();
        try {
            sql="select * from tblcategory";
            ps=con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                arrayList.add(new TblCategoryBeans(
                rs.getRow(),
                rs.getInt("id"),
                rs.getString("Name"),
                rs.getInt("counter")
                ));
            }
        
        } catch (Exception e) {
            System.out.println("exception; "+e.getMessage());
        }
        return arrayList;
        

    }
    public static void main(String[] args) {
        CategoryModel m = new CategoryModel();
        m.select();
    }
}
