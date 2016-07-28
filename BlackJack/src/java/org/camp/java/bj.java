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

/**
 *
 * @author tomoyoasai
 */
public class bj extends HttpServlet {

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
            out.println("<title>Servlet bj</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet bj at " + request.getContextPath() + "</h1>");
            
            Delear d = new Delear();
            User u = new User();
            
            //2枚をランダムに配る
            d.setCards(d.deal());
            u.setCards(d.deal());
            System.out.println("deal" +d.deal());
            
            //trueならヒットを繰り返す
            while(d.checkSum() == true){
                d.setCards(d.hit());
                
                if(d.checkSum() == false){
                    break;
                }
            }
            
            while(u.checkSum() == true){
                d.setCards(d.hit());
                if(u.checkSum() == false){
                    break;
                }
            }
         System.out.println(d.hit());
            
            out.println("Delarの数は"+d.open());
            out.println("Userの数は"+u.open());
            
        if(u.open() > 21){
            out.print("あなたの負け");
                
        }else if(d.open()>21){
            out.print("あなたの勝ち");
        }else if(d.open()>u.open()){
            out.print("あなたの負け");
            
        }else if(d.open()<u.open()){
            out.print("あなたの勝ち");
            
        }else{
            out.print("引き分け");
        }
            
//            勝敗
//                            int lastD = d.open();
//            int lastU = u.open();
//            System.out.println(lastD);
//            System.out.println(lastU);
//            
//            if( lastD<21 &&lastU <21 && lastD == lastU ){
//                System.out.println("引き分け");
//            }else if(lastD<21 &&lastU<21 && lastD>lastU ){
//                System.out.print("あなたの負け");
//            }else if(lastD<21 &&lastU<21 && lastD<lastU) {
//                System.out.println("あなたの勝ち");
//            }
            
                    
                    
            
            out.println("</body>");
            out.println("</html>");
        }finally{
            
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
