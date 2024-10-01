package com.basicprgms;

import java.util.ArrayList;
import java.util.List;

// Book class definition
class Book {
    // Attributes of the Book class
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor to initialize Book objects
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getters for the attributes
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }
}

// Main class to store and display book details
public class BookCollection {
    public static void main(String[] args) {
        // Create an ArrayList of type Book
        List<Book> bookList = new ArrayList<>();

        // Add Book objects to the ArrayList
        bookList.add(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(2, "1984", "George Orwell"));
        bookList.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book(4, "Moby Dick", "Herman Melville"));

        // Display all book details using an advanced for loop
        System.out.println("Book Details:");
        for (Book book : bookList) {
            System.out.println("Book ID: " + book.getBookId() + 
                               ", Book Name: " + book.getBookName() + 
                               ", Author Name: " + book.getAuthorName());
        }
    }
}
