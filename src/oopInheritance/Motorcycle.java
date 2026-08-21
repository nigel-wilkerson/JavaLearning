package oopInheritance;

/**
 * Name: Nigel Wilkerson
 * File: Motorcycle.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents a motorcycle. Extends Vehicle and adds
 *              motorcycle-specific state (hasSidecar) and behavior
 *              (wheelie).
 */

public class Motorcycle extends Vehicle{

    // Add Fields
    boolean hasSidecar;

    // Add Method
    void wheelie() {
        if (hasSidecar) {
            System.out.println("Can't do a wheelie with a sidecar!");
        } else {
            System.out.println("Doing a wheelie!");
        }
    }
}
