package calculatorProgram;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: CalculatorProgram.java
 * Version: 2.0
 * Date: 10/6/2026
 * Description: Interactive calculator with full exception handling. Loops until the user quits,
 *              uses a custom InvalidOperatorException, and catches NumberFormatException and
 *              ArithmeticException for invalid input and division by zero.
 */

public class CalculatorProgram {

    public static void main(String[] args) {

        System.out.println("------Calculator Program------");

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {

                // INNER try — runs each loop iteration
                try {
                    // Enter the first number
                    System.out.print("Enter the first number (or 'quit' to exit): ");
                    String firstInput = scanner.nextLine();

                    if (firstInput.equalsIgnoreCase("quit")) {
                        System.out.println("Goodbye.");
                        break;
                    }

                    double num1 = Double.parseDouble(firstInput);


                    // Enter the operator — use nextLine() and grab first char
                    System.out.print("Enter the operator (+ , - , * , /): ");
                    String operatorInput = scanner.nextLine();

                    if (operatorInput.isEmpty()) {
                        throw new InvalidOperatorException("No operator entered.");
                    }
                    char operator = operatorInput.charAt(0);

                    // Enter the second number — nextLine() + parse
                    System.out.print("Enter the second number: ");
                    double num2 = Double.parseDouble(scanner.nextLine());

                    double result = 0;

                    switch (operator) {
                        case '+' -> result = num1 + num2;
                        case '-' -> result = num1 - num2;
                        case '*' -> result = num1 * num2;
                        case '/' -> {
                            if (num2 == 0) {
                                throw new ArithmeticException("Cannot divide by zero.");
                            }
                            result = num1 / num2;
                        }
                        default -> throw new InvalidOperatorException(
                                "'" + operator + "' is not a supported operator.");
                    }

                    System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);

                } catch (NumberFormatException e) {
                    System.out.println("That's not a valid number.");
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                } catch (InvalidOperatorException e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.printf("%n--- ready for next calculation ---%n");
                }
            }

            System.out.println("Thank you for using the calculator program!");
        }
    }
}
