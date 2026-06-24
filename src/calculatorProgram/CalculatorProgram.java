package calculatorProgram;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: CalculatorProgram.java
 * Version: 1.0
 * Date: 6/24/2026
 * Description: Demonstrates enhanced switch statements and conditional logic by building a calculator with arithmetic
 *              operations, division-by-zero protection, and invalid operator handling
 */

public class CalculatorProgram {

    public static void main(String[] args) {

        // Open scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Calculator Program------");

        // Add variables
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        // Enter the first number
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        // Enter the operator
        System.out.print("Enter the operator (+ , - , * , /): ");
        operator = scanner.next().charAt(0);

        // Enter the second number
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        // Use the enhanced switch to connect num1 & num2
        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                // Can't divide by 0 because it'// be infinity
                if (num2 == 0){
                    System.out.println("Can't divide by 0.");
                    validOperator = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            default -> {
                System.out.println("Invalid operator, please try again.");
                validOperator = false;
            }

        }
        // Only show result if valid operator is true
        if (validOperator){
            System.out.printf("%.2f %c %.2f = %.2f\n", num1, operator, num2, result);
        }
        // Close scanner
        scanner.close();
    }
}
