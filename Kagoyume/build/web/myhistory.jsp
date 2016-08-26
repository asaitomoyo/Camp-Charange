<%-- 
    Document   : myhistory
    Created on : 2016/08/24, 11:13:13
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
        <title>購入履歴ページ</title>
    </head>
    <body>
        <h1>これまでの購入商品履歴</h1>
        
        
        <br><br>
        <%= kh.top() %>
    </body>
</html>
