<%-- 
    Document   : cart
    Created on : 2016/08/24, 6:32:41
    Author     : tomoyoasai
--%>

<%@page import="model.UserDataBeans"%>
<%@page import="java.util.List"%>
<%@page import="Kagoyume.ShoppingData"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.KagoyumeHelper"%>
<%
    HttpSession hs = request.getSession();
    KagoyumeHelper kh = KagoyumeHelper.getInstance();
    List<ShoppingData> sdList= (ArrayList)hs.getAttribute("cart");
    
    //ログインチェック
    boolean login = false;
    UserDataBeans udb = (UserDataBeans) hs.getAttribute("loginResult");
    if (udb != null) {
        login = true;
    }
    
    //合計金額の初期値
    int total = 0;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>カート</title>
    </head>
    <body>
        <% if(login){ %>
            <%--ログイン済みの場合--%>
            <p>ようこそ<a href="MyData"><%=udb.getName()%></a>さん！</p>      
            <%=kh.logout()%><br>
            <%=kh.cart()%><br>
            <%--ログインしていない場合--%>
        <% }else{ %>
            <%= kh.login()%><br>
        <% }%>
        <br><br>

    <HR>
        <h1>カート</h1>
        <form action="BuyConfirm" method="POST">
        <table border="1">
            <tr>
                <th>サムネイル</th>
                <th>商品名</th>
                <th>価格</th>
            </tr>
            <% for (int i = 0; i < sdList.size(); i++) { %>
            <tr>
                <th><img src=<%= sdList.get(i).getImage() %>/></th>
                <th><a href="Item?code=<%= sdList.get(i).getCode() %>"><%=sdList.get(i).getItemName() %></a></th>
                <th><%= sdList.get(i).getPrice() %> 円</th>
                <th><a href="Cart?delete=<%=i%>">削除</a></th>
            </tr>
                <% total += sdList.get(i).getPrice(); %>
            <% } %>
        </table>
            <form action="BuyConfirm" method="POST">
            <input type="submit" name="submit" value="購入する">
        </form>
    </body>
</html>
