package enhancedSwitches;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: EnhancedSwitches.java
 * Version: 1.0
 * Date: 6/24/2026
 * Description: Demonstrates enhanced switch syntax (case -> result) through a menu-driven program
 *              that returns famous MCU character quotes based on user input
 */

public class EnhancedSwitches {

    public static void main(String[] args) {

        // Add scanner
        Scanner scanner = new Scanner(System.in);

        // Add variable
        int choice;

        // User picks one of the choices below
        System.out.println("------MCU Quotes------");
        System.out.println("1. Tony Stark.");
        System.out.println("2. Thanos.");
        System.out.println("3. Captain America.");
        System.out.println("4. Nick Fury.");
        System.out.println("5. Vision.");

        // User inputs number
        System.out.print("\nPick a number: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println
                    ("Keep your friends rich and your enemies rich and wait " +
                            "to find out which is which. \n— Tony Stark");

            case 2 -> System.out.println("I am inevitable. \n— Thanos");

            case 3 -> System.out.println("Avengers, assemble! \n— Captain America");

            case 4 -> System.out.println
                    ("The idea was to bring together a group of remarkable people to see if " +
                            "they could become something more. \n— Nick Fury");

            case 5 -> System.out.println("What is grief, if not love persevering? \n— Vision");

            default -> System.out.println("Invalid number. Rerun the program to try again");
        }

        // Close scanner
        scanner.close();
    }
}
