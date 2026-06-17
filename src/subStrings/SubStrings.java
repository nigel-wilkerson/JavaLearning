package subStrings;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: SubStrings.java
 * Version: 1.0
 * Date: 6/11/2026
 * Description: Demonstrates Java's substring() method by validating a user-input email and extracting
 *              the username and domain using indexOf() to locate the @ symbol
 */

public class SubStrings {

    public static void main(String[] args) {

        // Open scanner
        Scanner scanner = new Scanner(System.in);

        // Declared the variables
        String email;
        String username;
        String domain;

        // User input for email
        System.out.print("Hello, please type in your email : ");
        email = scanner.nextLine();

        // if user input contains "@" run code
        if (email.contains("@")){

            // I used indexOf("@") because my goal was to make everything before the @ the username
            username = email.substring(0, email.indexOf("@"));

            // I used .indexOf("@") + 1 so that I can make everything after the @ sign my domain
            domain = email.substring(email.indexOf("@") + 1);

            System.out.printf("Your email is %s.\n",email);
            System.out.printf("Your username will now be %s.\n",username);
            System.out.printf("The domain to your email is %s.",domain);
        }

        // if user input doesn't contain an "@" run the following message
        else {
            System.out.println("Your email is invalid please try again");
        }

        //Closed scanner to prevent unwanted outcomes
        scanner.close();
    }
}
