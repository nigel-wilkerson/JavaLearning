package oopPolymorphism;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 9/2/2026
 * Description: Entry point demonstrating runtime polymorphism. Creates
 *  *              three different Notification subtypes, stores them in a
 *  *              single Notification[] array, and dispatches send() and
 *  *              logDelivery() through the parent reference type.
 */

public class Main {

    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification
                ("Email", "Bobby", "Hello Bobby, we need you to come back to work.");
        PushNotification pushNotification = new PushNotification
                ("MOM's IPad", "Dad", "We need some milk.");
        SMSNotification smsNotification = new SMSNotification
                ("Grandma", "I love you so much");


        Notification[] notifications = {emailNotification, pushNotification, smsNotification};

        for (Notification notification : notifications) {
            notification.send();
            notification.logDelivery();
            System.out.println();
        }
    }
}
