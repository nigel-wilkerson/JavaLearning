package oopPolymorphism;

/**
 * Name: Nigel Wilkerson
 * File: EmailNotification.java
 * Version: 1.0
 * Date: 9/2/2026
 * Description: Concrete Notification subtype representing an email.
 *  *              Adds a subject field and implements send() to display
 *  *              the recipient and message in email format.
 */

public class EmailNotification extends Notification {

    // Declare field
    String subject;

    EmailNotification (String subject, String recipient, String message){
        this.subject = subject;
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    void send() {
        System.out.println("Sending EMAIL to " + this.recipient + ": " + this.message);

    }
}
