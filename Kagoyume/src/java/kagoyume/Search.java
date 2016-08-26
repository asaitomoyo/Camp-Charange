/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kagoyume;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ItemDataBeans;
import model.Log;

/**
 *
 * @author tomoyoasai
 */
public class Search extends HttpServlet {

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
   
        
        String APP_ID = "dj0zaiZpPWY4VHh5anF5ME1NYSZzPWNvbnN1bWVyc2VjcmV0Jng9NTM-";
        String BASE_URL = "http://shopping.yahooapis.jp/ShoppingWebService/V1/json/itemSearch";
        
        HttpSession session = request.getSession();
        ItemDataBeans idb = new ItemDataBeans();
        
        try{
            request.setCharacterEncoding("UTF-8");
            
            //アクセスルートチェック
            
            if(request.getParameter("query") == null) {}
            String query = (String)request.getParameter("query");
            
            //検索ワードをURLencode
            String encodeQuery = URLEncoder.encode(query, "UTF-8");
            //URL生成
            URL url = new URL(BASE_URL+"?appid="+APP_ID+"&query="+encodeQuery);
            //APIへアクセス
            HttpURLConnection urlcon = (HttpURLConnection)url.openConnection();
            urlcon.setRequestMethod("GET");
            urlcon.setInstanceFollowRedirects(false);
            urlcon.connect();

            //APIからデータの呼び出し
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
            StringBuffer responseBuffer = new StringBuffer();
            while(true){
                String line = reader.readLine();
                if( line == null ){
                    break;
                }
                responseBuffer.append(line);
                }
                reader.close();
                urlcon.disconnect();

            //呼び出したJSON型のデータを保存
            String json = responseBuffer.toString();
            
            //文字列からJSONへの変換
            JsonicDecode test = new JsonicDecode(json); 
            int totalResult= test.getTotalResult();
            //商品情報をリストitemListに格納
            List<ItemDataBeans> itemList = test.getItemSearch();

            session.setAttribute("query",query);
            session.setAttribute("totalResult",totalResult);
            session.setAttribute("searchList", itemList);
            
        //ログを記録
        Log.getInstance().logtxt("search.jspへ遷移");
            
        request.getRequestDispatcher("/search.jsp").forward(request, response);
        }catch(Exception e){
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

