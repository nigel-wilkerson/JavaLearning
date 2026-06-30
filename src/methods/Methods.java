package methods;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: Methods.java
 * Version: 1.0
 * Date: 6/30/2026
 * Description: A weekly payroll calculator demonstrating methods with parameters and return values —
 *              calculates regular pay, overtime pay, gross pay, taxes, and take-home pay
 */

public class Methods {

    public static void main(String[] args) {

        // Open scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String name;
        double perHour;
        double hoursWorked;
        double overtimeHours = 0;
        double taxes;

        // Declared sayHello Method
        sayHello();

        // User-input
        System.out.print("What's the employee's name: ");
        name = scanner.nextLine();

        System.out.print("How much do they make an hour: ");
        perHour = scanner.nextDouble();

        System.out.print("How many hours have they worked: ");
        hoursWorked = scanner.nextDouble();
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
        }

        // Method parameters
        double calculateRegularPay = calculateRegularPay(perHour, hoursWorked);
        double calculateOvertimePay = calculateOvertimePay( overtimeHours,  perHour);
        double grossPay = grossPay(calculateRegularPay,calculateOvertimePay);
        taxes = taxes(grossPay);
        double takeHomePay = takeHomePay (grossPay,  taxes);

        // Employee payroll info
        System.out.println("--------------------");
        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Regular Pay: $%.2f\n", calculateRegularPay);
        System.out.printf("Overtime Pay: $%.2f\n", calculateOvertimePay);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.printf("Taxes: $%.2f\n", taxes);
        System.out.println("--------------------");

        //Employee take-home pay
        System.out.println("Take-Home Pay: " + takeHomePay);


        // Close scanner
        scanner.close();
    }
    static void sayHello() {
        System.out.println("------WEEKLY PAYROLL SUMMARY------");
    }

    static double calculateRegularPay(double perHour, double hoursWorked) {
        if (hoursWorked > 40) {
            return perHour * 40;
        } else {
            return perHour * hoursWorked;
        }
    }

    static double calculateOvertimePay(double overtimeHours, double perHour) {
        return  overtimeHours * (perHour * 1.5);
    }

    static double grossPay(double calculateRegularPay, double calculateOvertimePay) {
        return (calculateRegularPay + calculateOvertimePay);
    }

    static double taxes(double grossPay) {
        return grossPay * .15;
    }

    static double takeHomePay (double grossPay, double taxes) {
        return grossPay - taxes;
    }
}
