package oopPolymorphism;

/**
 * Name: Nigel Wilkerson
 * File: SMSNotification.java
 * Version: 1.0
 * Date: 9/2/2026
 * Description: Concrete Notification subtype representing a text message.
 *  *              Implements send() to display the recipient and message,
 *  *              truncating any message over the 160-character SMS limit.
 */

public class SMSNotification extends Notification{

    SMSNotification (String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }


    @Override
    void send() {
        System.out.println("Sending SMS to " + this.recipient + ": " + this.message);
    }
}
