/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomoyoasai
 * １．Humanという抽象クラスを作成し、以下を実装してください。
　　・openというabstractな公開メソッドを用意してください。
　　・setCardというArrayListを引数とした、abstractな公開メソッドを用意してください。
　　・checkSumというabstractな公開メソッドを用意してください。
　　・myCardsというArrayListの変数を用意してください。
  * ２．１で作成した抽象クラスを継承して、以下のクラスを作成してください。
　　・Dealerクラス
　　・Userクラス
  * 　３．まずはDealerクラスを完成させます。
　　・cardsというArrayListの変数を用意し、初期処理でこのcardsに全てのトランプを持たせてください。
　　・dealという公開メソッドを用意し、cardsからランダムで2枚のカードをArrayListにして返却してください。
　　・hitという公開メソッドを用意し、cardsからランダムで1枚のカードをArrayListにして返却してください。
　４．DealerとUser両方に必要な処理を実装し、完成させます。
　　・setCardは、ArrayListで受けたカード情報をmyCardsに追加するように実装してください。
　　・checkSumは、myCardsを確認し、まだカードが必要ならtrue、必要無ければfalseを返却するように実装してください。
　　・openは、myCardsのカードの合計値を返却するように実装してください。

　５．ブラックジャックの準備は整いました。ゲームが成り立つよう、２つのクラスを利用してコーディングしてみてください。

 */
package org.camp.java;

import java.util.ArrayList;
import java.util.Random;

abstract class Human {
    abstract public int open();
    abstract public void setCard(ArrayList[] Integer);
    abstract public boolean checkSum();
    ArrayList <Integer> myCards = new ArrayList<Integer>();
}

class Delear extends Human{
    
    ArrayList<Integer> cards = new ArrayList<Integer>();{ //cards =52
    //1-10 * 4 入れ子
        for(int j=0; j<4; j++){
            for(int i=1; i<=10; i++){
                cards.add(i);
            }
        }
    //10 ={11,12,13} 
        for(int i =0;i < 12; i++){
            cards.add(10);
        }
    }
    //ランダムで2枚のカード
    ArrayList<Integer> deal = new ArrayList();
    public ArrayList<Integer> deal(){
        for(int i = 0; i < 1; i++){    
            Random rnd = new Random();
            int ran = rnd.nextInt(cards.size());
            deal.add(cards.get(ran));  
            deal.get(i);
            System.out.println(deal.get(i));
        }
        return deal;
    }
    ArrayList<Integer>hit = new ArrayList();
    public ArrayList<Integer>hit(){
        
            
            Random rnd = new Random();
            int ran = rnd.nextInt(cards.size());
            
            hit.add(cards.get(ran));
            hit.get(0);
            
            return hit;
    }
    
//setCardは、ArrayListで受けたカード情報をmyCardsに追加
    public void setCards (ArrayList<Integer>al){
           for(int i = 0; i<al.size(); i++){
               myCards.add(al.get(i));
           }
    }
    //checkSumは、myCardsを確認し、まだカードが必要ならtrue、必要無ければfalseを返却
    public boolean checkSum(){
        
        int total = open();
        if(total < 11) {
            for(int i = 0; i < myCards.size(); i++) {
                if(myCards.get(i) == 1) {
                    myCards.set(i, 11);
                    break;
                }
            }
        }
        if(total< 16){
            return true;
        }else{
            return false;
        }
    }
      
   //・openは、myCardsのカードの合計値を返却するように実装してください。
        
    public int open(){
        int total = 0;
        for(int i = 0; i<myCards.size(); i++){
            total += myCards.get(i);      
        }
        return total;
    }

    @Override
    public void setCard(ArrayList[] Integer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



class User extends Human{
    public int open(){
        int total = 0;
        for(int i = 0; i<myCards.size(); i++){
            total += myCards.get(i);   
        }
        return total;
    }
    public void setCards (ArrayList<Integer>al){
        for(int i = 0; i<al.size(); i++){
            myCards.add(al.get(i));
        }
    }
    
    
    public boolean checkSum(){
        int total =open();
        if(total < 11) {
            for(int i = 0; i < myCards.size(); i++) {
                if(myCards.get(i) == 1) {
                    myCards.set(i, 11);
                    break;
                } 
            }       
        }
        if(total< 16){
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public void setCard(ArrayList[] Integer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
