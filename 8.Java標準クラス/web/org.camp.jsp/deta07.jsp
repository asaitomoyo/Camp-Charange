<%-- 
    Document   : deta07
    Created on : 2016/07/27, 17:44:36
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
        <h1>Hello World!</h1>
        <%//　７．以下の文章の「I」⇒「い」に、「U」⇒「う」に入れ替える処理を作成し、結果を表示してください。
            //「きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます」
            String chikan = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
            
            out.print(chikan.replace("U","う").replace("I","い"));
            
        %>
            
    </body>
</html>
