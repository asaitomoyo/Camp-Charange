<%-- 
    Document   : mydelete
    Created on : 2016/08/24, 6:38:42
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
        <title>ユーザー削除確認ページ</title>
    </head>
    <body>
        <h1>削除確認</h1>
    ID: <%= udb.getUserID()%><br>
    ユーザー名: <%= udb.getName()%><br>
    パスワード: <%= udb.getPassword()%><br>
    メールアドレス: <%= udb.getMail()%><br>
    住所: <%= udb.getAddress()%><br>
    登録日時: <%= udb.getNewDate()%><br>
    削除フラグ: <%= udb.getDeleteFlg()%><br>
    <br>
    このユーザーをマジで削除しますか？<br>
    <br>
    <a href="MyDeleteResult?id=<%= udb.getUserID()%>&ac=<%=hs.getAttribute("ac")%>">はい</a>　
    <a href="top.jsp">いいえ</a>
    </body>
</html>
