<%-- 
    Document   : 01
    Created on : 2016/07/07, 13:30:24
    Author     : tomoyoasai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //課題1.
    String talk = "Hello world.";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%=talk %><br>
        
        <% 
//課題2.
            out.print("groove"+"-"+"gear");
        %><br>
            
            <%
//課題3.
            out.print("浅井朋代です。");
            %><br>
            
            <%
//課題4&5.
            int num1 = 7;
            final int num2 = 3;
            int plus= num1 + num2;
            out.print(num1+"+"+num2+"は、"+plus+"です。");
            int minus = num1 - num2;
            out.print(num1+"-"+num2+"は、"+minus+"です。");
            int kake = num1 * num2;
            out.print(num1+"×"+num2+"は、"+kake+"です。");
            int wari = num1 / num2;
            int amari = num1 % num2;
            out.print(num1+"÷"+num2+"は、"+wari+"余り"+amari+"です。");
            
            
            %><br>
            
//課題6.
<%
    int a = 3;
    if (a == 1){
        out.print("1です。");
    }else if(a == 2){
        out.print("プログラミングキャンプ！");
    }else{
        out.print("その他です！");
    }

%>
    </body>
</html>
