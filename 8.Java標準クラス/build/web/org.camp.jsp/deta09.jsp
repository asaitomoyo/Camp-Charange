<%-- 
    Document   : deta09
    Created on : 2016/07/28, 5:44:29
    Author     : tomoyoasai
--%>

<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.File"%>
<%@page import="java.io.FileReader"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%//９．ファイルから自己紹介を読み出し、表示してください。
            File txt = new File("/Users/tomoyoasai/NetBeansProjects/JavaStandard/web/org.camp.jsp/text.txt");//同じ階層にあるファイルをオープン
            FileReader fr = new FileReader(txt);//読み込みモードでオブジェクト生成
            BufferedReader br = new BufferedReader(fr);//読み込み用にバッファリング(高速化)
            
            //1行ずつ連続で読み込む
            String str;
            while((str = br.readLine()) != null){
               out.print(str);
            }
            
            br.close();
            

            %>
    </body>
</html>
