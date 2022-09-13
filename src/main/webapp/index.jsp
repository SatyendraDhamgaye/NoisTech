<%-- 
    Document   : index
    Created on : 17 Aug, 2019, 1:41:46 PM
    Author     : habeel
--%>

<%@page import="com.noistech.beans.TblVideosBeans"%>
<%@page import="com.noistech.model.VideoModel"%>
<%@page import="com.noistech.beans.TblPostBeans"%>
<%@page import="com.noistech.model.PostModel"%>
<%@page import="com.noistech.beans.TblApksBeans"%>
<%@page import="com.noistech.model.ApkModel"%>
<%@page import="com.noistech.beans.TblNewsBeans"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.noistech.model.NewsModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%!
            NewsModel model = new NewsModel();
            ArrayList<TblNewsBeans> arrayList = model.select();
        %>

        <%
            for (TblNewsBeans news : arrayList) {
        %>

        Title : <%= news.getTitle()%><br>
        Keywords : <%= news.getKeyword()%><br>
        Posted By : <%= news.getPostedBy()%><br>
        Content : <%= news.getContent()%><br>
        <img src="<%= news.getThumbnail()%>?tr=w-100,h-100"  alt="<%= news.getThumbnail()%>"/>


        <%
            }
        %>

        <hr>

        <%!
            ApkModel apk = new ApkModel();
            ArrayList<TblApksBeans> arrayLists = apk.select();
        %>

        <%
            for (TblApksBeans apks : arrayLists) {%>

        Title : <%= apks.getName()%><br>
        Keywords : <%= apks.getVersion()%><br>
        Posted By : <%= apks.getDescription()%><br>
        <img src="<%= apks.getImg()%>?tr=w-100,h-100"  alt="<%= apks.getImg()%>"/>


        <%
            }
        %>
        <hr>
        <%!
            PostModel postmodel = new PostModel();
            ArrayList<TblPostBeans> postbeans = postmodel.select();
        %>

        <%
            for (TblPostBeans post : postbeans) {%>

        Title : <%= post.getTitle()%><br>
        Keywords : <%= post.getContent()%><br>
        links : <%= post.getLink()%><br>
        Posted By : <%= post.getDescription()%><br>
        Posted By : <%= post.getKeywords()%><br>
        Posted By : <%= post.getPostedby()%><br>
        Posted By : <%= post.getVideoId()%><br>
        <img src="<%= post.getThumbnail()%>?tr=w-100,h-100"  alt="<%= post.getThumbnail()%>"/>


        <%
            }
        %>

        <hr>
        
        
        <%!
            VideoModel videomodel = new VideoModel();
            ArrayList<TblVideosBeans> videobeans = videomodel.select();
        %>

        <%
            for (TblVideosBeans video : videobeans) {%>
            
            <iframe width="420" height="345" src="<%=video.getLink()%>">
            </iframe>
            http://www.youtube.com/embed/W7qWa52k-nE
            <iframe src="https://www.youtube.com/embed/watch?v=YC1iwSCPNbs"
   width="560" height="315" frameborder="0" allowfullscreen></iframe>
        link : <%= video.getLink()%><br>
    time: <%= video.getDateTime()%><br>
        video : <%= video.getVideoId()%><br>
    serial : <%= video.getSerialNo()%><br>
   
        <%
            }
        %>
        
        
    </body>
</html>
