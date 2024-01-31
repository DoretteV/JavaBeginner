package ex12_1_exercise;

//In the ShoppingCart class, 
//    6.  Declare and instantiate a Shirt object, using the 3 arg constructor.
//    7.  Call the display() method on the object reference. 
//      Where is the display method coded?

public class ShoppingCart {
    public static void main(String[] args){

	// instantiate a Shirt object and call display() on the object reference
        
        Shirt myShirt = new Shirt(200.99, 'L', 'B');
        myShirt.display();
        Shirt yourShirt = new Shirt(150.99, 'M', 'P');
        yourShirt.display();
        Shirt ourShirt = new Shirt(125.99, 'S', 'Y');
        ourShirt.display();
        
    }
}
