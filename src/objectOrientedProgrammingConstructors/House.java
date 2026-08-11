package objectOrientedProgrammingConstructors;

/**
 * Name: Nigel Wilkerson
 * File: House.java
 * Version:
 * Date: 8/11/2026
 * Description: A House class demonstrating constructors — each house is created with a unique name and price,
 *              and tracks whether it's currently for sale. Practice exercise for constructor fundamentals
 *              and the `this` keyword.
 */

public class House {

    String name;
    double price;
    boolean forSale;

    House(String name, double price){
        this.name = name;
        this.price = price;
        this.forSale = true;
    }

    void setForSale(){
        forSale = true;
        System.out.println(this.name + " is for sale.");
    }

    void notForSale(){
        forSale = false;
        System.out.println(this.name + " is not for sale.");
    }

    void houseDetails() {
        System.out.println("-------Home Details----------");
        System.out.println("Name: " + this.name);
        System.out.println("Price: $" + this.price);
        System.out.println("Status: " + ((forSale) ? "Up For Sale" : "Not For Sale"));
        System.out.println("-----------------------------");
    }
}
