<%-- 
    Document   : 03-01
    Created on : 2016/07/14, 14:54:45
    Author     : tomoyoasai
--%>
<%  
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%//メソッドは <%! で囲む%>
    <%!/*課題1
    自分のプロフィール(名前、生年月日、自己紹介)を3行に分けて表示するユーザー定義メソッドを作り、
    メソッドを10回呼び出して下さい*/

        //戻り値の型 メソッド名(引数, 引数, 引数 )
        String getMyName() {
            //メソッドで実行したい処理
            return "浅井朋代";         
        }
        String getMyBirth() {
            return "1988/11/26";         
        }
        String getMyIntro() {
            return "私の趣味は読書です。";         
        }
    %>
    <%  //実装したメソッドを呼び出す
        String name =getMyName();
        String birth =getMyBirth();
        String intro =getMyIntro();

        for(int i=0;i<10;i++){
             out.println(name +"<br>" +birth +"<br>" +intro +"<br><br>");
            }         
    %>

    </body>
</html>
