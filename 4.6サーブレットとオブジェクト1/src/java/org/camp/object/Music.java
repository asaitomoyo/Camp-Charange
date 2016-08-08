/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.object;

/**
 *
 * @author tomoyoasai
 * コンストラクタ
 * 　３．以下の機能を持つクラスを作成してください。
　　　・パブリックな２つの変数
　　　・２つの変数に値を設定するパブリックなメソッド
　　　・２つの変数の中身をprintするパブリックなメソッド
 */
    class Music {
        
        public String title;
        public int num;
        
        public Music(){
            this.title ="The GoldBerg variations";
            this.num =23;
        }

        public void printData(){
        System.out.println("now playing,"+this.title+".");
        System.out.println("アルバムの"+this.num+"曲目です。");
            
        }
        
        
    }

    
