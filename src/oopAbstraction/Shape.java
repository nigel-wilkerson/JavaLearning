package oopAbstraction;

/**
 * Name: Nigel Wilkerson
 * File: Shape.java
 * Version: 1.0
 * Date: 8/22/2026
 * Description: Abstract base class representing a generic 2D shape. Defines
 *              the contract that every shape must be able to calculate its
 *              area and perimeter, and provides a concrete displayInfo
 *              method that leverages those calculations polymorphically.
 */

public abstract class Shape {

    abstract double calculateArea();
    abstract double calculatePerimeter();

    void displayInfo() {
        System.out.println("----- Shape Info -----");
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.printf("Area: %.2f%n", this.calculateArea());
        System.out.printf("Perimeter: %.2f%n", this.calculatePerimeter());
    }
}
