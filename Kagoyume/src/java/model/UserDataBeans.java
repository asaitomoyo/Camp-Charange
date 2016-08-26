/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author tomoyoasai
 */
public class UserDataBeans implements Serializable{
    
    //user_tテーブル
    private int userID;
    private String name;
    private String password;
    private String mail;
    private String address;
    private int total;
    private Timestamp newDate;
    private int deleteFlg;
    
//    //buy_tテーブル
//    private int buyID;
//    private int buyTotal;
//    private int type;
//    private Timestamp buyData;
    
    public UserDataBeans(){
        this.userID = 0;
        this.name = "";
        this.password = "";
        this.mail = "";
        this.address = "";
        this.total = 0;
        this.newDate = null;
        this.deleteFlg = 0;
//        
//        this.buyID = 0;
//        this.buyTotal = 0;
//        this.type = 0;
//        this.buyData = null;
    }
    
    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        if(userID.equals("")) {
            this.userID = 0;
        }else {
            this.userID = Integer.parseInt(userID);
        }
    }

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
        //空文字(未入力)の場合、空文字をセット
        if(name.trim().length()==0){
            this.name = "";
        }else{
            this.name = name;
        }
}

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        if(password.trim().length()==0){
            this.password = "";
        }else{
            this.password = password;
        }   
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        if(mail.trim().length()==0){
            this.mail = "";
        }else{
            this.mail = mail;
        }
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        if(address.trim().length()==0){
            this.address = "";
        }else{
            this.address = address;
        }
    }
    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        if(total.equals("")) {
            this.total = 0;
        }else {
            this.total = Integer.parseInt(total);
        }
    }

    /**
     * @return the newDate
     */
    public Timestamp getNewDate() {
        return newDate;
    }

    /**
     * @param newDate the newDate to set
     */
    public void setNewDate(Timestamp newDate) {
        this.newDate = newDate;
    }
    
    /**
     * @return the deleteFlg
     */
    public int getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * @param deleteFlg the deleteFlg to set
     */
    public void setDeleteFlg(String deleteFlg) {
        if(deleteFlg.equals("")) {
            this.deleteFlg = 0;
        }else {
            this.deleteFlg = Integer.parseInt(deleteFlg);
        }
    }

    
    public ArrayList<String>chkLogin(){
        ArrayList<String>chkList = new ArrayList<String>();
        if(this.name.equals("")){
            chkList.add("name");
        }
        if(this.password.equals("")){
            chkList.add("password");
        }
        return chkList;
    }
    
    //呼び出し元 registrationconfirm.jsp
    //ArrayList<String> chkList = udb.chkproperties();
    
    public ArrayList<String> chkproperties(){
        ArrayList<String>chkList = new ArrayList<String>();
              
        if(this.name.equals("")){
            chkList.add("name");
        }
        if(this.password.equals("")){
            chkList.add("password");
        }
        if(this.mail.equals("")){
            chkList.add("mail");
        }
        if(this.address.equals("")){
            chkList.add("address");
        }
        return chkList;
    }
    
    
    public void UDB2DTOMapping(UserDataDTO udd){
        udd.setUserID(this.userID);        
        udd.setName(this.name);
        udd.setPassword(this.password);
        udd.setMail(this.mail);
        udd.setAddress(this.address);
        udd.setTotal(this.total);
        udd.setDeleteFlg(this.deleteFlg);
    }
    
    public void DTO2UDBMapping(UserDataDTO udd){
        //int型をString型に変換
        String UserID = String.valueOf(udd.getUserID());
        String Total = String.valueOf(udd.getTotal());
        String DeleteFlg = String.valueOf(udd.getDeleteFlg());
        
        this.setUserID(UserID);
        this.setMail(udd.getMail());
        this.setPassword(udd.getPassword());
        this.setName(udd.getName());       
        this.setAddress(udd.getAddress());
        this.setTotal(Total);
        this.setDeleteFlg(DeleteFlg);
        this.setNewDate((Timestamp) udd.getNewDate());     
    }
}
