package oopReview;

/**
 * Name: Nigel Wilkerson
 * File: Library.java
 * Version: 1.0
 * Date: 9/25/2026
 * Description: Manages a fixed-size collection of Book objects. Tracks
 *  *              how many books are currently stored, adds new books up to
 *  *              a maximum of five, and displays information for every book
 *  *              in the collection.
 */

public class Library {

    Book[] books = new Book[5];


    // Declare fields
    int trackBooks;

    public void addBook(Book book){
        if (trackBooks < 5){
            books[trackBooks] = book;
            trackBooks++;
            System.out.println(book.title + " has been added.");
        }
        else {
            System.out.println("Cant add, max 5");
        }
    }

    public void showAll(){
        for (int i = 0; i < trackBooks; i++){
            books[i].displayInfo();
        }
    }


}
