<%-- 
    Document   : addNews
    Created on : 3 Sep, 2019, 9:25:21 AM
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

        <form method="post" action="NewsController" enctype="multipart/form-data">

            <input type="text" name="title" placeholder="enter title">
            <textarea type="text" name="content" placeholder="enter content"></textarea>
            <input type="text" name="description" placeholder="enter description">
            <input type="text" name="keywords" placeholder="enter keywords">
            <input type="file" name="image" accept="image/*"><br>
            <input type="text" name="category" placeholder="Category"/>
            <input type="hidden" name="postedBy" value="abcxyz" />
            <input type="submit" value="enter"> 
        </form>

    </body>
</html>
