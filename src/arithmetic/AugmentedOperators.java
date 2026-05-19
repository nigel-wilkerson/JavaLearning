package arithmetic;

/**
 * Name: Nigel Wilkerson
 * File: AugmentedOperators.java
 * Version: 1.0
 * Date: 5/19/2026
 * Description: Practice with augmented assignment operators (+=, -=, *=, /=, %=) as a more
 * concise alternative to standard arithmetic operators
 */

public class AugmentedOperators {

    public static void main(String[] args) {

        // Augmented Assignment Operators

        System.out.println("Below are some examples of Augmented Assignment Operators:\n");

        // Unlike arithmetic operators, augmented assignment operators can store the value in the same variable

        int x = 50;
        int y = 25;

        // Addition
        x += y;
        System.out.println("50 + 25 = " + x);

        x = 50; // Reset before next operation
        // Subtraction
        x -= y;
        System.out.println("50 - 25 = " + x);

        x = 50; // Reset before next operation
        //Multiplication
        x *= y;
        System.out.println("50 * 25 = " + x);

        x = 50; // Reset before next operation
        //Division
        x /= y;
        System.out.println("50 / 25 = " + x);

        x = 50; // Reset before next operation
        //Modulus
        x %= y;
        System.out.println("50 % 25 = " + x);

    }
}