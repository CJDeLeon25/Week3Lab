<%-- 
    Document   : arithmeticcalculator
    Created on : 25-Sep-2020, 11:01:12 AM
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
        <h1>Arithmetic Calculator</h1>
        <form>
            First: <input type ="text" name ="first" value ="${first}"><br>
            Second: <input type ="text" name ="second" value ="${second}"><br>
            <input type ="button" value = "+">
            <input type ="button" value = "-">
            <input type ="button" value = "*">
            <input type ="button" value = "%"><br>
        </form>
            <p>
                Result: ${text}
            </p>
            <a href ="agecalculator">Age Calculator</a>
    </body>
</html>
