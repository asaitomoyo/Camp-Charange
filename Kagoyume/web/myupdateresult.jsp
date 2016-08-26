<%-- 
    Document   : myupdateresult
    Created on : 2016/08/24, 11:13:44
    Author     : tomoyoasai
--%>

<%@page import="model.UserDataBeans"%>
<%@page import="model.KagoyumeHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    KagoyumeHelper kh = KagoyumeHelper.getInstance();
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("updatedata");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ユーザー更新完了ページ</title>
    </head>
    <body>
        <h1>ユーザー情報</h1>
        ID: <%= udb.getUserID()%><br>
        ユーザー名: <%= udb.getName()%><br>
        パスワード: <%= udb.getPassword()%><br>
        メールアドレス: <%= udb.getMail()%><br>
        住所: <%= udb.getAddress()%><br>
        登録日時: <%= udb.getNewDate()%><br>
        <br>
        以上の内容で更新しました。
        <br><br>
        <%= kh.top() %>
    </body>
</html>
