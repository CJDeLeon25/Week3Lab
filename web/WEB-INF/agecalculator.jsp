<%-- 
    Document   : agecalculator
    Created on : 25-Sep-2020, 10:29:32 AM
    Author     : 798676
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action ="agecalculator" method ="post">
            <input type ="number" value ="${age}" name ="age">
            <input type ="submit" value ="Age next birthday">
            <p>${text}</p>
        </form>
    </body>
</html>
