<%-- 
    Document   : Kisohen02
    Created on : 2016/07/28, 20:36:05
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
        out.print("課題"+"2");
    //値が"A"なら「英語」、値が"あ"なら「日本語」、それ以外は何も表示しない処理
    %>

    <%

        String language = "A";
        String message ="";

        switch(language){
            case "A":
                message = "英語";
                break;
            case "あ":
                message = "日本語";
                break;
        }
        out.print(message);

    %>

    </body>
</html>
