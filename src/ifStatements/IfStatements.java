package ifStatements;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: IfStatements.java
 * Version: 1.0
 * Date: 5/19/2026
 * Description: Demonstrates if/else/else if conditional statements by categorizing a user's
 * age as newborn, underage, or adult based on their input
 */

public class IfStatements {

    public static void main(String[] args) {

        // Add Scanner
        Scanner scanner = new Scanner(System.in);

        // Added variable age
        String name;
        int age;

        // User input name
        System.out.print("What's your name? ");
        name = scanner.nextLine();

        // Using variable age as the user input
        System.out.print("Hello " + name + " what is your age? ");
        age = scanner.nextInt();

        // If-else
        if (age < 0) {
            System.out.println(name + ", that's not a valid age.");
        }
        else if (age == 0) {
            System.out.println(name + ", you are a newborn.");
        }
        else if (age < 3) {
            System.out.println(name + ", you are a toddler.");
        }
        else if (age < 13) {
            System.out.println(name + ", you are a child.");
        }
        else if (age < 18) {
            System.out.println(name + ", you are a teenager.");
        }
        else if (age < 65) {
            System.out.println(name + ", you are an adult.");
        }
        else {
            System.out.println(name + ", you are a senior.");
        }

        //Close Scanner
        scanner.close();
    }
}
