/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author pierr
 */
public class Employees {
    
    public String name1 = "Fred Smith";
    public String name2 = "fred smith";
    
    public void areNamesEqual() {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Same names");
        } else {
            System.out.println("Different names");
        }
     
    }
    public static void main(String[] args) {
        Employees emps = new Employees();
        emps.areNamesEqual();
    }
}
