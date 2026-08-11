package objectOrientedProgrammingConstructors;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 8/11/2026
 * Description: Demonstrates the House class by creating two different houses and
 *              exercising the constructor, status toggles, and details display.
 */

public class Main {

    public static void main(String[] args) {

        House house1 = new House("Bob's House", 500000.00);
        House house2 = new House("Shay's House", 230000.00);

        //Display house1 info
        house1.houseDetails();
        System.out.println();

        // Display house1 not for sale
        house1.notForSale();
        System.out.println();

        //Display updated house1 info
        house1.houseDetails();
        System.out.println();

        // Display house2 info
        house2.houseDetails();
        System.out.println();

        // Display house2 not for sale
        house2.notForSale();
        System.out.println();

        // Display updated house2 info
        house2.houseDetails();
        System.out.println();

        // Display house2 for sale
        house2.setForSale();
        System.out.println();

        // Display house2 updated info again
        house2.houseDetails();

    }
}
