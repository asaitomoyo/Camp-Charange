/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *商品情報を持ちまわるJavaBeans
 * @author tomoyoasai
 */
public class ItemDataBeans implements Serializable{
    
    private String query;
    private String totalResult;
    private String image;
    private String name;
    private int price;
    private String itemCode;
    private String description;
    private String review;
    private double reviewrate;
    private int reviewcount;
    

    public ItemDataBeans(){
        this.query = "";
        this.totalResult = "";
        this.image = "";
        this.name = "";
        this.price = 0;
        this.itemCode = "";
        this.description = "";
        this.review = "";
        this.reviewrate = 0;
        this.reviewcount = 0;
    }

    /**
     * @return the query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query the query to set
     */
    public void setQuery(String query) {
        if(query == null){
            this.query = "";
        }else{
            this.query = query;
        }
    }

    /**
     * @return the totalResult
     */
    public String getTotalResult() {
        return totalResult;
    }

    /**
     * @param totalResult the totalResult to set
     */
    public void setTotalResult(String totalResult) {
        if(totalResult == null){
            this.totalResult = "";
        }else{
            this.totalResult = totalResult;
        }
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        if(image == null){
            this.image = "";
        }else{
            this.image = image;
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
        if(name == null){
            this.name = "";
        }else{
            this.name = name;
        }
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        if(price == 0){
            this.price = 0;
        }else{
            this.price = price;
        }
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        if(itemCode == null){
            this.itemCode = "";
        }else{
            this.itemCode = itemCode;
        }
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        if(description == null){
            this.description = "";
        }else{
            this.description = description;
        }
    }

    /**
     * @return the review
     */
    public String getReview() {
        return review;
    }

    /**
     * @param review the review to set
     */
    public void setReview(String review) {
        if(review == null){
            this.review = "";
        }else{
            this.review = review;
        }
    }

    /**
     * @return the reviewrate
     */
    public double getReviewrate() {
        return reviewrate;
    }

    /**
     * @param reviewrate the reviewrate to set
     */
    public void setReviewrate(double reviewrate) {
        this.reviewrate = reviewrate;
    }

    /**
     * @return the reviewcount
     */
    public int getReviewcount() {
        return reviewcount;
    }

    /**
     * @param reviewcount the reviewcount to set
     */
    public void setReviewcount(int reviewcount) {
        this.reviewcount = reviewcount;
    }

        
    
}
