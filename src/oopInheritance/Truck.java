package oopInheritance;

/**
 * Name: Nigel Wilkerson
 * File: Truck.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents a truck. Extends Vehicle and adds truck-specific
 *              state (bedLength) and behavior (loadCargo).
 */

public class Truck extends Vehicle{

    // Add Fields
    double bedLength;

    // Add Methods
    void loadCargo() {
        System.out.printf("Loading cargo into %.2f foot bed.\n", bedLength);
    }
}
