/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

/**
 *
 * @author pierr
 */
public class TestInterface {
    public static void main(String[] args) {
//        Shirt myShirt = new Shirt('M', 1, "Shirt", 200.99, 'R');
//        myShirt.print();
//        myShirt.doReturn();

        Clothing c1 = new Trousers('M', 'F', 3, "Trousers", 250.99, 'Y');       //only access clothing
        Trousers t1 = new Trousers('M', 'F', 3, "Trousers", 250.99, 'Y');       //can access all of them
        Returnable r1 = new Trousers('M', 'F', 3, "Trousers", 250.99, 'Y');     //can only access
        
        c1.getColorCode();          //access its own method
        if(c1 instanceof Trousers) {
            ((Trousers)c1).getFit();     //it cant access method from trousers unless its cast to a trousers
        }
        
        if(c1 instanceof Trousers) {
        ((Trousers)c1).doReturn();  //it cant access method from interface unless its cast to a trousers or interface
        }
        
        t1.getFit();                //accessing its own method
        t1.getItemId();             //accessing the method from Clothing class
        t1.doReturn();              //accessing the method from the interface
        
        r1.doReturn();              //access its own method
        
        if(r1 instanceof Clothing) {
            ((Trousers)r1).getColorCode();  //it cant access method from clothing unless its cast to a trousers or clothing
        }
        
        if(r1 instanceof Trousers) {
            ((Trousers)r1).getFit();       //it cant access method from trousers unless its cast to a trousers 
        }
       
    }
    
}
