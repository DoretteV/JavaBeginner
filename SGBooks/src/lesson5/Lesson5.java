/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5;

/**
 *
 * @author pierr
 */
public class Lesson5 {

    public static void main(String[] args) {
//        int attendees = 15;
//        boolean largeVenue;
//        
//        if (attendees > 8) {
//            largeVenue = true;
//        }else {
//            largeVenue = false;
//        }
//        
//        System.out.println(largeVenue);

        //Array
//        int ages[] = {14, 42, 92};
        
//        int[] ages = new int[3];
//        
//        ages[0] = 19;
//        ages[1] = 42;
//        ages[2] = 92;
//        ages[4] = 21;   //error there is not index 4

//        String[] names = {"Mary", "Bob", "Carlos"};

//        String [] names = new String[3];
//        names[0] = "Mary";
//        names[1] = "Bob";
//        names[2] = "Carlos";
//        
//        System.out.println(names[0]);
//
//          int[] ages = {25, 27, 48};
//          
//          int myAge = ages[0];
//          int yourAge = ages[1];
//          System.out.println("My age is " + myAge);
//          System.out.println("My age is " + ages[0]);

//            String[] names = {"George", "Jill", "Xinyi", "Ravi"};
//            for (String n : names) {
//                System.out.println("Name is " + n);
//            }

            int passmark = 12;
            boolean passed = false;
            int [] scores = {4, 6, 2, 8, 12, 35, 9};
            for (int unitScore : scores) {
                if (unitScore >= 12) {
                    passed = true;
                    break;
                }
            }
            System.out.println("At least one passed? " + passed);
        
    }
    
}
