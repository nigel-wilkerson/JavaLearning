package quizGame;

import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: QuizGame.java
 * Version: 1.0
 * Date: 8/5/2026
 * Description: Created a fun interactive quiz game using 2d arrays, user-input, enhanced for loops, and methods.
 */

public class QuizGame {

    public static void main(String[] args) {

        // Questions array
        String[] questions = {"Which travels faster?",
                              "What does WWE stand for?",
                              "What month is Thanksgiving",
                              "What stone did Dr. Strange give to Thanos in Avengers Infinity War?"};
        // Options array
        String[][] options = {{"1. Plane", "2. Car", "3. Bus", "4. Bike"},
                              {"1. What We Eating", "2. Wonder Woman Estate", "3. World Wrestling Entertainment", "4. We Won't Eat"},
                              {"1. October", "2. December", "3. July", "4. November"},
                              {"1. Time stone", "2. Mind stone", "3. Power stone", "4. Space stone"}};
        // Declare variables
        int[] answers = {1, 3, 4, 1};
        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        welcomeMessage();

        // question (loop)
        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for (String option : options[i]){
                System.out.println(option);

            }
            System.out.print("Enter the #: ");
            guess = scanner.nextInt();

            if (guess == answers[i]){
                System.out.println("CORRECT!\n");
                score += 1;
            }
            else {
                System.out.println("INCORRECT! The answer was " + answers[i]+ "\n");
            }
        }
        // Show final score
        System.out.println("Your final score was " + score + " out of " + questions.length);

        scanner.close();
    }
    static void welcomeMessage(){
        System.out.println("********************************");
        System.out.println("Welcome & good luck on your quiz");
        System.out.println("********************************");
    }
}
