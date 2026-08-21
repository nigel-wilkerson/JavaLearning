package oopInheritance;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 8/21/2026
 * Description: Driver class for the Vehicle Fleet inheritance practice.
 *              Creates one Car, one Truck, and one Motorcycle, sets their
 *              fields, and exercises both inherited and child-specific
 *              methods to demonstrate the extends keyword in action.
 */

public class Main {

    public static void main(String[] args) {

        // Add Fields
        Car car = new Car();
        car.make = "Ford";
        car.model = "Mustang";
        car.year = 2012;
        car.mpg = 47.35;
        car.numDoors = 2;

        Truck truck = new Truck();
        truck.make = "Ford";
        truck.model = "18 Wheeler";
        truck.year = 2015;
        truck.mpg = 123.89;
        truck.bedLength = 8.5;

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.make = "Harley";
        motorcycle.model = "Spector";
        motorcycle.year = 2025;
        motorcycle.mpg = 48.57;
        motorcycle.hasSidecar = false;


        car.startEngine();
        truck.startEngine();
        motorcycle.startEngine();

        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();

        car.honk();
        truck.loadCargo();
        motorcycle.wheelie();

        car.stopEngine();
        truck.stopEngine();
        motorcycle.stopEngine();
    }
}
