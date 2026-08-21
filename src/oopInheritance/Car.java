package oopInheritance;

/**
 * Name: Nigel Wilkerson
 * File: Car.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents a car. Extends Vehicle and adds car-specific
 *              state (numDoors) and behavior (honk).
 */

public class Car extends Vehicle {

    // Add Fields
    int numDoors;

    // Add Methods
    void honk(){
        System.out.println("Beep beep!");
    }
}
