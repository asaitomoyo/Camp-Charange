<%-- 
    Document   : item
    Created on : 2016/08/16, 17:21:11
    Author     : tomoyoasai
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.ItemDataBeans"%>
<%@page import="model.KagoyumeHelper"%>
<%@page import="model.UserDataBeans"%>
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
        <title>商品詳細ページ</title>
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
    <form action="Add" method="GET">
        <table border="1" class="list">
           
        検索キーワード<%=session.getAttribute("query")%> 
        検索結果数:<%=session.getAttribute("totalResult")%>
        <br><br>
          
            <tr>  
            <% for (int i = 0; i< itemList.size();i++) { %>
                <th>選択</th>
                <th>サムネイル</th>
                <th>商品名</th>
                <th>価格</th>
            </tr>
            <tr>
                <td><input type = "checkbox" name="<%= itemList.get(i).getName()%>" value="<%= itemList.get(i).getItemCode()%>"></td>
                <td><img src=<%= itemList.get(i).getImage() %>/></td>
                <td><a href="Item?code=<%= itemList.get(i).getItemCode() %>"><%= itemList.get(i).getName()%></a></td>
                <td><%= itemList.get(i).getPrice() %> 円</td>
                <td><%= itemList.get(i).getDescription() %> </td>
                <td><%= itemList.get(i).getReviewrate() %> </td>
                <td><%= itemList.get(i).getReviewcount() %> </td>
            </tr>
            <% } %>
        </table>

            
            <input type="submit" name="add" value="カートに追加する">
        </form>
        <br><br>
        <%=kh.top()%>
        
    </body>
</html>
