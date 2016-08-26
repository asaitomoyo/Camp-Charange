<%-- 
    Document   : myupdate
    Created on : 2016/08/24, 11:05:38
    Author     : tomoyoasai
--%>

<%@page import="model.KagoyumeHelper"%>
<%@page import="model.UserDataBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("updatedata");
    KagoyumeHelper kh = KagoyumeHelper.getInstance();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ユーザー情報更新ページ</title>
    </head>
    <body>
        <p></p>>
        <form action="MyUpdateResult" method ="POST">

            <input type="text" name="name" value="<%= udb.getName()%>">
            <br><br>
            パスワード:
            <input type="text" name="password" value="<%= udb.getPassword()%>">
            <br><br>
            メールアドレス:
            <input type ="text" name="mail" value="<%= udb.getMail()%>">
            <br><br>
            住所:
            <input type="text" name="address" value="<%= udb.getAddress()%>">
            <br><br>
            
            アクセスルートチェック
            <input type="submit" name="btnSubmit" value="確認画面へ"><br>
            
            <%= kh.top() %>
        </form>
    </body>
</html>
