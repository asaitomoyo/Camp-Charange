package jums;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hayashi-s
 */
public class DeleteResult extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        try {
            request.setCharacterEncoding("UTF-8");//リクエストパラメータの文字コードをUTF-8に変更
            //アクセスルートチェック
            String accesschk = request.getParameter("ac");
            if(accesschk == null || (Integer)session.getAttribute("ac")!=Integer.parseInt(accesschk)){
            throw new Exception("不正なアクセスです");
            }
            
            UserDataDTO udd =(UserDataDTO)session.getAttribute("resultData");
            
            //DTOオブジェクトにIDをセット
            UserDataDTO deleteData = (UserDataDTO)session.getAttribute("resultData");
            deleteData.setUserID(udd.getUserID());
            
            //DBへデータの削除処理
            UserDataDAO.getInstance().delete(deleteData);
            
            //成功したのでセッションの値を削除
            session.invalidate();
            
            //結果画面での表示用に入力パラメータ―をリクエストパラメータとして保持
            request.setAttribute("deleteData", deleteData);
            
            
            request.getRequestDispatcher("/deleatresult.jsp").forward(request, response);
            
        }catch(Exception e){
        //何らかの理由で失敗したらエラーページにエラー文を渡して表示。想定は不正なアクセスとDBエラー
        request.setAttribute("error", e.getMessage());
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
