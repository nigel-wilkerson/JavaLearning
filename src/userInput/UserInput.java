package userInput;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: UserInput.java
 * Version: 1.0
 * Date: 5/15/2026
 * Description: Creating a phone conversation with a Chili's-to-go worker to order food with user input
 */

public class UserInput {

    public static void main(String[] args) {
        // Declaring te variables now so I won't have to do it later
        String name;
        int age;
        double price = 14.99;
        char currency = '$';

        System.out.println("----------Welcome to my User Input program using Java----------");

        // For user input you have to declare the scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nChilis-to-go hi my name is Brinda, may I have your name: ");
        name = scanner.nextLine();

        System.out.println("Hello " + name + " may i ask your age?");
        age = scanner.nextInt();

        System.out.println(age + " years old, got it.");

        System.out.println("I see that you were inquiring about the burgter special, that'll be " + currency + price);


        // Best practice is to always close the scanner
        scanner.close();
    }
}
