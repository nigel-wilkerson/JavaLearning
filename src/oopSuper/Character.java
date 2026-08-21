package oopSuper;

/**
 * Name: Nigel Wilkerson
 * File: Character.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Base class representing an RPG character. Defines shared fields (name, health, level)
 *              and common behavior (displayStats).
 */

public class Character {

    // Add Fields
    String name;
    int health;
    int level;

    // Add Constructors
    Character(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    // Add Methods
    void displayStats() {
        System.out.println("-----Character Stats-----");
        System.out.printf("Name: %s%n", this.name);
        System.out.printf("Health: %d%n", this.health);
        System.out.printf("Level: %d%n", this.level);
    }

}
