package ternaryOperator;
import java.util.Random;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: TernaryOperator.java
 * Version: 1.0
 * Date: 6/23/2026
 * Description: Demonstrates the ternary operator (condition ? ifTrue : ifFalse)
 *              through a heads-or-tails coin flip guessing game
 */

public class TernaryOperator {

    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        // import random & scanner
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int number;
        int guess;
        number = random.nextInt(1, 3);

        String headsOrTails = (number == 1) ? "HEADS" : "TAILS";

        System.out.print("Pick 1 for HEADS or 2 for TAILS: ");
        guess = scanner.nextInt();

        String result = (guess == number) ? "Your guess was correct!" : "Your guess was wrong.";
        System.out.println("The coin landed on: " + headsOrTails);
        System.out.println(result);

        // Close scanner
        scanner.close();
    }
}
