<%-- 
    Document   : deta06
    Created on : 2016/07/27, 17:39:28
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
        <%//６．自分のメールアドレスの「@」以降の文字を取得して、表示してください。
        // 部分文字列の取得
        String bubun = "myocoym@gmail.com";
        out.print(bubun.substring(7));
        
        %>
    </body>
</html>
