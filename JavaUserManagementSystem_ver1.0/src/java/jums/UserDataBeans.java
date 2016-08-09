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
    private String year;
    private String month;
    private String day;
    private int type; //
    private String tell;
    private String comment;
    
    //4.insertconfirmにて、フォームの内容が未入力であっても通過してしまう場合がある。
    //これを通過させないようにし、かつどの項目が不完全なのかをわかるようにしなさい

    private boolean check1;
    private boolean check2;
    
    public boolean getCheck1(){
        if (!name.equals("") &&  tell.equals("") && comment.equals("")) {
            check1 =true;
        }
        return check1;
    }
    public void setCheck1 (boolean check){
        this.check1 =check;
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
    public String getYear() {
        return year;
    }
    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = (type);
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
