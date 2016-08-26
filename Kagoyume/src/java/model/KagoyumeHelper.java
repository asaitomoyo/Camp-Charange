/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *画面系の処理や表示を簡略化するためのヘルパークラス
 * @author tomoyoasai
 */
public class KagoyumeHelper {
        
    private final String  topURL = "top.jsp";//トップへのリンクを定数として設定
    private final String loginURL = "Login";//if
    private final String registrationURL = "Registration";
    private final String cartURL = "cart.jsp";
    
    public static KagoyumeHelper getInstance(){
        return new KagoyumeHelper();

    }
    //トップへのリンクを返却
    public String top(){
        return "<a href=\""+topURL+"\">トップへ戻る</a>";
    }
    
    //ログインへのリンクを返却
    public String login(){
        
        return "<a href=\""+loginURL+"\">ログイン</a>";
    }
    //ログアウトへのリンクを返却
    public String logout(){
        
        return "<a href=\""+topURL+"\">ログアウト</a>";
    }
    //新規登録へのリンクを返却
    public String registration(){
        return "<a href=\""+registrationURL+"\">新規登録</a>";
    }
    
        //カートへのリンクを返却
    public String cart() {
        return "<a href=\""+cartURL+"\">カート</a>";
    }
    
    //呼び出し元registrationconfirm.jsp
    //空文字だった場合にchkListにString型の"name"が入っている
    //@return output未入力の項目に対応
    public String chkinput(ArrayList<String>chkList){
        String output = "";
        for(String chk:chkList){
            if(chk.equals("name")){
                output += "名前";
            }
            if(chk.equals("password")){
                output += "パスワード";
            }
            if(chk.equals("mail")){
                output += "メールアドレス";
            }
            if(chk.equals("address")){
                output += "住所";
            }
            output += "が未入力です<br>";
        }
     return output;
    }
}
    

