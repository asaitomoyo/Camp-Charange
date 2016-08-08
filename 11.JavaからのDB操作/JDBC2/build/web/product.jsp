<%-- 
    Document   : product
    Created on : 2016/08/04, 16:23:43
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
        <form action="ouyou" method="post">
    
            商品名：<input type="text" name="name" value="お茶"><br>
            値段：<input type="text" name="price" value="1000"><br>
            <input type="submit" value="登録"><br><br>
            
         </form>
        
        <form action="ouyou2" method="post">
            
            <input type="submit" value="商品一覧"><br>
        
        </form>
    </body>
</html>
