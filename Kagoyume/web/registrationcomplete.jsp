<%-- 
    Document   : registrationcomplete
    Created on : 2016/08/21, 2:25:59
    Author     : tomoyoasai
--%>

<%@page import="model.KagoyumeHelper"%>
<%@page import="model.UserDataBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    UserDataBeans udb = (UserDataBeans)request.getAttribute("udb");
    KagoyumeHelper kh = KagoyumeHelper.getInstance();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="top.jsp">トップページへ戻る</a>
        <h1>新規登録結果ページ</h1>
        名前:<%= udb.getName()%><br>        
        パスワード: <%= udb.getPassword()%><br>
        メールアドレス: <%= udb.getMail()%><br>
        住所: <%= udb.getAddress()%><br><br>
        以上の内容で登録しました
    </body>
</html>
