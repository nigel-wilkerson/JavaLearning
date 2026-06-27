package forLoops;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: ForLoops.java
 * Version: 1.0
 * Date: 6/28/2026
 * Description: Uses a for loop to count down from a user-specified number to 1, ending with a celebration message
 */

public class ForLoops {

    public static void main(String[] args) {

        // Open scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int max;

        System.out.print("Type a number you'd like to count down from: ");
        max = scanner.nextInt();

        while (max <= 0){
            System.out.println("Invalid number, please try again.");
            System.out.print("Type a number you'd like to count down from: ");
            max = scanner.nextInt();
        }

        for (int i = max; i > 0 ; i--) {
            System.out.println(i);
        }

        System.out.println("Happy Birthday!");


        // Close scanner
        scanner.close();
    }
}
