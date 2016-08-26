/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kagoyume;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.ItemDataBeans;
import net.arnx.jsonic.JSON;


/**
 * JSONテキストをパース(解析)
 *
 * @author tomoyoasai
 */

class JsonicDecode {
    
    //JsonからPojoへ変換,parse(解析)
    Map<String, Map<String, Object>> json;
    String jsonText = "";
    
    public JsonicDecode(String resultdata){
        this.jsonText = resultdata;
        json = JSON.decode(jsonText);
    }
    
    //検索結果数
    public int getTotalResult(){
        System.out.println(json);
        return Integer.valueOf(json.get("ResultSet").get("totalResultsAvailable").toString());              
    }
    
    //商品情報をリストitemListに格納
    public List getItemSearch(){
    List<ItemDataBeans> itemList = new ArrayList<>();
    
    String rs = (String)json.get("ResultSet").get("totalResultsReturned").toString();
    
    
    for(int i=0; i < Integer.parseInt(rs); i++) {
    ItemDataBeans item = new ItemDataBeans();
    
    String num = String.valueOf(i);
    
    @SuppressWarnings("unchecked")
    Map<String, Object> result = ((Map<String, Object>)((Map<String, Map<String, Object>>)json.get("ResultSet").get("0")).get("Result").get(num));
    System.out.println(result.get("Name").toString());
    String name = result.get("Name").toString();
    System.out.println(name);
    @SuppressWarnings("unchecked")
    String image = ((Map<String, Object>)result.get("Image")).get("Medium").toString();
    @SuppressWarnings("unchecked")
    int price = Integer.parseInt(((Map<String, Object>)result.get("Price")).get("_value").toString());                
    @SuppressWarnings("unchecked")
    String itemCode = result.get("Code").toString();
    System.out.println(itemCode);
    @SuppressWarnings("unchecked")
    String description = result.get("Description").toString();
    @SuppressWarnings("unchecked")
    double reviewrate = Double.parseDouble(((Map<String,Object>)result.get("Review")).get("Rate").toString());
    @SuppressWarnings("unchecked")
    int reviewcount = Integer.parseInt(((Map<String,Object>)result.get("Review")).get("Count").toString());
    
        item.setName(name);
        item.setImage(image);
        item.setPrice(price);
        item.setItemCode(itemCode);
        item.setDescription(description);
        item.setReviewrate(reviewrate);
        item.setReviewcount(reviewcount);
        
        itemList.add(item);
        System.out.println(itemList);
    }
        return itemList;
    }
    
    
}
    
