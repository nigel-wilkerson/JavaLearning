package temperatureConverter;
import java.util.Scanner;

/**
 * Name: Nigel Wilkerson
 * File: TemperatureConverter.java
 * Version: 1.0
 * Date: 6/23/2026
 * Description: Uses the ternary operator to convert temperature between Celsius
 *              and Fahrenheit based on user-selected input
 */

public class TemperatureConverter {

    public static void main(String[] args) {

        // Add scanner
        Scanner scanner = new Scanner(System.in);

        // Add variables
        double temp;
        double newTemp;
        String unit;

        // User-input for temperature
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        // User-input for converting Celsius or Fahrenheit
        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        // Used ternary operator to convert Celsius or Fahrenheit
        newTemp = (unit.equals("C")) ? (temp -32) * 5 / 9 : (temp * 9 / 5) + 32;

        // Print the new temperature
        System.out.printf("%.1f°%s", newTemp, unit);

        // Close scanner
        scanner.close();
    }
}
