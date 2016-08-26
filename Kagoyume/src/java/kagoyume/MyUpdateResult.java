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
import model.Log;
import model.UserDataBeans;
import model.UserDataDAO;
import model.UserDataDTO;

/**
 *
 * @author tomoyoasai
 */
public class MyUpdateResult extends HttpServlet {

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
        
            HttpSession session = request.getSession();
        
        try{
            request.setCharacterEncoding("UTF-8");
            
                        //アクセスルートチェック
//            String accesschk = request.getParameter("ac");
//            if (accesschk == null || (Integer) session.getAttribute("ac") != Integer.parseInt(accesschk)) {
//                throw new Exception("不正なアクセスです");
//            }
                     
             
            UserDataBeans id = (UserDataBeans)session.getAttribute("userdata");
            
            //フォームからの入力を取得して、UserJavaBeansに格納
            UserDataBeans udb = new UserDataBeans();
            udb.setName(request.getParameter("name"));
            udb.setPassword(request.getParameter("password"));
            udb.setMail(request.getParameter("mail"));
            udb.setAddress(request.getParameter("address"));       

            //DTOオブジェクトにマッピング。DB専用のパラメータに変換
            UserDataDTO updatedata = new UserDataDTO();
            udb.UDB2DTOMapping(updatedata);

            //DBへデータの更新
            UserDataDAO.getInstance().update(updatedata);

            //セッション終了
            session.invalidate();

            //表示用にリクエスト
            request.setAttribute("updatedata", updatedata);
            
            //ログを記録
            Log.getInstance().logtxt("updateresult.jspへ遷移");
            
            request.getRequestDispatcher("/updateresult.jsp").forward(request, response);
        }catch(Exception e){
            request.setAttribute("error",e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
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
