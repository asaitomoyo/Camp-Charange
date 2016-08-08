<%-- 
    Document   : login
    Created on : 2016/08/04, 15:58:15
    Author     : tomoyoasai
　　在庫管理システムを作成します。
　　まず、DBにユーザー情報管理テーブルと、商品情報登録テーブルを作成してください。
　　①ユーザーのログイン・ログアウト機能

　　②商品情報登録機能

　　③商品一覧機能
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ouyou" method="post">
            IDとパスワードを入力してください。<br>
            ID<input type="text" name="name" value="xxxx"><br>
            password<input type="text" name="password" value="xxxx"><br>
            <input type="submit" value="ログイン"><br><br>
            
        </form>
    </body>
</html>
