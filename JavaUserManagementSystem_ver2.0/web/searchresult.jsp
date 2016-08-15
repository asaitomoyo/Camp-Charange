<%@page import="java.util.ArrayList"
        import="jums.JumsHelper"
        import="jums.UserDataDTO"
        import="jums.UserDataBeans"%>
       
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserDataBeans udb = (UserDataBeans)session.getAttribute("udb");
    
    //ArrayListクラスUserDataDTO型rchkList search(searchData)検索結果
    ArrayList<UserDataDTO> rchkList = (ArrayList<UserDataDTO>)session.getAttribute("resultData");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS検索結果画面</title>
    </head>
    <body>
      
        <h1>検索結果</h1>
        <table border=1>
            <tr>
                
                <th>名前:</th>
                <th>生年</th>
                <th>種別</th>
                <th>登録日時</th>
            </tr>
            <%--ArrayListで取得したrchkListの要素数だけ--%>
            <% for(int i=0; i<rchkList.size(); i++){ %>
            <tr>
                <td><a href="ResultDetail?id=<%= rchkList.get(i).getUserID()%>&ac=<%= session.getAttribute("ac")%>"><%= rchkList.get(i).getName()%></a></td>
                <td><%= rchkList.get(i).getBirthday()%></td>
                <td><%= rchkList.get(i).getType()%></td>
                <td><%= rchkList.get(i).getNewDate()%></td>
            </tr>
            <% } %>
        </table><br>
            
            <form action="Search" method="POST">
            <input type="submit" name="no" value="検索画面に戻る">
            </form>
            
    </body>
    <%=jh.home()%>
</html>
