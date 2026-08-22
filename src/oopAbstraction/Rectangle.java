package oopAbstraction;

/**
 * Name: Nigel Wilkerson
 * File: Rectangle.java
 * Version: 1.0
 * Date: 8/22/2026
 * Description: Represents a rectangle. Extends Shape and implements area
 *              (length × width) and perimeter (2 × (length + width))
 *              calculations.
 */

public class Rectangle extends Shape{

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
