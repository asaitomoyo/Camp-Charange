<%-- 
    Document   : mydata
    Created on : 2016/08/24, 6:37:24
    Author     : tomoyoasai
--%>

<%@page import="model.UserDataBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("userdata");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ユーザー情報閲覧ページ</title>
    </head>
    <body>
        <a href="Myhistory">購入履歴</a>
        <HR>
        <h1>ユーザー情報</h1>
        名前: <%= udb.getName()%><br>
        パスワード: <%= udb.getPassword()%><br>
        メールアドレス: <%= udb.getMail()%><br>
        住所: <%= udb.getAddress()%><br>
        登録日時：<%= udb.getNewDate() %><br>
        <br>
        <form action="MyUpdate" method="POST">
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
            <input type="submit" name="btnSubmit" value="更新">
        </form>
        <form action="MyDelete" method="POST">
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
            <input type="submit" name="btnSubmit" value="削除">
        </form>        
    </body>
</html>