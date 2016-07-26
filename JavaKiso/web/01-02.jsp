<%-- 
    Document   : 01-02.jsp
    Created on : 2016/07/10, 2:16:46
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
<%/*応用編 課題７.クエリストリング(情報を送る)を利用して、以下の処理を実現してください。
    スーパーのレジでレシートを作る仕組みを作成します。
    クエリストリングで総額・個数・商品種別を受け取って処理します。

    ①商品種別は、３つ。１：雑貨、２：生鮮食品、３：その他 商品種別を表示してください。
    ②総額と個数から１個当たりの値段を算出してください。
    総額と１個当たりの値段を表示してください。*/
%>    
<%  //クエリストリング(情報を送る)
    String classification = request.getParameter("classification");
    String total = request.getParameter("total");
    String piece = request.getParameter("piece");
    
    //文字列→int型に変換
    int finalClassification = Integer.parseInt(classification);
    int finalTotal = Integer.parseInt(total);
    int finalPiece  = Integer.parseInt(piece);

    out.print("商品種別:");
    out.print(finalClassification + "<br>");    
    
    int perPrice = 0;
    perPrice =  finalTotal / finalPiece ;
    
    out.print("１個当たりの値段:");
    out.print(perPrice + "<br>");
    
    //③3000円以上購入で4%、5000円以上購入で5%のポイントが付きます。
    //購入額に応じたポイントの表示を行ってください。
    
    out.print("ポイント数:");
    
    double point = 0;
    
    if (finalTotal >= 3000){
        point = finalTotal * 0.04 ;  
        out.println (point);
        
    }else if (finalTotal >= 5000) {
        point = finalTotal * 0.05 ;
        out.print (point);
        
    } else {
    }
%>
<%
    //クエリストリング
    //http://localhost:8084/javaKiso/01-02.jsp?classification=3&total=10000&piece=5
%>
        
    </body>
</html>
