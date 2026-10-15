package shoppingCart;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Name: Nigel Wilkerson
 * File: ShoppingCart.java
 * Version: 2.0
 * Date: 10/15/2026
 * Description: Create a shopping cart program that asks the user what they want to buy, the quantity,
 * and provide the user the total cost
 */

public class ShoppingCart {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("------Welcome to our shopping cart program------\n");

            // Declare the variables
            String item;
            double price;
            int quantity;
            double total;
            char currency = '$';

            System.out.print("Hello, what would you like to order: ");
            item = scanner.nextLine();

            System.out.print("What's the price for it?: ");
            price = scanner.nextDouble();
            if (price <= 0) {
                throw new IllegalArgumentException("Price must be greater than 0");
            }

            System.out.print("How many would you like?: ");
            quantity = scanner.nextInt();
            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be greater than 0");
            }

            // Create the total
            total = quantity * price;

            receipt(quantity, item, currency, total);

        }
        catch (InputMismatchException e) {
            System.out.println("Sorry please try again.");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Something went wrong, please try again later.");
        }


    }
    public static void receipt(int quantity, String item, char currency, double total){
        LocalDate date = LocalDate.now();
        System.out.println("\n------Receipt------");
        System.out.println("Date: " + date);
        System.out.printf("You ordered %d %s/s and the total will be %c%.2f. %n", quantity, item, currency, total);
        System.out.println("Thank you, please come again.");

    }
}
