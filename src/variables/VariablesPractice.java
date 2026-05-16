package variables;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: variables.VariablesPractice.java
 * Version:
 * Date: 5/15/2026
 * Description: Practice file for Java variables - declaring and using different data types
 */

public class VariablesPractice {

    public static void main(String[] args) {

        String name1 = "Bob";
        int age = 21;
        double price = 19.99;
        char currency = '$';
        boolean isStudent = true;
        boolean isTall = false;

        String name;

        System.out.println("My name is " + name1);
        System.out.println("I am " + age + " years old");
        System.out.println("The price of my dinner cost me " + currency + price);
        System.out.println("The symbol for the currency usd is " + currency);
        System.out.println("Am I a student? Survey says: " + isStudent);
        System.out.println("Are you over six feet tall? Survey says: " + isTall);

        // Add User Input by creating the scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhat name would you like to put on the reservation: ");
        name = scanner.nextLine();

        System.out.println("The name on the reservation is: " + name);

        // Best practice is to close scanner after creating the scanner input
        scanner.close();
    }
}
