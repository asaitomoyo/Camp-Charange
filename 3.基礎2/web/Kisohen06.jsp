<%-- 
    Document   : Kisohen06
    Created on : 2016/07/28, 20:39:32
    Author     : tomoyoasai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
    //課題6.
    //while文を利用して、以下の処理を実現してください。
    //1000を2で割り続け、100より小さくなったらループを抜ける処理
    
        int num =1000;
        while (num > 100){

                out.print (num +"<br>");
                num = num/2;

            }
    %>
    </body>
</html>
