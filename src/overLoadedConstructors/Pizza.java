package overLoadedConstructors;

/**
 * Name: Nigel Wilkerson
 * File: Pizza.java
 * Version: 1.0
 * Date: 8/13/2026
 * Description: A Pizza class demonstrating overloaded constructors with constructor chaining. Three constructors funnel
 *              through a master constructor using this(...) to eliminate code duplication
 *              and centralize price calculation logic.
 */

public class Pizza {

    // Declare variables
    String size;
    String crustType;
    String toppings;
    double price;

    Pizza(String size, String crustType, String toppings) {
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
        switch (size) {
            case "small" -> price = 10;
            case "medium" -> price = 14;
            case "large" -> price = 18;
        }
    }

    Pizza(String size, String toppings) {
        this(size, "regular", toppings);
    }

    Pizza(String size) {
        this(size, "regular", "cheese");

    }

    void receipt () {
        System.out.println("-----------Receipt-----------");
        System.out.println("Pizza size: " + this.size);
        System.out.println("Crust type: " + this.crustType);
        System.out.println("Toppings: " + this.toppings);
        System.out.println("Price: $" + this.price);
        System.out.println("-----------------------------");
    }
}

