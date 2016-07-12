<%-- 
    Document   : 01
    Created on : 2016/07/07, 13:30:24
    Author     : tomoyoasai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //課題1.「Hello world.」を表示してください。
    
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
//課題2.「groove」「-」「gear」の３つの文字列を連結して表示してください。

            out.print("groove"+"-"+"gear");
        
        %><br>
            
            
        <%
//課題3.自分の自己紹介を作成してみてください。

            out.print("浅井朋代です。");
            
        %><br>
            
    
        <%
//課題4&5.
//定数と変数を宣言し、それぞれに数値を入れて四則演算を行ってください。
//四則演算の結果をそれぞれ表示してください。

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
            
        

        <%
//課題6.
//変数を宣言し、その変数の中身によって以下の表示を行ってください。
//⇒値が 1 なら「１です！」
//⇒値が 2 なら「プログラミングキャンプ！」
//⇒それ以外なら「その他です！」

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
