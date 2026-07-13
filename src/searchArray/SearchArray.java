package searchArray;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: SearchArray.java
 * Version: 1.0
 * Date: 7/13/2026
 * Description: Demonstrates linear search by looping through an array of days
 *              and comparing each element to a user-input target
 */

public class SearchArray {

    public static void main(String[] args) {

        // Open scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String[] daysOfWeek = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
        boolean isFound = false;
        String target;

        // Ask user to pick a day of the week
        System.out.print("Enter a day of the week: ");
        target = scanner.nextLine().toUpperCase();

        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[i].equals(target)) {
                System.out.println("Element found at index of " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element was not found.");
        }

        // Close scanner
        scanner.close();
    }
}
