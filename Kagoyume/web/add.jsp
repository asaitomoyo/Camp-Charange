<%-- 
    Document   : add
    Created on : 2016/08/24, 5:51:57
    Author     : tomoyoasai
--%>
<%@page import="model.UserDataBeans"%>
<%@page import="model.KagoyumeHelper"%>
<%
    HttpSession hs = request.getSession();
    KagoyumeHelper kh = KagoyumeHelper.getInstance();

    //ログインチェック
    boolean login = false;
    UserDataBeans udb = (UserDataBeans) hs.getAttribute("loginResult");
    if (udb != null) {
        login = true;
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>カートに追加ページ</title>
    </head>
    <body>
        <% if(login){ %>
            <%--ログイン済みの場合--%>
            <p>ようこそ<a href="MyData"><%=udb.getName()%></a>さん！</p>      
            <%=kh.logout()%><br>
            <%=kh.cart()%><br>
            <%--ログインしていない場合--%>
        <% }else{ %>
            <%= kh.login()%><br>
        <% }%>
        
        カートに追加しました。
        <br><br>
        
        <%= kh.top() %>
    </body>
</html>
