<%-- 
    Document   : videoArticle
    Created on : 28 Aug, 2019, 5:20:55 PM
    Author     : habeel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="InsertArticleController" enctype="multipart/form-data">
            <input type="hidden" name="action" value="insert">
            <input type="hidden" value="testing" name="postedby">
            <input type="text" name="title" placeholder="enter title"><br><br>
            <textarea name="description" placeholder="enter description"> </textarea><br><br>
            <input type="text" name="category" placeholder="Category"><br><br>
            <input type="text" name="videoid" placeholder="enter videoid"><br><br>
            <input type="file" name="image" accept="image/*"><br>
            <textarea name="content" placeholder="enter content"></textarea><br><br>
            <input type="text" name="keywords" placeholder="keywords"/>
            <input type="submit" value="submit">
        </form>



    </body>
</html>
