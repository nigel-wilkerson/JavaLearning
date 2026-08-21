package oopInheritance;

/**
 * Name: Nigel Wilkerson
 * File: Vehicle.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Base class representing a generic vehicle. Defines shared
 *              fields (make, model, year, mpg) and common behaviors
 *              (startEngine, stopEngine, displayInfo) inherited by all
 *              vehicle types.
 */

public class Vehicle  {

    // Add Fields
    String make;
    String model;
    int year;
    double mpg;


    // Add Methods
    void startEngine() {
        System.out.printf("The %s %s engine started.%n", this.make, this.model);
    }

    void stopEngine() {
        System.out.printf("The %s %s engine stopped.%n", this.make, this.model);
    }

    void displayInfo() {
        System.out.println("--------Vehicle Info--------");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("MPG: " + this.mpg);
    }
}
