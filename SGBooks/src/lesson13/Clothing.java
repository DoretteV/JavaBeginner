/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

import lesson12.*;

/**
 *
 * @author pierr
 */
public abstract class Clothing {

    private int itemId = 0;
    private double price;
    private char colorCode = 'U';
    private String desc = "-description required";

    public Clothing(int itemId, String desc, double price, char colorCode) {
        this.itemId = itemId;
        this.desc = desc;
        this.price = price;
        this.colorCode = colorCode;
    }

    /**
     * @return the price
     */
    public abstract double getPrice();
    

    /**
     * @param price the price to set
     */
    public void setPrice(double price){
        this.price = price;
    }

    /**
     * @return the itemId
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the colorCode
     */
    public char getColorCode() {
        return colorCode;
    }

    /**
     * @param colorCode the colorCode to set
     */
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public abstract void display();
 
}
