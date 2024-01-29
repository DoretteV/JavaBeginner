/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author pierr
 */
public class Lesson10 {

    public static void main(String[] args) {
//        int i = 2;
//        int j = 8;
//        
//        System.out.println((i < 1) && (j > 6));
//        System.out.println((i < 1) || (j > 6));
//        System.out.println(i < 3);
//        System.out.println(!(i < 3));

//Ternary Conditional Operator
//        int x = 2, y = 5, z = 0;
//        z = (y < x) ? x : y;
//        System.out.println("z is " + z);
//        int numberOfGoals = 10;
//        
//        System.out.println("I scored " + numberOfGoals + " " + ((numberOfGoals == 1) ? "goal" : "goals"));

//Number of days in a month
        int month = 9;
        boolean isLeapYear = true;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 Days in a month");
        } else if (month == 2) {
            if (!isLeapYear) {
                System.out.println("28 Days in month");
            } else {
                System.out.println("29 Days in a month");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 Days in a month");
        }
    }

}
