/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;
import java.time.*;
//import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;


/**
 *
 * @author pierr
 */
public class Lesson11 {
    public static void main(String[] args) {

//Arraylist

          ArrayList<String> names;
          names = new ArrayList();
          names.add("Jamie");
          names.add("Gustav");
          names.add("Alisa");
          names.add("Jose");
          names.add("Kevin");
          System.out.println(names);
          names.remove(0);
          System.out.println(names);
          names.remove(names.size() - 1);
          System.out.println(names);
          names.remove("Gustav");
          System.out.println(names);
          
  
//        LocalDate myDate = LocalDate.now();
//        System.out.println("Today's date is " + myDate);
//        JapaneseDate jDate = JapaneseDate.from(myDate);
//        System.out.println("Japanese date is " + jDate);
//minus Date
//        LocalDate myDate2 = myDate.minusMonths(15);
//        System.out.println("Local date2 is " + myDate2);
//plus date
//        LocalDate myDate3 = myDate.plusDays(8);
//        System.out.println("Local date3 is " + myDate3);

//Formatting dates
//            LocalDateTime today = LocalDateTime.now();
//            System.out.println("Today's date time (no formatting): " + today);
//            
//            String sdate = today.format(DateTimeFormatter.ISO_DATE_TIME);
//            System.out.println("Date in ISO_DATE_TIME format " + sdate);
//            
//            String fdate = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
//            System.out.println("Date in MEDIUM format " + fdate);

//two dimensional array
//            int[][] yearlySales;
//            yearlySales = new int [5][4];
//            yearlySales[0][0] = 1000;
//            yearlySales[0][1] = 1500;
//            yearlySales[0][2] = 1800;
//            yearlySales[1][0] = 1500;
//            yearlySales[3][3] = 2000;
//            yearlySales[3][1] = 5000;
//            yearlySales[1][2] = 10000;
//            System.out.println(yearlySales[1][2]);

//while loop

//            System.out.println("/*");
//            int counter = 0;
//            while (counter < 3) {
//                System.out.println("*");
//                counter++;
//            }
//            System.out.println("*/");

//for loop
//            System.out.println("/*");
//            for (int counter = 3; counter >0; counter--) {
//                System.out.println("*");
//            }
//            System.out.println("*/");

//            for(int i = 0; i < 5; i++) {
//                System.out.println("i is " + i); 
//                 
//            }

//while loop
//            int i = 0;
//            while (i < 3) {
//                System.out.println(" *");
//                i++;
//            }
            
//for loop
//            for (int num = 0; num < 3; num++) {
//                System.out.println(" *");
//            }

//enhanced for loop
//              String[] names = {"James", "Paul", "Helen", "Moses"};
//              for (String name: names) {
//                  System.out.println(name);
//              }
//            
//standard for loop
//              for (int idx = 0; idx < names.length; idx++) {
//                  System.out.println(names[idx]);
//              }

//do while loop
//                int i = 0;
//                do {
//                    System.out.println(i);
//                    i++;
//                }
//                while (i < 10);

//continue

//              String[] names = {"James", "Paul", "no name", "Helen", "Moses"};
//              for (String name: names) {
//                  if (name.equals("no name")){
//                      continue;
//                  }
//                  System.out.println(name);
//              }

//         factorial(5);
//    }
    
//    static void factorial (int target) {
//        int save = target;
//        int fact = 1;
//        do {
//            fact *= target--;
//        }while(target > 0);
//        System.out.println("Factorial for " + save + " is " + fact);
//    }
    
//nested for loop
//    int height = 4, width = 10;
//    
//    for (int row = 0; row < height; row++) {
//        for(int col = 0; col < width; col++) {
//            System.out.print("@");
//        }
//            System.out.println();
//    }
    
//processing a 2 dimensional array
//
//        int sales [][] = new int[3][4];
//        sales = initArray(sales);   //initialize the array
//        for(int y = 0; y<3; y++) {
//            for(int q=0; q<4; q++) {
//                System.out.print("\tQ" + (q+1) + " " + sales[y][y]);
//            }
//            System.out.println();
//        }
 }
    
//    static int[][] initArray(int[][] sales) {
//        for(int y=0; y<3; y++) {
//            for (int q=0; q<4; q++){
//                sales[y][q]=(int)Math.floor(Math.random()*2000);
//            }
//            
//        }
//        return sales;
//    }
}
    
    

