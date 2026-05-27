package compoundInterestCalculator;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: CompoundInterestCalculator.java
 * Version: 1.0
 * Date: 5/27/2026
 * Description:
 */

public class CompoundInterestCalculator {

    public static void main(String[] args) {

        // Compound Interest Calculator

        //Add Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        //Input
        System.out.print("What is the principal: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter how many time compounded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the amount of years: ");
        years = scanner.nextInt();

        //Calculate
        amount = principal * Math.pow(1 + rate / timeCompounded, (years * timeCompounded));

        //Output
        System.out.printf("The amount after %d year(s) is $%,.2f", years, amount);


        // Close Scanner
        scanner.close();


    }
}
