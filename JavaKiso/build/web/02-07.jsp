<%-- 
    Document   : 02-07
    Created on : 2016/07/11, 16:42:03
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
        
<%
    //課題7.
    //以下の順番で、要素が格納された配列を作成してください。
    //"10", "100", "soeda", "hayashi", "-20", "118", "END"
        
%>
<%@ page import="java.util.ArrayList" %>

<%

    ArrayList<String> al = new ArrayList<>();
    
    al.add("10");
    al.add("100");
    al.add("soeda");
    al.add("hayashi");
    al.add("-20");
    al.add("118");
    al.add("END");

    for(int i=0; i<al.size(); i++) {
    
    out.print(al.get(i));
    
    }
%><br>

<%

    //"soeda"を"33"に変更してください。
    
    al.set(2, "33");
    
    for(int i=0; i<7; i++) {
    
    out.print(al.get(i));
    
    }
%><br>

<%
    out.print(al.get(2));
%>
    </body>
</html>
