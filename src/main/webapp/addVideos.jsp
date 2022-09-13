<%-- 
    Document   : addVideos
    Created on : 24 Aug, 2019, 2:58:46 PM
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
        <h1>Add Video</h1>
        <form method="get" action="VideolinkController">
            <input type="hidden" name="action" value="insert"/>
            <input type="url" name="videolink"/>
            <input type="submit"/>
            
        </form>
        
        
    </body>
</html>
