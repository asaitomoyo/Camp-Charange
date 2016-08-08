<%-- 
    Document   : kadai09
    Created on : 2016/08/04, 11:03:54
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
        <h1>課題9:フォームからデータを挿入できる処理を構築してください。。<br></h1>
       <form action="kadai09" method="post">
           
        ID：<input type="text" name="profilesID" value="6"><br>
        名前：<input type="text" name="name" value="Name"><br>
        電話：<input type="text" name="tell" value="123-456-789"><br>
        年齢：<input type="text" name="age" value="100"><br>
        誕生日：<input type="text" name="birthday" value="1999-01-20"><br>
        <input type="submit" value="登録"><br>

       </form>
    </body>
</html>
