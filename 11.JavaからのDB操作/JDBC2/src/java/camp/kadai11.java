//JDBCドライバをWEB-INF/libディレクトリに配置
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//データベース操作に必要なクラスが定義されているjava.sql名前空間以下のクラスimport
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 *
 * @author tomoyoasai
 */

public class kadai11 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
         
            //データベースへの接続を管理するConnectionクラスの変数(db_con)を用意
            Connection db_con= null;
      
            //SQLの送信を行う
            PreparedStatement db_st= null;

            // 受け取るパラメータの文字コード
            request.setCharacterEncoding("UTF-8");
          
            
            //課題11:profileIDで指定したレコードの、profileID以外の要素をすべて上書きできるフォームを作成してください
            //REPLACE INTO テーブル名(フィールド名) VALUES (値) SELECT 文;

        try{
                       
            //リクエストパラメータ取得
            String txtname = request.getParameter("name");
            String txttell = request.getParameter("tell");
            String txtage = request.getParameter("age");
            String txtbirth = request.getParameter("birthday");
           
            //int型に変換 
            int agex= Integer.parseInt(txtage);
       
            DateFormat format=new SimpleDateFormat("yyyy-MM-dd"); //date型をStringに
            java.util.Date date = format.parse(txtbirth);     
            java.sql.Date sqlDate = new java.sql.Date(date.getTime()); 
            
            //ライブラリに登録した、MySQL(JDBC)用ドライバを読み込み
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            /*DriverManager(データベースへの接続準備)のgetConnectionメソッドを利用し、Connectionクラスのインスタンスを取得
            getConnectionメソッドへ渡す引数の内容は、
                "第一引数jdbc:DBの種類://ホスト名:ポート番号/DB名","第二引数アカウント名","第三引数パスワード"*/
            db_con =DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","root","root");
            
            //準備したSQLをDBに届けるprepareStatementインスタンスを取得
            db_st= db_con.prepareStatement("REPLACE INTO profiles ( name, tell, age, birthday) VALUES (?,?,?,?);");
            
            db_st.setString(1, txtname);
            db_st.setString(2, txttell);
            db_st.setInt(3, agex);
            db_st.setDate(4, sqlDate);
            
            int x = db_st.executeUpdate();//executeUpdate
                if (x != 0) {
                    out.println("登録完了！！！");
                }


            db_con.close();//DBへの操作が終わったら、closeメソッドを利用し、切断させる
            db_st.close();
        //データベースに関するエラー情報を提供
        }catch (SQLException e_sql){
            out.println("接続時にエラーが発生しました。"+e_sql.toString());
        }catch (Exception e){
            out.println("接続時にエラーが発生しました。"+e.toString());

        }finally {
            //データベース切断
          if (db_con != null) {
            try {
                db_con.close();
            }catch (Exception e_con) {
                System.out.println(e_con.getMessage());//切断失敗時の処理
            }
        }
        }

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet kadai11</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet kadai11 at " + request.getContextPath() + "</h1>");
        out.println("</body>");
        out.println("</html>");
}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}