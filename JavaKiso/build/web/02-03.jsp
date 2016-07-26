<%-- 
    Document   : 02-03.jsp
    Created on : 2016/07/11, 11:47:51
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

<%  /*課題.3 for文を利用して、8を20回掛ける処理を実現してください。
    
    整数を格納できる4つの型
    long  8byte
    int   4byte
    short 2byte
    byte  1byte
    */

    long num=1;
    for(int i=0; i<20; i++){
        num = num * 8;
    
        out.print(num + "<br>");
    
    }
    
%>
            
    </body>
</html>
