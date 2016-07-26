<%-- 
    Document   : 01
    Created on : 2016/07/07, 13:30:24
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
<%  //課題1.「Hello world.」を表示してください。
    
    String talk = "Hello world.";
    
%>
        <%=talk %><br>
        
<%  //課題2.「groove」「-」「gear」の３つの文字列を連結して表示してください。

            out.print("groove"+"-"+"gear");
        
%><br>
            
            
<%  //課題3.自分の自己紹介を作成してみてください。

            out.print("浅井朋代です。");
            
%><br>
            
    
<%  /*課題4&5.
    定数と変数を宣言し、それぞれに数値を入れて四則演算を行ってください。
    四則演算の結果をそれぞれ表示してください。*/
            
            //変数num 定数(変数名は大文字で) NUM宣言
            int num = 7;
            final int NUM = 3;
            
            //変数 plusにnum+NUMを代入
            int plus= num + NUM;
            //文字データには""をつける。変数と文字列は +(演算子)を使い連結させる。
            out.print(num+"+"+NUM+"は、"+plus+"です。");
            
            int minus = num - NUM;
            out.print(num+"-"+NUM+"は、"+minus+"です。");
            int kake = num * NUM;
            out.print(num+"×"+ NUM+"は、"+kake+"です。");
            int wari = num / NUM;
            int amari = num % NUM;
            out.print(num+"÷"+NUM+"は、"+wari+"余り"+amari+"です。");
            
            out.print(3+4);
            out.print(5*7);
%><br>
            
        

<%  /*課題6.
    変数を宣言し、その変数の中身によって以下の表示を行ってください。
    ⇒値が 1 なら「１です！」
    ⇒値が 2 なら「プログラミングキャンプ！」
    ⇒それ以外なら「その他です！」*/

            int number = 3;
            
            if (number == 1){
                out.print("1です。");
            }else if(number == 2){
                out.print("プログラミングキャンプ！");
            }else{
                out.print("その他です！");
            }
            
%>
    </body>
</html>
