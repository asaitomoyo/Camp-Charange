<%-- 
    Document   : deta08
    Created on : 2016/07/27, 17:58:53
    Author     : tomoyoasai
--%>


<%@page import="java.io.BufferedWriter"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%//８．ファイルに自己紹介を書き出し、保存してください。
        File txt = new File("/Users/tomoyoasai/NetBeansProjects/JavaStandard/web/org.camp.jsp/text.txt");//同じ階層にあるファイルをオープン
        
        FileWriter fw = new FileWriter(txt);//上書きモードでオブジェクト生成
        
        BufferedWriter bw = new BufferedWriter(fw);//まとめて書き込む
        bw.write("浅井朋代です。");
        bw.newLine();
        bw.write("昭和63年生まれ");
        bw.newLine();
        bw.write("いて座です");
        bw.newLine();
        
        bw.close();//クローズ
        %>
            
    </body>
</html>
