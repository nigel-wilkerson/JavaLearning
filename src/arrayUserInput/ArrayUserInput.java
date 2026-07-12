package arrayUserInput;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: ArrayUserInput.java
 * Version: 1.0
 * Date: 7/13/2026
 * Description: Demonstrates dynamically-sized arrays by asking the user how many movies to enter,
 *              then storing and displaying each movie
 */

public class ArrayUserInput {

    static Scanner scanner = new Scanner(System.in);
    static int numMovies;

    public static void main(String[] args) {

        // Declare variables
        String[] watchedMovies;

        // Call method Movies
        getMovieCount();

        // This variable will equal the number of arrays needed from user-input
        watchedMovies = new String[numMovies];

        // Ask user the name of the movies they watched
        for(int i = 0; i < watchedMovies.length; i++) {
            System.out.print("Enter a movie you watched: ");
            watchedMovies[i] = scanner.nextLine();
        }

        // Print the name of the movies the user watched
        for(String movies : watchedMovies) {
            System.out.printf("You watched %s this week.\n",movies);
        }
        // Close scanner
        scanner.close();
    }
    static void getMovieCount() {
        // Ask user how many movies they watched
        System.out.print("How many movies have you watched this week? ");
        numMovies = scanner.nextInt();
        scanner.nextLine();

        while (numMovies <= 0) {
            System.out.println("You must enter a positive number.");
            System.out.print("How many movies have you watched this week? ");
            numMovies = scanner.nextInt();
            scanner.nextLine();
        }
    }

}
