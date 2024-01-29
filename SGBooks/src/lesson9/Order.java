/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author Shery
 */
public class Order {

    public static void main(String[] args) {
        Customer cust = new Customer();
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        //  item.price = 10.00;
      //  cust.setLoyaltyDiscount(true);
        item1.setPrice(cust);
        item2.setPrice(cust);
        item3.setPrice(cust);

    }

}

class Item {
    static private int nextId;

    private double price = 15.50;
    
    public Item (){
        setId();
    }

    public void setPrice(Customer cust) {
        if (cust.hasLoyaltyDiscount()) {
            price = price * .85;
        }
        System.out.println("price of item is " + price);
    }
    
    private void setId() {
        nextId++;
        System.out.println("Id is: " + nextId);
    }

}

class Customer {

    private boolean loyaltyDiscount;

    public boolean hasLoyaltyDiscount() {
        return loyaltyDiscount;
    }

    ;
    public void setLoyaltyDiscount(boolean discount) {
        loyaltyDiscount = discount;
    }

}
