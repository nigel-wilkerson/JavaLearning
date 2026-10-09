package madLibs;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;

/**
 * Name: Nigel Wilkerson
 * File: MadLibs.java
 * Version: 2.0
 * Date: 10/9/2026
 * Description: Interactive MadLibs program that collects user input for adjectives, nouns,
 *              and verbs, generates a short story, and saves it to madlibs.txt. Demonstrates
 *              file writing with try-with-resources for automatic resource management.
 */

public class MadLibs {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);
             FileWriter writer = new FileWriter("madlibs.txt")) {

            System.out.println("Enter an adjective (description): ");
            String adjective1 = scanner.nextLine();
            System.out.println("Enter a noun (person or animal): ");
            String noun1 = scanner.nextLine();
            System.out.println("Enter an adjective (description): ");
            String adjective2 = scanner.nextLine();
            System.out.println("Enter a verb end with -ing (action): ");
            String verb1 = scanner.nextLine();
            System.out.println("Enter an adjective (description): ");
            String adjective3 = scanner.nextLine();

            writer.write("------Storytime------");
            writer.write("\nToday I went to a " + adjective1 + " museum");
            writer.write("\nIn the hallway, I saw a " + noun1 + ".");
            writer.write("\nThe " + noun1 + " was " + adjective2 + " and " + verb1 + "!");
            writer.write("\nI was " + adjective3 + "!\n");

            System.out.println("Your MadLibs file has been saved on " + LocalDateTime.now());
        }
        catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
