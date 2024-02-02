/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author pierr
 */
public class Trousers extends Clothing {
    
    private char gender;
    private char fit;
    
       public Trousers(char fit, char gender, int itemId, String desc, double price, char colorCode){
       super(itemId, desc, price, colorCode);
       this.gender = gender;
       this.fit = fit;
   }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    @Override
        public void display() {
//        super.display();
        System.out.println("Fit is " + getFit());
        System.out.println("Gender is " + gender);
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
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
