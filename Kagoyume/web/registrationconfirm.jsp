<%-- 
    Document   : registrationconfirm
    Created on : 2016/08/17, 17:03:33
    Author     : tomoyoasai
--%>

<%@page import="model.UserDataBeans"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.KagoyumeHelper" %>

<%--セッションの開始(hs), セッションから値を取り出す(udb)--%>
<%  
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("udb");
    //空文字だった場合にchkListにString型の"name"が入る
    ArrayList<String> chkList = udb.chkproperties();
    
    KagoyumeHelper kh = KagoyumeHelper.getInstance();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>新規会員登録確認ページ</title>
    </head>
    <body>
    <%--未入力項目がない 実際に出力しないのでUserDataBeansにメソッドを定義--%>
    <% if(chkList.size()==0){ %>
        <h1>登録確認</h1>
        ユーザー名:<%= udb.getName()%><br>
        パスワード:<%= udb.getPassword()%><br>
        メールアドレス:<%= udb.getMail()%><br>
        住所:<%= udb.getAddress()%><br>
    上記の内容で登録いたします。よろしいですか？
    
        <form action="RegistrationComplete" method="POST">
            <input type="hidden" name="ac" value="<%= hs.getAttribute("ac")%>">
            <input type = "submit" name="yes" value="はい">     
        </form>>
        
    <% }else{ %>
        <h1>入力が不完全です。</h1>
        <%=kh.chkinput(chkList)%>
    <% } %>
        <form action="Registration" method="POST">
            <input type = "submit" name="no" value="登録画面に戻る">
            <input type = "hidden" name="re" value="REINPUT">
        </form>
        <%=kh.top()%>
    </body>
</html>
