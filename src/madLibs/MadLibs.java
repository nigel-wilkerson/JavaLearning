package madLibs;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: MadLibs.java
 * Version: 1.0
 * Date: 5/17/2026
 * Description: creating a story using user input
 */

public class MadLibs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating the String variables to be used for later
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        // Created questions and include user-input for the story
        System.out.println("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (person or animal): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        //This is the user generated story with the variables the user chose
        System.out.println("\n------Storytime------");
        System.out.println("Today I went to a " + adjective1 + " museum");
        System.out.println("In the hallway, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        //Closed scanner to prevent unexpected outcomes
        scanner.close();
    }
}
