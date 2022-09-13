/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noistech.controller;

import com.noistech.beans.TblApksBeans;
import com.noistech.beans.TblPostBeans;
import com.noistech.beans.VideoBeans;
import com.noistech.model.PostModel;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Habeel
 */
@WebServlet(name = "InsertArticleController", urlPatterns = {"/InsertArticleController"})
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 10,
        maxFileSize = 1024 * 1024 * 50,
        maxRequestSize = 1024 * 1024 * 100)
public class InsertArticleController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        FileItemFactory file_factory = new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(file_factory);
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> imgs = new ArrayList<>();
        try {
            List items = sfu.parseRequest(request);

            for (int i = 0; i < items.size(); i++) {
                FileItem item = (FileItem) items.get(i);
                if (!item.isFormField()) {
                    File f = new File(item.getName());
                    item.write(f);
                    imgs.add(f.getAbsolutePath());
                } else {
                    strings.add(item.getString());
                }
            }
            
            TblPostBeans beans = new TblPostBeans(
                    0,
                    0,
                    strings.get(1),
                    strings.get(6),
                    strings.get(1),
                    strings.get(2),
                    imgs.get(0),
                    strings.get(5),
                    null,
                    strings.get(4),
                    strings.get(3),
                    null,
                    strings.get(0),
                    0);
            PostModel model = new PostModel();
            model.insert(beans, request, response);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
