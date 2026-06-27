package numberGuessingGame;
import java.util.Random;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: NumberGuessinngGame.java
 * Version: 1.0
 * Date: 6/27/2026
 * Description: Uses a do-while loop to create a number guessing game (1-20)
 *              with directional hints and attempt counter
 */

public class NumberGuessingGame {

    public static void main(String[] args) {

        // Open scanner and random
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare number
        int randomNumber;
        int guess;
        int attempts = 0;

        // Assign number to be a random number between 1 and 10
        randomNumber = random.nextInt(1, 21);

        // Display game
        System.out.println("------Number Guessing Game------");

        // Start the do-while loop
        do {
            System.out.print("Guess a number between 1-20: ");
            guess = scanner.nextInt();
            attempts ++;

            if (guess < randomNumber) {
                System.out.println("HINT: Your guess is too low.");
            }
            else if (guess > randomNumber) {
                System.out.println("HINT: Your guess is too high.");
            }

        }while (guess != randomNumber);

        System.out.printf("\nCongratulations, the correct number was %d.\n", randomNumber);
        System.out.printf("(It took you %d attempts.)\n",attempts);

        // Close scanner
        scanner.close();
    }
}
