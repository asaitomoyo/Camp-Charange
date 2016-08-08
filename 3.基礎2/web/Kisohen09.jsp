<%-- 
    Document   : Kisohen09
    Created on : 2016/07/28, 20:47:54
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
    <%//課題9.
    //以下の順で、連想配列(map)を作成してください。
    //"1"に"AAA", "hello"に"world", "soeda"に"33", "20"に"20"        
    %>

    <%@ page import="java.util.HashMap" %>

    <%   
        HashMap<String, String> hMap = new HashMap<String, String>();

        hMap.put("1","AAA");
        hMap.put("hello","world");
        hMap.put("soeda","33");
        hMap.put("20","20");

        //拡張for文で処理
        for (HashMap.Entry<String, String> val : hMap.entrySet()) {

            // 自動で取得した要素を処理
            out.print(val.getKey());
            out.print("->");
            out.print(val.getValue());
            out.print("<br>");
        }
        %>
        
    </body>
</html>
