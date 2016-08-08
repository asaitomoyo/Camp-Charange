<%-- 
    Document   : deta03
    Created on : 2016/07/27, 16:28:37
    Author     : tomoyoasai
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%//３．2016年11月4日 10時0分0秒のタイムスタンプを作成し,「年-月-日 時:分:秒」で表示してください。
        //    MM月は1足される
        
            Calendar cal = Calendar.getInstance();
            cal.set(2016,10,04,10,00,00);
            Date calpast = cal.getTime();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
            String sdate = sdf.format(calpast);
            out.print(sdate);

        %>
        
    </body>
</html>
