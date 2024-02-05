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
public class Shirt extends Clothing implements Printable , Returnable{
    
   private char fit = 'U';
   
   public Shirt(char fit, int itemId, String desc, double price, char colorCode) {
       super(itemId, desc, price, colorCode);
       this.fit = fit;
   }
   


    /**
     * @return the fit
     */
    public char getFit() {
        return fit;
    }

    /**
     * @param fit the fit to set
     */
    public void setFit(char fit) {
        this.fit = fit;

    }

    @Override
    public void setPrice(double price) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getPrice() {
        return 200.99;
    }
    @Override
    public String toString() {
        return "\nItem id is : " + getItemId() + "\nDescription is: " + getDesc() + "\nPrice is: " + getPrice() + "\nColorcode is: " + getColorCode() ;
    }

    @Override
    public void display() {
        
    }

    @Override
    public void print() {
        System.out.println("Busy printing the shirt");
    }

    @Override
    public void doReturn() {
        System.out.println("Returning item");
    }
}
