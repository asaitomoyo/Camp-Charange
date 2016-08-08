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

public class ouyou extends HttpServlet {

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
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /*②商品情報登録機能 */
                       
            Connection db_con= null;
            PreparedStatement db_st= null;
            ResultSet db_data = null;

        try{ 
            request.setCharacterEncoding("UTF-8");
            
            String txtname = request.getParameter("name");
            String txtprice = request.getParameter("price");            
            int pricex= Integer.parseInt(txtprice);
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            db_con =DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","root","root");

            db_st= db_con.prepareStatement("INSERT INTO product_info (name, price)VALUES(?,?);");

            db_st.setString(1, txtname);//準備したSQLをDBに届けるprepareStatementインスタンスを取得
            db_st.setInt(2, pricex);

            int x = db_st.executeUpdate();//executeUpdate
                if (x != 0) {
                    out.println("登録");
                }
                out.println("<br>");
            

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
        out.println("<title>Servlet kadai08</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet kadai08 at " + request.getContextPath() + "</h1>");
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