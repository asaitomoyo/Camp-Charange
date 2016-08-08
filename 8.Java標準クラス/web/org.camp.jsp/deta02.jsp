<%-- 
    Document   : deta02
    Created on : 2016/07/27, 16:23:02
    Author     : tomoyoasai
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <% //２．現在の日時を「年-月-日 時:分:秒」で表示してください。
    //Date 変数名 = new Date(); Date型で現在時取得
                    
        Date date = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
        String sdate = sdf.format(date);
        out.print(sdate);

    %> 
    </body>
</html>
