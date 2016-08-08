/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.java;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//データベース操作に必要なクラスが定義されているjava.sql名前空間以下のクラスimport
import java.sql.*;

/**
 *
 * @author tomoyoasai
 */
public class kadai05 extends HttpServlet {

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
            PreparedStatement db_st= null;
            ResultSet db_data = null;
            
            try
            {
                //ライブラリに登録した、MySQL用ドライバーを利用可能にします。
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                /*DriverManagerのgetConnectionメソッドを利用し、Connectionクラスのインスタンスを取得します。getConnectionメソッドへ渡す引数の内容は、下記になります。
                    第一引数
                      jdbc:DBの種類://ホスト名:ポート番号/DB名
                    第二引数
                      アカウント名
                    第三引数
                      パスワード*/
                db_con =DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","root","root");
                //nameに「茂」を含む情報を取得し、画面に取得した情報を表示してください
                //データを取得
                db_st= db_con.prepareStatement("SELECT*FROM profiles WHERE name like '%茂%';");
               
                
                db_data = db_st.executeQuery();
                while(db_data.next()){
                    int id =db_data.getInt("profilesID");
                    out.print(id);
                    String name =db_data.getString("name");
                    out.println(name);
                    String tell =db_data.getString("tell");
                    out.println(tell);
                    int age =db_data.getInt("age");
                    out.println(age);
                    int birthday =db_data.getInt("birthday");
                    out.println(birthday);
                    out.println("<br>");
                }
                        
                db_con.close();//DBへの操作が終わったら、closeメソッドを利用し、切断
                db_st.close();
                db_data.close();
                
            }catch (SQLException e_sql){
                out.println("接続時にエラーが発生しました。"+e_sql.toString());
            }catch (Exception e){
                out.println("接続時にエラーが発生しました。"+e.toString());
            }finally {
                if (db_con != null) {
                    try{
                    db_con.close();
                }catch (Exception e_con) {
                    System.out.println(e_con.getMessage());
                    
                }
                
            }
            }    
                
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kadai01</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet kadai01 at " + request.getContextPath() + "</h1>");
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
