/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author pierr
 */
public class Clothing {

//    private int itemId = 0;
    private double price;
//    private char colorCode = 'U';
//    private String desc = "-description required";

    public Clothing(double price) {
//        this.itemId = itemId;
//        this.desc = desc;
        this.price = price;
//        this.colorCode = colorCode;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

}
