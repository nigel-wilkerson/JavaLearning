package logicalOperators;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: LogicalOperators.java
 * Version: 1.0
 * Date: 6/25/2026
 * Description: Uses logical operators (&&, ||, !) to determine driving eligibility
 *              based on age, license, and permit status
 */

public class LogicalOperators {

    public static void main(String[] args) {

        // Logical Operator Notes
        // && = AND
        // || = OR
        // !  = NOT

        // Open scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Driver's Ed Qualifier------");

        // Declare variables
        String name;
        int age;
        String choice1;
        String choice2;
        boolean hasLicense;
        boolean hasPermit;

        // User enters name
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        // User enters age
        System.out.print("How old are you?: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Skips the invisible /n

        // User enters if they have a license
        System.out.print("Do you have a driver's license (yes / no)? ");
        choice1 = scanner.nextLine().toLowerCase();
        hasLicense = choice1.contains("yes");

        // User enters if they have a permit
        System.out.print("Do you have a driver's permit (yes / no)? ");
        choice2 = scanner.nextLine().toLowerCase();
        hasPermit = choice2.contains("yes");


        if (age < 16) {
            System.out.printf("%s you are not old enough to drive.", name);
        }
        else if (!hasLicense && !hasPermit) {
            System.out.printf("%s, you are not allowed to drive because you don't have a license/permit.\n", name);
        }
        else {
            System.out.printf("%s, you are allowed to drive.\n", name);
        }

        // Close scanner
        scanner.close();
    }
}
