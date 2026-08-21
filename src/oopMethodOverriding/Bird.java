package oopMethodOverriding;

/**
 * Name: Nigel Wilkerson
 * File: Bird.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents a bird. Extends Animal and overrides makeSound
 *              and move with bird-specific behavior. Inherits sleep
 *              unchanged from Animal.
 */

public class Bird extends Animal{

    // Add Bird constructor
    Bird (String name, int age) {
        super(name, age);
    }

    // Override Methods
    @Override
    void makeSound() {
        System.out.printf("%s chirps: Tweet tweet!%n", this.name);
    }

    @Override
    void move(){
        System.out.printf("%s flies through the air.%n", this.name);
    }
}
