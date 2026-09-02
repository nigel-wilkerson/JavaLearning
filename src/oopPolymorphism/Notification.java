package oopPolymorphism;

/**
 * Name: Nigel Wilkerson
 * File: Notification.java
 * Version: 1.0
 * Date: 9/2/2026
 * Description: Abstract parent class defining the contract for all
 *  *              notification types. Holds recipient and message fields
 *  *              shared by every subtype, declares the abstract send()
 *  *              method that each child must implement, and provides a
 *  *              concrete logDelivery() method inherited by all children.
 */

public abstract class Notification {

    // Declare fields
    String recipient;
    String message;

    // Declare abstract method
    abstract void send();

    // Declare concrete method
    void logDelivery() {
        System.out.println("Delivery logged for " + this.recipient + " at " + java.time.LocalDateTime.now());
    }
}
