
<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession hs = request.getSession();
    //セッションスコープからクラスのインスタンス(JavaBeans)を取得 UserDataBeans
    UserDataBeans udb = (UserDataBeans) hs.getAttribute("udb");
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
    <% if(udb.getCheck() == true){ %>
        <h1>登録確認</h1>
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日"%><br>
        種別:<%= udb.getType()%><br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="submit" name="yes" value="はい">
        </form>
    <% }else{ %>
        <h1>入力が不完全です</h1>
        
        <%if(udb.getCheck() == false){ %>
            名前の入力がありません<br>
        <% }if("".equals(udb.getName())){ %>
            生年月日の入力がありません<br>
        
        
            種別の入力がありません<br>
        
            
            電話番号の入力がありません<br>
        <% }if("".equals(udb.getTell())){ %>
            自己紹介の入力がありません<br>
        <% }if("".equals(udb.getComment())){ %>    
        }
        %>
        
    <% } %>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
            
            <%--セッションスコープからインスタンス"ac"取得--%>
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        </form>
        
        <%= JumsHelper.getInstance().home() %>
    
    </body>
</html>
