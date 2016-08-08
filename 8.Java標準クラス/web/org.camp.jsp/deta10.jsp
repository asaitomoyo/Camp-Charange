<%-- 
    Document   : deta10
    Created on : 2016/07/28, 5:47:46
    Author     : tomoyoasai
--%>

<%@page import="java.util.Scanner"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.util.Date"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
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
        <%--　１０．紹介していないJAVAの標準クラスを利用して、処理を作成してください。
            講義では紹介されていないJAVAの標準クラスはたくさん存在します。
            １つJAVAの標準クラスを選び、実際にロジックを作成してみてください。
            また、この処理を作成するに当たり、下記を必ず実装してください。

            ①処理の経過を書き込むログファイルを作成する。
            ②処理の開始、終了のタイミングで、ログファイルに開始・終了の書き込みを行う。
            ③書き込む内容は、「日時　状況（開始・終了）」の形式で書き込む。
            ④最後に、ログファイルを読み込み、その内容を表示してください。
            --%>
        <%
         File txt = new File("/Users/tomoyoasai/NetBeansProjects/JavaStandard/web/org.camp.jsp");//ログファイル指定
            FileWriter fw = new FileWriter(txt,true);//ログファイルに追加書き足し
            BufferedReader br = new BufferedReader(new FileReader(txt));//まとめて書き込む
            //開始時刻の記入
            Date start = new Date();
            Date end = new Date();
            fw.write("開始" + start);

            Scanner scanner = new Scanner(System.in);
            System.out.print("名前の入力");
            String userName = scanner.next();
            System.out.println("こんにちは" + userName);
            
            
            //ログファイルの大きさを表示
            System.out.println((int) txt.length());
            //終了日時を書き込む
            fw.write("終了"+ end );
            //ログ内容の表示
            String str =br.readLine();
            while(str != null){
               System.out.println(str);
               str = br.readLine();
            }
            //書き込みの終了
            fw.close();;
            br.close();        
        %>
    </body>
</html>
