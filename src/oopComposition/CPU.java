package oopComposition;

/**
 * Name: Nigel Wilkerson
 * File: CPU.java
 * Version: 1.0
 * Date: 9/27/2026
 * Description: Represents a processor as a hardware component. Holds
 *  *              model name and clock speed as immutable fields, exposed
 *  *              through getters, plus a run() method that reports the
 *  *              processor's activity. Designed to live inside a Computer
 *  *              via composition.
 */

public class CPU {

    //Declare fields
    private final String model;
    private final double clockSpeed;

    //Create the constructor
    public CPU(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    public String getModel() {
        return this.model;
    }

    public double getClockSpeed() {
        return this.clockSpeed;
    }

    public void run() {
        System.out.println(this.model + " running at " + this.clockSpeed + " GHz.");
    }
}
