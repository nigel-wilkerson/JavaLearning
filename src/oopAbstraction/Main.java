package oopAbstraction;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 8/22/2026
 * Description: Driver class for the Shape Calculator abstraction practice.
 *              Creates one Circle, Rectangle, and Triangle, stores them in
 *              a Shape[] array, and loops through calling displayInfo() to
 *              demonstrate abstract methods forcing consistent behavior
 *              across different shape implementations.
 */

public class Main {

    public static void main(String[] args) {

        // Declare Fields
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 4, 3, 4, 5);

        // Put each field in an array
        Shape[] shapes = {circle, rectangle, triangle};

        // Print each shape
        for (Shape shape : shapes) {
            shape.displayInfo();
        }
    }
}
