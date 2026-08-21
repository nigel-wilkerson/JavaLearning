package oopSuper;

/**
 * Name: Nigel Wilkerson
 * File: Warrior.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents a warrior. Extends Character and adds weapon-specific state and stats display.
 */

public class Warrior extends Character{

    // Add Field
    String weapon;

    // Add Constructors
    Warrior (String name, int health, int level, String weapon) {
        super(name, health, level);
        this.weapon = weapon;
    }

    // Add Methods
    void displayWarriorStats() {
        super.displayStats();
        System.out.printf("Weapon: %s%n", weapon);
    }

}
