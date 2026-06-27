package whileLoops;
import java.util.Scanner;
/**
 * Name: Nigel Wilkerson
 * File: WhileLoops.java
 * Version: 1.0
 * Date: 6/27/2026
 * Description: Description: Uses while loops to validate user input, ensuring the name is not empty
 *              and age is not negative before producing output
 */

public class WhileLoops {

    public static void main(String[] args) {

        // Open scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String name;
        int age;

        // User-input for name
        System.out.print("What's your name? ");
        name = scanner.nextLine();

        // User input can't be empty
        while (name.isEmpty()) {
            System.out.println("Invalid. You must input your name.");
            System.out.print("What's your name? ");
            name = scanner.nextLine();
        }

        // User-input for age
        System.out.print("What's your age? ");
        age = scanner.nextInt();

        // User input can't be less than 0
        while (age < 0) {
            System.out.println("Invalid. Your age cannot be less than 0.");
            System.out.print("What's your age? ");
            age = scanner.nextInt();
        }

        //Show output
        System.out.printf("Hello %s, you are %d years old.\n", name, age);

        // Close scanner
        scanner.close();
    }
}
