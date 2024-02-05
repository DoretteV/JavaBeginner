/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

/**
 *
 * @author pierr
 */
public class ElevatorTest {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        elevator.currentFloor = 3;
        int target = 5;
        elevator.changeFloor(target);
    }
    
}
