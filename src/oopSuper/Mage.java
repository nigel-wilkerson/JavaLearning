package oopSuper;

/**
 * Name: Nigel Wilkerson
 * File: Mage.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents a mage. Extends Character and adds spell/mana state and stats display.
 */

public class Mage extends Character {

    // Add Fields
    String spellName;
    int mana;

    // Add Constructor
    Mage (String name, int health, int level, String spellName, int mana) {
        super(name, health, level);
        this.spellName = spellName;
        this.mana = mana;
    }

    // Add Method
    void displayMageStats() {
        super.displayStats();
        System.out.printf("Spell: %s%n", spellName);
        System.out.printf("Mana: %d%n", mana);
    }

}
