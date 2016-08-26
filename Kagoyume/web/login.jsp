<%-- 
    Document   : login
    Created on : 2016/08/19, 19:49:05
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
        <title>ログイン管理ページ</title>
    </head>
    <body>   
        
        <h1>ログイン</h1>
        <form action="Login" method="POST">
        ユーザー名:
            <input type="text" name="name">
            <br><br>
        パスワード:
            <input type="text" name="password">
            <br><br>
            //アクセスルートチェック
            <input type="submit" name="btnSubmit" value="ログイン">
        
        <h1>アカウントをお持ちでない方はこちら</h1>
        <%= kh.registration()%>
        
        <br><br>
        <%= kh.top() %>
    </body>
</html>
