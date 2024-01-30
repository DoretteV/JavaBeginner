/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

/**
 *
 * @author pierr
 */
public class Elevator {
    public int currentFloor = 1;
 //while loop   
    public void changeFloor(int targetFloor){
        System.out.println("current floor is " + currentFloor);
        while (currentFloor != targetFloor) {
            if(currentFloor < targetFloor) {
                goUp();
            }else {
                goDown();
            }
        }
        System.out.println("Reached destination, current floor is " + currentFloor);
    }
    public void goUp() {
        currentFloor++;
        System.out.println("moved up to floor " + currentFloor);
    }
      public void goDown() {
          System.out.println("moved down to floor " + currentFloor);
        currentFloor--;
    }
}
