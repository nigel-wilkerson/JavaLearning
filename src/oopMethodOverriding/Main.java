package oopMethodOverriding;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description:
 */

public class Main {

    public static void main(String[] args) {

        // Create one of each constructor
        Dog dog = new Dog("Rocky", 17);
        Cat cat = new Cat("Gary", 12);
        Bird bird = new Bird("Rio", 8);
        Fish fish = new Fish("Nemo", 24);

        Animal[] animals = {dog, cat, bird, fish};

        for (Animal animal : animals) {
            animal.makeSound();
            animal.move();
            animal.sleep();
            System.out.println("--------------------");
        }
    }
}
