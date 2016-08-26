<%-- 
    Document   : search
    Created on : 2016/08/25, 12:08:56
    Author     : tomoyoasai
--%>

<%@page import="model.UserDataBeans"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.ItemDataBeans"%>
<%@page import="model.KagoyumeHelper"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    HttpSession hs = request.getSession();
    ArrayList<ItemDataBeans> itemList = (ArrayList) session.getAttribute("searchList");
    KagoyumeHelper kh = KagoyumeHelper.getInstance();
    
        //ログインチェック
    boolean login = false;
    UserDataBeans udb = (UserDataBeans) hs.getAttribute("loginResult");
    if (udb != null) {
        login = true;
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>検索結果ページ</title>
    </head>
    <body>
        <HR>
        <h1>検索結果</h1>
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
        <form action="item" method="GET">
        <table border="1" class="list">
           
        検索キーワード<%=session.getAttribute("query")%> 
        検索結果数:<%=session.getAttribute("totalResult")%>
        <br><br>
        
            <tr>  
            <% for (int i = 0; i< itemList.size();i++) { %>
                <th>サムネイル</th>
                <th>商品名</th>
                <th>価格</th>
            </tr>
            <tr>
                <td><img src=<%= itemList.get(i).getImage() %>/></td>
                <td><a href="Item?code=<%= itemList.get(i).getItemCode() %>"><%= itemList.get(i).getName()%></a></td>
                <td><%= itemList.get(i).getPrice() %> 円</td>
            </tr>
            <% } %>
        </table>
        <br>
        <%=kh.top()%>
    </body>
</html>
