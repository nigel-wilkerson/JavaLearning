package oopArrayList;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version:
 * Date: 9/28/2026
 * Description:
 */

public class Main {
    public static void main(String[] args) {

        GroceryList commissary = new GroceryList("Commissary Run");

        commissary.addItem("Eggs");
        commissary.addItem("Chicken Breast");
        commissary.addItem("Rice");
        commissary.addItem("Broccoli");
        commissary.addItem("Greek Yogurt");

        System.out.println();
        commissary.showList();

        System.out.println("\nTotal items: " + commissary.getItemCount());

        System.out.println("\nDo we have Eggs? " + commissary.hasItem("Eggs"));
        System.out.println("Do we have Steak? " + commissary.hasItem("Steak"));

        System.out.println();
        commissary.removeItem("Broccoli");
        commissary.removeItem("Steak");

        System.out.println();
        commissary.showList();

        System.out.println();
        commissary.clearList();
        commissary.showList();
    }
}
