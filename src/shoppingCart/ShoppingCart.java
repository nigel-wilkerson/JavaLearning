package shoppingCart;
import java.util.Scanner;
/**
 * Name: Nigel Wilkerson
 * File: ShoppingCart.java
 * Version: 1.0
 * Date: 5/19/2026
 * Description: Create a shopping cart program that asks the user what they want to buy, the quantity,
 * and provide the user the total cost
 */

public class ShoppingCart {

    public static void main(String[] args) {

        // Added Scanner input
        Scanner scanner = new Scanner(System.in);

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

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.print("You ordered " + quantity + " " + item + "/s" + " and the total will be " + currency + total);

        //Closed scanner to prevent unwanted results
        scanner.close();
    }
}
