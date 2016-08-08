/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 *
 * @author tomoyoasai
 */
public class kadai0306 extends HttpServlet {
    //課題6:引き数に1つのid(数値)をとり、
//3人分のプロフィール(項目は課題5参照)をあらかじめメソッド内で定義しておく。
//引き数のid値により戻り値として返却するプロフィールを誰のものにするか選択する。
//それ以降などは課題5と同じ扱いに

    HashMap<String, String> profile(int id) {
        HashMap<String, String> data = new HashMap<String, String>();

        if (id == 1) {
            data.put("id", "1");
            data.put("name", "のび太");
            data.put("birth", "1964年8月7日");
            data.put("add", "日本");

        } else if (id == 2) {
            data.put("id", "2");
            data.put("name", "Captain America ");
            data.put("birth", "1964年8月7日");
            data.put("add", "アメリカ");

        } else if (id == 3) {
            data.put("id", "3");
            data.put("name", "ガンジー");
            data.put("birth", "1869年10月2日");
            data.put("add", "インド");
        }

        return data;

    }

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kadai0306</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet kadai0306 at " + request.getContextPath() + "</h1>");

            HashMap id = profile(3);
            out.println(id.get("name") + "<br>");
            out.println(id.get("birth")+ "<br>");
            out.println(id.get("add"));

            out.println("</body>");
            out.println("</html>");
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
