/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kagoyume;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.KagoyumeHelper;
import model.Log;
import model.UserDataBeans;
import model.UserDataDAO;
import model.UserDataDTO;


/**
 *
 * @author tomoyoasai
 */
public class Login extends HttpServlet {

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
        
        //セッション開始
        HttpSession session = request.getSession();
        KagoyumeHelper kh = new  KagoyumeHelper(); 

        try{
            request.setCharacterEncoding("UTF-8");

            
            UserDataBeans udb = new UserDataBeans();
            
            if(session.getAttribute("loginResult") != null){
                kh.logout();
            }
            //フォームからの入力を取得して、UserDataBeansに格納
            udb.setName(request.getParameter("name"));
            udb.setPassword(request.getParameter("password"));
            //}
            
            //空文字の場合ログイン画面に戻る
            if(udb.chkLogin().size() != 0){
                request.setAttribute("udb", udb);
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
            
            //DTOオブジェクトにマッピング。udd DB専用のパラメータになる(DTOに保存される)
            UserDataDTO userdata = new UserDataDTO();
            udb.UDB2DTOMapping(userdata);

            //DBへデータの挿入
            UserDataDTO loginResult = UserDataDAO.getInstance().findByLogin(userdata);
                
            //表示用にBeansオビジェクトにマッピング
            //UserDataBeans udb = new UserDataBeans();
            udb.DTO2UDBMapping(loginResult);
            session.setAttribute("loginResult",udb);
            
            //ログを記録
            Log.getInstance().logtxt("logincomplete.jspへ遷移");
            request.getRequestDispatcher("/logincomplete.jsp").forward(request, response);
        
        }catch (Exception e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    //// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
