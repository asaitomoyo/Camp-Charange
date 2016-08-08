<%-- 
    Document   : deta05
    Created on : 2016/07/27, 17:28:38
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
        <h1>Hello World!</h1>
        <%//５．自分の氏名について、バイト数と文字数を取得して、表示してください。
            String name= "浅井朋代";
            out.print("バイト数" + name.getBytes().length);
            out.print("文字数" + name.length());
            
        %>
        
    </body>
</html>
