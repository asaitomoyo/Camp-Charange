/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import java.io.Serializable;

/**
 *3. フォームから受け取ったデータ自体(String型)を格納できるJavaBeans(UserDataBeans.java)を作成し、
 * これを利用して表示や分岐などをさせなさい
 * @author tomoyoasai
 */
public class UserDataBeans implements Serializable {
    
    private String name;
    private int year;
    private int month;
    private int day;
    private int type; //
    private String tell;
    private String comment;
    
    //4.insertconfirmにて、フォームの内容が未入力であっても通過してしまう場合がある。
    //これを通過させないようにし、かつどの項目が不完全なのかをわかるようにしなさい

    private boolean isCheck;
    
    public boolean getCheck(){
        if (!"".equals(name) && !"".equals(tell) && !"".equals(comment)) { //""でない
            if(year != 0 && month != 0 && day != 0&& type != 0){
            isCheck =true;   
            }
        }
        return isCheck;
    }
    public void setCheck (boolean check){
        this.isCheck =check;
    }

    public UserDataBeans() { }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = Integer.parseInt(year);
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = Integer.parseInt(month);
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = Integer.parseInt(day);
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**udb.setType(Integer.parseInt(type));
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = Integer.parseInt(type);
    }

    /**
     * @return the tell
     */
    public String getTell() {
        return tell;
    }

    /**
     * @param tell the tell to set
     */
    public void setTell(String tell) {
        this.tell = tell;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
