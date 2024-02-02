/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author pierr
 */
public class TestOverriding {
    public static void main(String[] args) {
        Shirt myShirt = new Shirt('M', 1, "Shirt", 200.99, 'R');
        myShirt.display();
        
        Trousers myTrousers = new Trousers('M', 'F', 1, "Shirt", 200.99, 'R');
        myTrousers.display();
    }
    
}
