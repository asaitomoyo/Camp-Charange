<%-- 
    Document   : 03-04
    Created on : 2016/07/14, 16:31:11
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
<%!  /*課題4
課題1で定義したメソッドに追記する形として、戻り値　true(boolean)　を返却するように修正し、
メソッドの呼び出し側でtrueを受け取れたら「この処理は正しく実行できました」、
そうでないなら「正しく実行できませんでした」と表示する

    メソッドの呼び出し*/
    String getMyName() {
        return "浅井朋代";         
    }
    String getMyBirth() {
        return "1988/11/26";         
    }
    String getMyIntro() {
        return "私の趣味は読書です。";         
    }
    boolean getType(){
        return true;
    }
%>
<%  //実装したメソッドを呼び出す
    String name =getMyName();
    String birth =getMyBirth();
    String intro =getMyIntro();
    boolean type =getType();
    
    for(int i=0;i<10;i++){
         out.print(name +"<br>" +birth +"<br>" +intro +"<br><br>");
        }
    if (type == true){
        out.println("この処理は正しく実行できました");
    }else{
        out.print("正しく実行できませんでした");
    }
        

%>

%>

    </body>
</html>
