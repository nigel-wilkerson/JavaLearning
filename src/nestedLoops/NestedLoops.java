package nestedLoops;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: NestedLoops.java
 * Version: 1.0
 * Date: 6/30/2026
 * Description: Uses nested for loops to generate a grid of user-specified rows, columns, and symbol character
 */

public class NestedLoops {

    public static void main(String[] args) {

        // Open scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int rows;
        int columns;
        char symbol;

        // User-input for number of rows they want
        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        // User-input for number of columns they want
        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        // User-input for the symbol they want
        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        // Used for loop to create the rows
        for (int i = 1; i <= rows; i++){
            // Used nested for loops to create the columns
            for (int j = 1; j <= columns; j ++){
                // User-input for symbol will be printed on as the column on x amount of rows
                System.out.print(symbol);
            }

            // This is to create a line between each row
            System.out.println();
        }
        // Close scanner
        scanner.close();
    }
}
