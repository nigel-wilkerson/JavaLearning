package oopComposition;

/**
 * Name: Nigel Wilkerson
 * File: RAM.java
 * Version: 1.0
 * Date: 9/27/2026
 * Description: Represents a stick of RAM as a hardware component.
 *  *              Holds size in GB and memory type as immutable fields,
 *  *              exposed through getters. Designed to live inside a
 *  *              Computer via composition.
 */

public class RAM {

    //Declare fields
    private final int sizeGB;
    private final String type;

    //Create the constructor
    public RAM(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    public int getSizeGB() {
        return this.sizeGB;
    }

    public String getType() {
        return this.type;
    }
}
