package oopReview;

/**
 * Name: Nigel Wilkerson
 * File: Book.java
 * Version: 1.0
 * Date: 9/25/2026
 * Description: Represents a single book in the library system. Holds
 *  *              title, author, page count, and checkout status. Provides
 *  *              methods to check out, return, and display book information,
 *  *              with guards preventing invalid state transitions.
 */

public class Book {

    // Declare the fields
    String title;
    String author;
    int pageCount;
    boolean isCheckedOut;

    // Create the Constructor with the necessary fields
    Book(String title, String author, int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        isCheckedOut = false;
    }

    //Declare the methods
    void checkOut(){
        if (isCheckedOut){
            System.out.println(this.title + " is already checked out.");
        }
        else {
            System.out.println(this.title + " has been checked out.");
        }
    }

    void returnBook(){
        if (isCheckedOut){
            System.out.println(this.title + " hasn't been checked out.");
        }
        else {
            System.out.println(this.title + " has been returned.");
        }
    }

    public void displayInfo(){
        System.out.println("--------DisplayInfo--------");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " +this.author);
        System.out.println("Page Count: " + this.pageCount);

        String status = (this.isCheckedOut) ?  "Checked Out" : "Available";
        System.out.println("Current status: " + status);
    }

}
