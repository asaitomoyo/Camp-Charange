<%-- 
    Document   : Kisohen01
    Created on : 2016/07/28, 20:30:05
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

        String talk = "Javeプログラミング基礎学習2 課題基礎編";
           out.print(talk);

    %><br>
    <%
        talk = "課題";
        out.print(talk+"1");     

    %>

        
<%/*課題１．switch文を利用して、以下の処理を実現してください。
    値が1なら「one」、値が2なら「two」、それ以外は「想定外」と表示する処理*/

        int num = 0; String message ="";

        switch(num){
            case 1:
                message =("one");
                break;
            case 2:
                message =("two");
                break;
            default:
                message =("想定外");
                break;
        }
        out.println(message);

    %>
    </body>
</html>
