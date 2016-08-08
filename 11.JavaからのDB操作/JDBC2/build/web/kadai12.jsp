<%-- 
    Document   : kadai12
    Created on : 2016/08/04, 14:43:38
    Author     : tomoyoasai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>課題12:検索用のフォームを用意し、名前、年齢、誕生日を使った複合検索ができるようにしてください。<br></h1>
    <form action="kadai12" method="post">

    名前：<input type="text" name="name" value="田中正"><br>
    年齢：<input type="text" name="age" value="50"><br>
    誕生日：<input type="text" name="birthday" value="2000-03-20"><br>
    <input type="submit" value="検索"><br>
    </form>
    </body>
</html>
