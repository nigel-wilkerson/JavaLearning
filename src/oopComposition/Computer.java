package oopComposition;

/**
 * Name: Nigel Wilkerson
 * File: Computer.java
 * Version: 1.0
 * Date: 9/27/2026
 * Description: Demonstrates composition by constructing its own CPU
 *  *              and RAM internally from primitive values. The parts are
 *  *              private and cannot exist outside this Computer — their
 *  *              lifecycle is bound to the containing object.
 */

public class Computer {

    //Declare fields
    private final String brand;
    private final CPU cpu;
    private final RAM ram;

    //Create the constructor
    public Computer(String brand, String cpuModel, double clockSpeed, int ramSize, String ramType) {
        this.brand = brand;
        this.cpu = new CPU(cpuModel, clockSpeed);
        this.ram = new RAM(ramSize, ramType);
    }

    public void displaySpecs(){
        System.out.println("--------Display Specs--------");
        System.out.println("Brand Name: " + this.brand);
        System.out.println("CPU Model: " + cpu.getModel());
        System.out.println("CPU Speed: " + cpu.getClockSpeed() + "GHz");
        System.out.println("Ram Size: " + ram.getSizeGB() + "gb");
        System.out.println("RAM Type: " + ram.getType());

    }
}
