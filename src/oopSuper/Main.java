package oopSuper;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Driver class demonstrating super in the RPG Characters practice — super in constructors
 *              and super in method calls.
 */

public class Main {

    public static void main(String[] args) {

        // Create one Warrior and Mage
        Warrior warrior1 = new Warrior("Hulk", 500, 99, "Fists");
        Mage mage1 = new Mage("Dr. Strange", 150, 70, "Fireball", 1000);
        Archer archer1 = new Archer("Hawkeye", 100, 100, "Stark-Tech", 500);

        // Display Warrior Stats
        warrior1.displayWarriorStats();

        // Display Mage Stats
        mage1.displayMageStats();

        // Display Archer Stats
        archer1.displayArcherStats();

    }
}
