<%-- 
    Document   : buycomplete
    Created on : 2016/08/24, 6:25:00
    Author     : tomoyoasai
--%>

<%@page import="model.KagoyumeHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    KagoyumeHelper kh = KagoyumeHelper.getInstance();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>購入完了ページ</title>
    </head>
    <body>
        購入が完了しました
        <br><br>
        <%= kh.top() %>
    </body>
</html>
