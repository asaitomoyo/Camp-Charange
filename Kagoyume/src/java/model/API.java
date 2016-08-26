/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import kagoyume.JsonicDecode;

/**
 *
 * @author tomoyoasai
 */
public class API {
            String APP_ID = "dj0zaiZpPWY4VHh5anF5ME1NYSZzPWNvbnN1bWVyc2VjcmV0Jng9NTM-";
    String BASE_URL ="http://shopping.yahooapis.jp/ShoppingWebService/V1/json/itemLookup";   

//    HttpSession session = request.getSession();
//    ItemDataBeans idb = new ItemDataBeans();

    public ArrayList searchByID(ArreyList<ItemDataBeans> itemcode) throws MalformedURLException, UnsupportedEncodingException, ProtocolException, IOException{
        
        //f(request.getParameter("itemcode") == null) {}
            //Stringitemcode = (String)request.getParameter("itemcode");

        String encodeItemCode= URLEncoder.encode(itemcode, "UTF-8");

        URL url = new URL(BASE_URL+"?appid="+APP_ID+"&itemcode="+encodeItemCode);

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
        
        
        
        
    }
    return 
}       

