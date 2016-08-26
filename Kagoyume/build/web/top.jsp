<%-- 
    Document   : top
    Created on : 2016/08/17, 17:20:20
    Author     : tomoyoasai
--%>

<%@page import="model.KagoyumeHelper"%>
<%@page import="model.UserDataBeans"%>

<%
    HttpSession hs = request.getSession();
    KagoyumeHelper kh = KagoyumeHelper.getInstance();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("loginResult");
    
    ///検索キーワードの入力チェック
    String empty = (String) request.getAttribute("empty");
    boolean reinput = false;
    if (empty != null) {
        reinput = true;
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>トップページ</title>
    </head>
    <body>
        <h1>かごいっぱいのゆめ</h1>

        <%--ログインしていない場合--%>
        <% if(hs.getAttribute("loginResult") == null){ %>
            <%= kh.login()%><br>
            <%= kh.registration()%>

        <% }else{ %>
        <%--ログイン済みの場合--%>
            <p>ようこそ<a href="MyData"><%=udb.getName()%></a>さん！</p> 
            <%=kh.logout()%>
            <%=kh.cart()%>
        <% } %>
        
        <form action="Search" method="GET">
            //アクセスルートチェック
        
            キーワード検索:<input type="text" name="query">
            <input type="submit" name="btnSubmit" value="検索">

        </form>
            <% if(reinput){ %>
            キーワードが未入力です。
            <% } %>
        
    </body>
</html>
