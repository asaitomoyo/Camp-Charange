<%-- 
    Document   : mydeleteresult
    Created on : 2016/08/24, 6:39:41
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
        <title>ユーザー削除完了ページ</title>
    </head>
    <body>
        削除しました
        <br><br>
        <%= kh.top() %>      
    </body>
</html>