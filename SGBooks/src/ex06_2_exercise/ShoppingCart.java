

package ex06_2_exercise;

public class ShoppingCart {
    
//    In the ShoppingCart class:
//    1. Declare and instantiate 2 objects of type Item. Initialize only 
//     the descr field in each, using different values for each.
//    2. Print the description for each item and run the code.
//    3. (Optional) Above the code that prints the descriptions, 
//     assign item2 to item1.  Run it again.

     public static void main(String args[]) {
        // Declare and initialize 2 Item objects

	Item item1 = new Item();
        Item item2 = new Item();

	// Print both item descriptions and run code.
        
        item1.desc = "Shirt";
        item2.desc = "Socks";
        
         System.out.println(item1.desc);
         System.out.println(item2.desc);

	// Assign one item to another and run it again.
        
         System.out.println("After assigning item2 to item1");
        
         item1 = item2;
        
         System.out.println(item1.desc);
         System.out.println(item2.desc);

     }
 
} 
