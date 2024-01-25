/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author pierr
 */
public class Shirt {
    
    public Shirt() {
        System.out.println("In shirt Constructor");
        description = "-description required";
        colorCode = 'U';
        price = 0.0;
    }
    
    public String description;
    public char colorCode;
    public double price;
    
    public void display() {
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: R" + price);
    }
    
}
