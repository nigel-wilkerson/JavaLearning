package weightConverter;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: WeightConverter.java
 * Version: 1.0
 * Date: 6/17/2026
 * Description: Menu-driven weight converter that uses if/else logic to convert between pounds
 *              and kilograms based on user selection
 */

public class WeightConverter {

    public static void main(String[] args) {

        // Create scanner for user-input
        Scanner scanner = new Scanner(System.in);

        //Declare the variables that we'll need
        double weight;
        double newWeight;
        int choice;

        // Create welcome message
        System.out.println("------Weight Converter Program------\n");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs\n");

        // Prompt user for choice
        System.out.print("Choose an option (1 or 2): ");
        choice = scanner.nextInt();

        // Option 1 convert lbs to kgs
        if (choice == 1){
            System.out.print("Enter the weight: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f\n", newWeight);
        }

        // Option 2 convert kgs to lbs
        else if (choice == 2) {
            System.out.print("Enter the weight: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f\n", newWeight);
        }
        // Else print not a valid choice
        else {
            System.out.println("Invalid response. Please run the program again and select 1 or 2.");
        }

        // Close scanner
        scanner.close();
    }
}
