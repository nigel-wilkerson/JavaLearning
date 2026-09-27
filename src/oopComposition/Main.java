package oopComposition;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 9/27/2026
 * Description: Entry point for the composition practice. Creates a
 *  *              Computer using only primitives and strings, then displays
 *  *              its full specs. Never instantiates CPU or RAM directly,
 *  *              proving the composition pattern holds.
 */

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer
                ("ASUS", "ASUS11", 500.23, 16, "Strong");

        computer.displaySpecs();
    }
}
