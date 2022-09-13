<%-- 
    Document   : addApp
    Created on : 24 Aug, 2019, 11:18:40 AM
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
        <form method="post" action="ApkController" enctype="multipart/form-data"> 
            APK Name : <input type="text" name="name" placeholder="name"><br>
           Version: <input type="text" name="version" placeholder="version"><br>
            link: <input type="text" name="link" placeholder="Link"><br>
            <textarea name="description" placeholder="desc"></textarea><br>
            <input type="file" name="image" accept="image/*"><br>

            <input type="submit" value="insert" >
        </form>
    </body>
</html>
