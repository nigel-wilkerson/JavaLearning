package oopMethodOverriding;

/**
 * Name: Nigel Wilkerson
 * File: Animal.java
 * Version:
 * Date: 8/21/2026
 * Description: Base class representing a generic animal. Defines shared
 *              fields (name, age) and default behaviors (makeSound, move,
 *              sleep) that child classes can inherit unchanged or override
 *              with their own implementations.
 */

public class Animal {

    // Add Fields
    String name;
    int age;

    // Add Animal constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Add Methods
    void makeSound() {
        System.out.printf("%s makes a generic animal sound.%n", this.name);
    }

    void move() {
        System.out.printf("%s moves around.%n", this.name);
    }

    void sleep() {
        System.out.printf("%s is sleeping. Zzz...%n", this.name);
    }
}
