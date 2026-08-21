package coffeeShop;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents a single coffee order. Tracks drink name,
 *  *           size, and price per order, plus class-wide daily totals
 *  *           for orders and revenue via static fields.
 */

public class Main {

    public static void main(String[] args) {

        Coffee coffee1 = new Coffee("Sprite", "medium");
        Coffee coffee2 = new Coffee("Coke", "small");
        Coffee coffee3 = new Coffee("Pepsi", "large");
        Coffee coffee4 = new Coffee("Orange Crush", "medium");
        Coffee coffee5 = new Coffee("Lemonade", "small");


        coffee1.displayOrder();
        coffee2.displayOrder();
        coffee3.displayOrder();
        coffee4.displayOrder();
        coffee5.displayOrder();

        Coffee.displayDailyStats();
    }
}
