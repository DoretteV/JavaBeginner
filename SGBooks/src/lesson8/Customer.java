/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author pierr
 */
public class Customer {
    
    public boolean isNew;
    public boolean isNewCustomer() {
        return isNew;
    }
    
    public void sendEmail(String message) {
        System.out.println("Sending email with message " + message);
    }
    
}
