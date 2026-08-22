package oopAbstraction;

/**
 * Name: Nigel Wilkerson
 * File: Circle.java
 * Version: 1.0
 * Date: 8/22/2026
 * Description: Represents a circle. Extends Shape and implements area
 *              (π × r²) and perimeter (2 × π × r) calculations.
 */

public class Circle extends Shape{

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    // Concrete
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Concrete
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
