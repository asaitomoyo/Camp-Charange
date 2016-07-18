<%-- 
    Document   : 03-05
    Created on : 2016/07/14, 16:50:53
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

<%!/*課題5
戻り値としてある人物のid(数値),名前,生年月日、住所を返却するメソッドを作成し、
受け取った後はid以外の値を表示する
*/
        int getId() {
        return 5399;         
        }
        String getName() {
            return "asai";      
        }
        String getBirth(){
            return "1988/11/26";
        }
        String getAdd() {
            return "東京";         
        }
%>
<%

        int id = getId();
        String name = getName();
        String birth =getBirth();
        String add =getAdd();
        
        
        out.println(name +birth + add);
        
%>
    </body>
</html>
