<%-- 
    Document   : logincomplete
    Created on : 2016/08/24, 5:41:37
    Author     : tomoyoasai
--%>

<%@page import="model.UserDataBeans"%>
<%@page import="model.KagoyumeHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession hs = request.getSession();
    KagoyumeHelper kh = KagoyumeHelper.getInstance();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("loginResult");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログイン完了ページ</title>
    </head>
    <body>
        <h1>ログイン完了</h1>
        ようこそ <%= udb.getName()%> さん。<br>
        <br><br>
    <form action="Search" method="GET">
        キーワード検索：<input type="text" name="query">
        <br><br>
        <%--アクセスルートチェック--%>
        <input type="submit" name="btnSubmit" value="商品検索">
        
    </form>
        <br>
        <%=kh.logout()%>
        <%=kh.top()%>

    </body>
</html>
