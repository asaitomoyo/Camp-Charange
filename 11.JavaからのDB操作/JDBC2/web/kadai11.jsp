<%-- 
    Document   : kadai11
    Created on : 2016/08/04, 14:06:28
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
        <h1>課題11:profileIDで指定したレコードの、profileID以外の要素をすべて上書きできるフォームを作成してください。<br></h1>
    <form action="kadai11" method="post">

        名前：<input type="text" name="name" value="田中正"><br>
        電話：<input type="text" name="tell" value="939-939-939"><br>
        年齢：<input type="text" name="age" value="50"><br>
        誕生日：<input type="text" name="birthday" value="2000-03-20"><br>
        <input type="submit" value="登録"><br>
    </form>
    </body>
</html>
