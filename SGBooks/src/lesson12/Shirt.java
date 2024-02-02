/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author pierr
 */
public class Shirt extends Clothing {
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
    public void display() {
//        super.display();
        System.out.println("Fit is " + fit);
    }

    @Override
    public void setPrice(double price) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
