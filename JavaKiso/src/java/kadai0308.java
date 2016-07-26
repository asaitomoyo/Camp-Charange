/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tomoyoasai 先にInteger limit=2を定義しておき、課題7の処理のうち2人目(limitで定義した値の人数)までで
ループ処理を抜けるようにする
 */
public class kadai0308 extends HttpServlet {

    HashMap<String, String> profile(int id) {
        HashMap<String, String> data = new HashMap<String,String>();

        switch (id) {
            case 1:
                data.put("id", "1");
                data.put("name", "のび太");
                data.put("birth", "1964年8月7日");
                data.put("add", "日本");
                break;

            case 2:
                data.put("id", "2");
                data.put("name", "Captain America ");
                data.put("birth", "1964年8月7日");
                data.put("add", null);
                break;

            case 3:
                data.put("id", "3");
                data.put("name", "ガンジー");
                data.put("birth", "1869年10月2日");
                data.put("add", "インド");
                break;
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
            out.println("<title>Servlet kadai0308</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet kadai0308 at " + request.getContextPath() + "</h1>");

            Integer limit = 2;

            for (int i = 1; i <= 3; i++) {
                HashMap data = profile(i);
                if (data.get("name") == null) {
                    continue;
                } else {
                    out.print(data.get("name") + "<br>");
                }
                if (data.get("birth") == null) {
                    continue;
                } else {
                    out.print(data.get("birth") + "<br>");
                }
                if (data.get("add") == null) {
                } else {
                    out.print(data.get("add") + "<br>");
                }
                out.print("<br>");

                if (limit == i) {
                    break;
                }
            }

                /*  
            HashMap id = profile(3);
            out.print(id.get("name") + "<br>");
            out.print(id.get("birth") + "<br>");
            out.print(id.get("add"));
                 */
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    
