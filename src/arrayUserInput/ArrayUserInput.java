package arrayUserInput;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: ArrayUserInput.java
 * Version: 1.1
 * Date: 7/13/2026
 * Description: Demonstrates dynamically-sized arrays by asking the user how many movies to enter,
 *              then storing and displaying each movie
 */

public class ArrayUserInput {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        // Declare variables
        int numMovies = getMovieCount();

        // This variable will equal the number of arrays needed from user-input
        String[] watchedMovies = new String[numMovies];

        // Ask user the name of the movies they watched
        for(int i = 0; i < watchedMovies.length; i++) {
            System.out.print("Enter a movie you watched: ");
            watchedMovies[i] = scanner.nextLine();
        }

        // Print the name of the movies the user watched
        for(String movie : watchedMovies) {
            System.out.printf("You watched %s this week.\n",movie);
        }
        // Close scanner
        scanner.close();
    }
    static int getMovieCount() {
        // Ask user how many movies they watched
        System.out.print("How many movies have you watched this week? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        while (count <= 0) {
            System.out.println("You must enter a positive number.");
            System.out.print("How many movies have you watched this week? ");
            count = scanner.nextInt();
            scanner.nextLine();
        }
        return count;
    }

}

