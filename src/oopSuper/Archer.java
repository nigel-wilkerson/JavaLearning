package oopSuper;

/**
 * Name: Nigel Wilkerson
 * File: Archer.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents an archer. Extends Character and adds bow/arrow state and stats display.
 */

public class Archer extends Character {

    // Add Fields
    String bowType;
    int arrowCount;

    //Add Constructor
    Archer (String name, int health, int level, String bowType, int arrowCount) {
        super(name, health, level);
        this.bowType = bowType;
        this.arrowCount = arrowCount;
    }

    // Add Method
    void displayArcherStats () {
        super.displayStats();
        System.out.printf("Bow type: %s%n", bowType);
        System.out.printf("# of Arrows: %d%n", arrowCount);
    }
}
