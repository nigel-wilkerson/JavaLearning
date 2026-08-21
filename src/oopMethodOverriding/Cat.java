package oopMethodOverriding;

/**
 * Name: Nigel Wilkerson
 * File: Cat.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Represents a cat. Extends Animal and overrides makeSound
 *              and move with cat-specific behavior. Inherits sleep
 *              unchanged from Animal.
 */

public class Cat extends Animal {

    // Add Cat constructor
    Cat(String name, int age) {
        super(name, age);
    }

    // Override Methods
    @Override
    void makeSound() {
        System.out.printf("%s meows: Meow!%n", this.name);
    }

    @Override
    void move(){
        System.out.printf("%s gracefully prowls.%n", this.name);
    }
}
