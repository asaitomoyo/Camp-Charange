/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//
import java.util.Date;
//ランダム
import java.util.Random;
//JSPを呼び出す
import javax.servlet.RequestDispatcher;
//作成したJavaBeans
import org.camp.servlet.ResultData;

/**
 *
 * @author tomoyoasai
 */
public class FortuneTelling extends HttpServlet {

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
            
            //Javaプログラミング サーブレットクラス
            //占いシステムを作成(p.94)
            
            //String型の配列 初期化{大吉•中吉•小吉•吉•半吉•末吉•凶•小凶•半凶•末凶•大凶}
            String luckList[] = {"大吉","中吉","小吉","吉","半吉","末吉","凶","小凶","半凶","末凶","大凶"}; 
            //乱数:random クラス(java.util.Random;)のインスタンス生成
            //インスタンス: new クラス名();
            Random rand = new Random();
            //nextIntメソッドで乱数取得
            //運勢が入った配列の要素数を渡す事で、生成される乱数の範囲を限定。
            int index = rand.nextInt(luckList.length);
            
            //サーブレットクラスとJSPの連携
            //リクエストスコープへ結果を設定
            
            //ResultDataのインスタンスを生成
            ResultData data = new ResultData();
            //ResultDataクラスのsetterを利用
            //実施日付と運勢を記録
            data.setD(new Date());
            data.setLuck(luckList[index]);
            //占い結果をリクエストスコープに登録
            request.setAttrlbute("DATA",data);
            //ServletクラスからJSPへ処理を移動
            //RequestDispatcherのforwardメソッドを利用
            RequestDispatcher rd = request.getRequestDispatcher(result);
            rd.forward(request, responce);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>今日の占い</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>今日の占い</h1>");
            //運勢が入った配列の乱数番目に入っている要素を画面に表示
            out.println("<p>今日のあなたの運勢は•••"+luckList[index]+"</p>");
            
    
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
