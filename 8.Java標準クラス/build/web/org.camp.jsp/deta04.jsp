<%-- 
    Document   : deta04
    Created on : 2016/07/27, 16:56:34
    Author     : tomoyoasai
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
        <%//４．2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。

         
            Calendar cal = Calendar.getInstance();
            cal.set(2015,11,31,23,59,59);
            Date calpast = cal.getTime();
            
            Calendar cal2 = Calendar.getInstance();
            cal2.set(2015,00,01,00,00,00);
            Date calpast2 = cal2.getTime();
           
            long january =calpast.getTime();
            long december =calpast2.getTime();

		
		out.print(january - december +"ミリ秒差");
          
        %>
            
    </body>
</html>
