<%-- 
    Document   : error
    Created on : 2016/08/17, 16:58:10
    Author     : tomoyoasai
--%>

<%@page import="model.KagoyumeHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error</title>
    </head>
    <body>
        エラーが発生しました。以下の項目を確認してください。<br>
        <%=request.getAttribute("error")%>
        <br><br>
        <%=KagoyumeHelper.getInstance().top()%>
    </body>
</html>
