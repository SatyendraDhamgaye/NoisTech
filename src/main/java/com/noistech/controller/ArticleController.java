/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noistech.controller;

import com.noistech.beans.TblPostBeans;
import com.noistech.model.PostModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author habeel
 */
@WebServlet(name = "ArticleController", urlPatterns = {"/ArticleController"})

@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 10,
        maxFileSize = 1024 * 1024 * 50,
        maxRequestSize = 1024 * 1024 * 100)

public class ArticleController extends HttpServlet {

    String message = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ArticleController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ArticleController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String action = request.getParameter("action");
        TblPostBeans beans = new TblPostBeans();
        PostModel model = new PostModel();
        if (action.equals("insert")) {

            beans.setContent(request.getParameter("content"));
            beans.setDescription(request.getParameter("description"));
            beans.setKeywords(request.getParameter("keyword"));
            beans.setTitle(request.getParameter("title"));
            beans.setLink(request.getParameter("title"));
            beans.setCategoryIN(request.getParameter("category"));
            beans.setVideoId(request.getParameter("videoId"));
            beans.setPostedby(request.getParameter("postedby"));

            model.insert(beans, request, response);

        } else if (action.equals("update")) {
            try {
                beans.setId(Integer.parseInt(request.getParameter("id")));
                beans.setContent(request.getParameter("content"));
                beans.setDescription(request.getParameter("descripton"));
                beans.setKeywords(request.getParameter("keyword"));
                beans.setTitle(request.getParameter("title"));
                beans.setLink(request.getParameter("title"));
                message = model.update(beans, request, response);
            } catch (Exception e) {
                message = e.getMessage();
            } finally {
                response.sendRedirect("manage-article?message=" + message);
            }
        } else if (action.equals("delete")) {

        }
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
