package enhancedSwitches;
import java.util.Scanner;

import static enhancedSwitches.Quotes.*;

/**
 * Name: Nigel Wilkerson
 * File: EnhancedSwitches.java
 * Version: 2.0
 * Date: 10/20/2026
 * Description: Combines enums, enhanced switch, and input validation. User selects an MCU character
 *              by name, program converts input to a Quotes enum constant and returns their famous quote.
 */
public class EnhancedSwitches {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String choice;

            // Display menu
            System.out.println("------MCU Quotes------");
            System.out.println("1. Tony Stark");
            System.out.println("2. Thanos");
            System.out.println("3. Captain America");
            System.out.println("4. Nick Fury");
            System.out.println("5. Vision");

            // Get user input, normalize to uppercase, strip all spaces
            System.out.print("\nPick a character: ");
            choice = scanner.nextLine().toUpperCase().trim().replace(" ", "");

            if (choice.isEmpty()) {
                throw new IllegalArgumentException("Please input a name.");
            }

            // Convert String to enum constant
            Quotes quotes = Quotes.valueOf(choice);

            switch (quotes) {
                case TONYSTARK -> System.out.println(
                        "Quote #" + quotes.getCharacterNumber() + ": " +
                                "Keep your friends rich and your enemies rich and wait " +
                                "to find out which is which. \n— Tony Stark");

                case THANOS -> System.out.println(
                        "Quote #" + quotes.getCharacterNumber() + ": " +
                                "I am inevitable. \n— Thanos");

                case CAPTAINAMERICA -> System.out.println(
                        "Quote #" + quotes.getCharacterNumber() + ": " +
                                "Avengers, assemble! \n— Captain America");

                case NICKFURY -> System.out.println(
                        "Quote #" + quotes.getCharacterNumber() + ": " +
                                "The idea was to bring together a group of remarkable people to see if " +
                                "they could become something more. \n— Nick Fury");

                case VISION -> System.out.println(
                        "Quote #" + quotes.getCharacterNumber() + ": " +
                                "What is grief, if not love persevering? \n— Vision");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("That character isn't on the list. Try again with a name from the menu.");
        }
    }
}
