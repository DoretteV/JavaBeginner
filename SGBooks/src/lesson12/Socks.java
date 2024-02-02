/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author pierr
 */
public class Socks extends Clothing{
    public Socks(int itemId, String desc, double price, char colorCode) {
        super(itemId, desc, price, colorCode);
    }


    @Override
    public double getPrice() {
        return 0;
    }
    
    @Override
    public void display(){
        
    }
    
}
