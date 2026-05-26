package mathClass;

/**
 * Name: Nigel Wilkerson
 * File: MathClass.java
 * Version: 1.0
 * Date: 5/26/2026
 * Description: Showcase useful Math class methods including PI,
 * E, pow, sqrt, round, ceil, floor, max, and min
 */

public class MathClass {

    public static void main(String[] args) {


        System.out.println("------Math Tips for Java------\n");

        // Math.PI is the 3.14...
        System.out.print("Math.PI: ");
        System.out.println(Math.PI);

        // Math.E is the exponential constant
        System.out.print("\nMath.E: ");
        System.out.println(Math.E);

        //Math.pow give the number to the power of another number
        System.out.print("\nMath.pow(5, 5): ");
        System.out.println(Math.pow(5, 5));

        // Math.sqrt gives the squared root to any number
        System.out.print("\nMath.sqrt(9): ");
        System.out.println(Math.sqrt(9));

        // Math.round will round any number to the whole integer
        System.out.print("\nMath.round(0.3): ");
        System.out.println(Math.round(0.3));

        // Math.ceil will always round up
        System.out.print("\nMath.ceil(5.1): ");
        System.out.println(Math.ceil(5.1));

        // Math.floor will always round down
        System.out.print("\nMath.floor(7.9): ");
        System.out.println(Math.floor(7.9));

        // Math.max will provide the max number
        System.out.print("\nMath.max(50, 100): ");
        System.out.println(Math.max(50, 100));

        // Math.min will provide the min number
        System.out.print("\nMath.min(50, 100): ");
        System.out.println(Math.min(50, 100));
    }
}
