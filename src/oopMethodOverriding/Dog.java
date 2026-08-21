package oopMethodOverriding;

/**
 * Name: Nigel Wilkerson
 * File: Dog.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents a dog. Extends Animal and overrides makeSound
 *              and move with dog-specific behavior. Inherits sleep
 *              unchanged from Animal.
 */

public class Dog extends Animal{

    // Add Dog constructor
    Dog (String name, int age) {
        super(name, age);
    }

    // Override Methods
    @Override
    void makeSound() {
        System.out.printf("%s barks: Woof woof!%n", this.name);
    }

    @Override
    void move(){
        System.out.printf("%s runs on four legs.%n", this.name);
    }
}
