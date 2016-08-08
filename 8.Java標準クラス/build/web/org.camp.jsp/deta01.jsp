<%-- 
    Document   : deta01
    Created on : 2016/07/27, 16:16:58
    Author     : tomoyoasai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Java標準クラス</h1>
    
    <%//１．2016年1月1日 0時0分0秒のタイムスタンプを作成し、表示してください。
     //timestamp型(1454252400069) //表示 out.print(date.getTime()) 
        
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 1, 1, 0, 0, 0);
        Date calpast = cal.getTime();
        out.println(calpast.getTime());
        
        
    %>
    </body>
</html>
