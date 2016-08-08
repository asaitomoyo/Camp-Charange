<%-- 
    Document   : 03-03
    Created on : 2016/07/14, 16:31:00
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
<%!
/*課題3
引き数が3つのメソッドを定義する。
1つ目は適当な数値を、2つ目はデフォルト値が5の数値を、最後はデフォルト値がfalse(boolean)のtypeを引き数として定義する。
1つ目の引き数に2つ目の引き数を掛ける計算をするメソッドを作成し、typeがfalseの時はその値を表示、trueのときはさらに2乗して表示する。
例:Integer sample(Integer AAA, Integer BBB, boolean type) // 引数が３つのメソッド書き出し部分*/

        String getNum(Integer AAA, Integer BBB, boolean type){
            
            String ans ="";
            
            int kake = AAA * BBB;
                    
            if (type == false){
                return ans;
            }else{
                kake *= kake;
                return ans;
            }
        }
%>
<%
        String Num = getNum(2, 5, false);
        
        out.println("値は、" + Num);       
%>
        

        
    </body>
</html>
