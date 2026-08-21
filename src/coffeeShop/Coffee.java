package coffeeShop;

/**
 * Name: Nigel Wilkerson
 * File: Coffee.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents a single coffee order with per-order details
 *  *           and shared daily totals across all orders.
 */

public class Coffee {

    String drinkName;
    String size;
    double price;
    static int totalOrders = 0;
    static double revenue = 0.0;

    Coffee (String drinkName, String size) {
        this.drinkName = drinkName;
        this.size = size;
        switch (size) {
            case "small" -> price = 4;
            case "medium" -> price = 5;
            case "large" -> price = 6;
        }
        totalOrders++;
        revenue += price;
    }

    void displayOrder(){
        System.out.println("----------Receipt----------");
        System.out.println("Drink name: " + this.drinkName);
        System.out.println("Drink size: " +this.size);
        System.out.printf("Drink price: $%.2f\n", this.price);
    }

    static void displayDailyStats(){
        System.out.println("----------Daily Stats----------");
        System.out.println("Orders for the day: " + totalOrders);
        System.out.printf("Today's revenue: $%.2f\n",revenue);
    }
}
