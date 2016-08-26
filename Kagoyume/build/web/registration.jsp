<%-- 
    Document   : registration
    Created on : 2016/08/17, 16:19:44
    Author     : tomoyoasai
--%>
<%@page import="model.KagoyumeHelper"%>
<%@page import="model.UserDataBeans"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%
    HttpSession hs =request.getSession();
    UserDataBeans udb = null;//参照を切る
    
    boolean reinput = false;
    //ルート固定、"re"の値を受け取れる場合のみ
    if(request.getParameter("re") != null && request.getParameter("re").equals("REINPUT")){
        reinput = true;
        udb =(UserDataBeans)hs.getAttribute("udb");
    }
    KagoyumeHelper kh = KagoyumeHelper.getInstance();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>新規会員登録ページ</title>
    </head>
    <body>
        <p>新規登録</p>
        <form action="RegistrationConfirm" method ="POST">
            ユーザー名:
            <input type="text" name="name" value="<%if(reinput){out.print(udb.getName());}%>">
            <br><br>
            パスワード:
            <input type="text" name="password" value="<%if(reinput){out.print(udb.getPassword());}%>">
            <br><br>
            メールアドレス:
            <input type ="text" name="mail" value="<%if(reinput){out.print(udb.getMail());}%>">
            <br><br>
            住所:
            <input type="text" name="address" value="<%if(reinput){out.print(udb.getAddress());}%>">
            <br><br>
            
            <input type="hidden" name="ac" value="<%= hs.getAttribute("ac")%>">
            <input type="submit" name="btnSubmit" value="確認画面へ"><br>
            <br><br>
            <%= kh.top() %>
        </form>
    </body>
</html>
