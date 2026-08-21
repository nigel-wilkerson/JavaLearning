package oopMethodOverriding;

/**
 * Name: Nigel Wilkerson
 * File: Fish.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents a fish. Extends Animal and overrides move and
 *              sleep with fish-specific behavior (swimming, resting with
 *              eyes open). Inherits the generic makeSound from Animal
 *              since fish typically don't vocalize.
 */

public class Fish extends Animal{

    // Add Fish constructor
    Fish (String name, int age) {
        super(name, age);
    }

    @Override
    void move() {
        System.out.printf("%s swims through the water.%n", this.name);
    }

    @Override
    void sleep() {
        System.out.printf("%s rests with eyes open.%n", this.name);
    }
}
