package oopAbstraction;

/**
 * Name: Nigel Wilkerson
 * File: Triangle.java
 * Version: 1.0
 * Date: 8/22/2026
 * Description: Represents a triangle. Extends Shape and implements area
 *              (0.5 × base × height) and perimeter (sum of three sides)
 *              calculations.
 */

public class Triangle extends Shape {

    // Add Fields
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    // Add Constructor
    Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 +side3;
    }
}
