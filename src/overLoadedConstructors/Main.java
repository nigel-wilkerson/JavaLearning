package overLoadedConstructors;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 8/13/2026
 * Description: Demonstrates the Pizza class by creating three pizzas — one with each overloaded constructor — showing
 *              how chained constructors handle defaults for crust type and toppings.
 */

public class Main {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("medium", "Thin Crust", "Sausage");
        Pizza pizza2 = new Pizza("small", "Hand tossed");
        Pizza pizza3 = new Pizza("large");

        pizza1.receipt();
        pizza2.receipt();
        pizza3.receipt();
    }
}
