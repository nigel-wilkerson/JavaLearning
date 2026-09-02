package oopPolymorphism;

/**
 * Name: Nigel Wilkerson
 * File: PushNotification.java
 * Version: 1.0
 * Date: 9/2/2026
 * Description: Concrete Notification subtype representing a mobile push
 *  *              notification. Adds a deviceId field identifying the target
 *  *              device and implements send() to display the device and message.
 */

public class PushNotification extends Notification{

    // Declare field
    String deviceId;

    PushNotification (String deviceId, String recipient, String message) {
        this.deviceId = deviceId;
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    void send() {
        System.out.println("Push notification to device " + this.deviceId + ": " + this.message);
    }
}
