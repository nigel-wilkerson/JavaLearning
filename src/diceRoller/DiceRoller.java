package diceRoller;
import java.util.Random;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: DiceRoller.java
 * Version: 1.0
 * Date: 7/10/2026
 * Description: Uses methods, loops, and the Random class to roll multiple dice, displaying each roll
 *              as ASCII art and calculating a running total
 */

public class DiceRoller {

    public static void main(String[] args) {

        //Open scanner & random
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Declare variables
        int numOfDice;
        int total = 0;

        //Ask user for how many dice they want to roll
        System.out.print("Enter the # of dice to roll (# between 1 & 6): ");
        numOfDice = scanner.nextInt();

        if( numOfDice > 0 && numOfDice <7) {
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1,7);
                printRoll(roll);
                System.out.println("You rolled a " + roll);
                total += roll;
            }
            System.out.println("The total is " + total);
        }
        else {
            System.out.println("Number must be between 1 & 6.");

        }

        //Close scanner
        scanner.close();
    }

    static void printRoll(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
        }
    }
}
