package oopReview;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 9/26/2026
 * Description: Entry point for the Library Book Tracker diagnostic. Creates
 *  *              a Library, adds three Books, and exercises the checkout and
 *  *              return methods to verify state changes persist correctly
 *  *              across method calls.
 */

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book transformers = new Book("Transformers", "M. Bay", 342);
        Book harryPotter = new Book("Harry Potter", "J.K. Rolling", 700);
        Book rushHour = new Book("Rush Hour", "C. Tucker", 234);

        library.addBook(transformers);
        library.addBook(harryPotter);
        library.addBook(rushHour);


        library.showAll();

    }
}
