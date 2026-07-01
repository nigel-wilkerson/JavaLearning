package overloadedMethods;
import java.util.Scanner;
/**
 * Name: Nigel Wilkerson
 * File: OverloadedMethods.java
 * Version: 1
 * Date: 7/2/2026
 * Description: Demonstrates overloaded methods using three versions of addNumbers() that accept 2, 3, or 4 parameters
 *              — Java automatically selects the correct method based on the arguments passed
 */

public class OverloadedMethods {

    public static void main(String[] args) {

        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int choice;
        double num1;
        double num2;
        double num3;
        double num4;
        double add;

        System.out.print("How many numbers would you like to add (2- 4): ");
        choice = scanner.nextInt();


        if (choice == 4) {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();
            System.out.print("Enter the third number: ");
            num3 = scanner.nextDouble();
            System.out.print("Enter the fourth number: ");
            num4 = scanner.nextDouble();
            add = addNumbers(num1, num2, num3, num4);
            System.out.printf("%.1f + %.1f + %.1f + %.1f = %.1f\n", num1, num2, num3, num4, add);
        }
        else if (choice == 3) {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();
            System.out.print("Enter the third number: ");
            num3 = scanner.nextDouble();
            add = addNumbers(num1, num2, num3);
            System.out.printf("%.1f + %.1f + %.1f = %.1f\n", num1, num2, num3, add);
        }
        else if (choice == 2) {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();
            add = addNumbers(num1, num2);
            System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, add);
        }
        else {
            System.out.println("Number is invalid");
        }


        // Close Scanner
        scanner.close();
    }
    static double addNumbers(double num1, double num2) {
        return num1 + num2;
    }
    static double addNumbers(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
    static double addNumbers(double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    }
}
