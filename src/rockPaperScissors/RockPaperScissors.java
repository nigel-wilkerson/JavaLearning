package rockPaperScissors;
import java.util.Random;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: RockPaperScissors.java
 * Version: 1.0
 * Date: 8/6/2026
 * Description: Rock, paper, scissors game against the CPU with score tracking across multiple rounds.
 */

public class RockPaperScissors {

    public static void main(String[] args) {

        // Open scanner and random
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare variables
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain;
        int playerScore = 0;
        int cpuScore = 0;


        // Welcome message
        welcomeMessage();

        do {
            //User input for player
            System.out.print("\nEnter your move (rock, paper, or scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
            if (!playerChoice.equals("rock") &&
                    (!playerChoice.equals("paper")) &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Skipping round.");
                playAgain = "yes";
                continue;
            }

            // Display user decision
            System.out.printf("You chose: %s\n", playerChoice);

            // CPU chooses rock, paper, or scissors at random
            computerChoice = choices[random.nextInt(3)];
            System.out.println("CPU chose: " + computerChoice);

            // Win conditions
            if (playerChoice.equals(computerChoice)){
                System.out.println("It's a tie");
            }
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))){
                System.out.println("You win!");
                playerScore += 1;
            }
            else {
                System.out.println("You lose!");
                cpuScore += 1;
            }

            // Play again ?
            System.out.print("Would you like to play again (yes/no)?: ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        //
        System.out.println("\nThank you for playing!");
        System.out.println("You won " + playerScore + " time(s)");
        System.out.println("CPU won " + cpuScore + " time(s)");

        // Close scanner
        scanner.close();
    }
    static void welcomeMessage(){
        System.out.println("**********************************************");
        System.out.println("Welcome to the game of Rock, Paper or Scissors");
        System.out.println("**********************************************");
    }
}
