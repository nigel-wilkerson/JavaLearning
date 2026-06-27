package breakAndContinue;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: BreakAndLoop.java
 * Version: 1.0
 * Date: 6/28/2026
 * Description: Uses break and continue statements in a for loop countdown — continue skips a
 *              specific number (50), and break exits the loop early at 3
 */

public class BreakAndContinue {

    public static void main(String[] args) {

        // break = break out of a loop (STOP)
        // continue = skip a current iteration of a loop (SKIP)

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

            if (i == 50){
                System.out.println("50! OMG I'm tired");
                continue;
            }
            if (i == 3) {
                System.out.println("3, 2, 1");
                break;
            }

            System.out.printf("%d 😁\n", i);
        }

        System.out.println("Happy Birthday!");

        // Close scanner
        scanner.close();

    }
}
