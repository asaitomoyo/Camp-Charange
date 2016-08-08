/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.java;

/***課題5
戻り値としてある人物のid(数値),名前,生年月日、住所を返却するメソッドを作成し、
受け取った後はid以外の値を表示する
 *
 * @author tomoyoasai
 * 
 */
public class Profile {
    public static void main (String[] args){
        
        id(1);
        
        String prof = profile("のび太","1964年8月7日", "日本"); 
        
        System.out.println(prof);

    }
    
    public static int id(int id){
        return id;
    }
    public static String profile(String name, String birth, String add){
        return name + birth + add;
        
    }

}
    