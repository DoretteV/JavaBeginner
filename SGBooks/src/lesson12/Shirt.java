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
   
   public Shirt(char fit) {
       this(15.00, fit);
   }
   
   public Shirt(double price, char fit){
       super(price);
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
    
    
}
