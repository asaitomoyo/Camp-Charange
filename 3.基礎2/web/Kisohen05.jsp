<%-- 
    Document   : Kisohen05
    Created on : 2016/07/28, 20:39:16
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
    //課題.5 for文を利用して、0から100を全部足す処理を実現してください。
    
        int num = 0;
        for(int i=0; i<100; i++){
            num = i +(num + 1);  

         out.print(num+"<br>");

        }
    %>
    </body>
</html>
