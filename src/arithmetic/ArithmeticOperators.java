package arithmetic;

/**
 * Name: Nigel Wilkerson
 * File: ArithmeticOperators.java
 * Version: 1.0
 * Date: 5/19/2026
 * Description: To show proficiency with assignment operators
 */

public class ArithmeticOperators {

    public static void main(String[] args) {

        // Arithmetic Operators

        System.out.println("Below are some examples of Arithmetic Operators:\n");

        // Here I will assign int variables and show the different kind of operators

        int x = 50;
        int y = 25;
        int z;

        // Addition Operator
        z = x + y;

        System.out.print("Addition: ");
        System.out.println(x + " + " + y + " = " + z);

        // Note that Java follows the code in order
        // Subtraction operator

        z = x - y;
        System.out.print("Subtraction: ");
        System.out.println(x + " - " + y + " = " + z);

        // Multiplication Operator
        z = x * y;
        System.out.print("Multiplication: ");
        System.out.println(x + " * " + y + " = " + z);

        // Division Operator
        z = x / y;
        System.out.print("Division: ");
        System.out.println(x + " / " + y + " = " + z);

        // Modulus Operator (Remainder)
        // Has other benefits such as to determine if a number is even or not
        z = x % y;
        System.out.print("Modulus: ");
        System.out.println(x + " % " + y + " = " + z);
    }
}
