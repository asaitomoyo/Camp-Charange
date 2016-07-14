<%-- 
    Document   : 02-08
    Created on : 2016/07/11, 17:53:56
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
        <form action="http://localhost:8084/javaKiso1/02-09.jsp" method="get">
            <p>
            数値：<input type="text" name="num" size="15">
            </p>
            <p>
            <input type="submit" value="送信"><input type="reset" value="リセット">
            </p>
        </form>
        
<%
//課題10.簡易素因数分解のロジックを作成します。

//クエリストリングから渡された数値を1ケタの素数で可能な限り分解し、
//元の値と素因数分解の結果を表示するようにしてください。

//2ケタ以上の素数が含まれた数値の場合は、
//「元の値　1ケタの素因数　その他」と表記して、その他　に含んでください。

%>

<%
        /*クエリストリングから渡された元の値num*/
        String num = request.getParameter("num"); 
        /*Stringからint型へ変換*/
        int org = Integer.parseInt(num);

        //素数2,3,5,7
        if (org % 2 == 0){
            out.println( org);
            out.println(2);
            org /=2;
            
        }else if(org % 3 == 0){
            out.println( org);
            out.print(3);
            org /=3;
            
        }else if(org % 5 == 0){
            out.println( org);
            out.print(5);
            org /= 5;
            
        }else if(org % 7 == 0){
            out.println( org);
            out.print(7);
            org /= 7;
        }else{
            out.print("その他");
        }
    }

%>
    </body>
</html>
