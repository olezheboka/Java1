package com.javaguru.lessons.lessson9.homework.level3;


import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();

    void addBook(Book newBook) {
        books.add(newBook);
    }

    void deleteBook(Book bookToDelete) {
        books.remove(bookToDelete);
    }

    Book findByName(String name) {

        for (Book book : books) {
            String currentBookName = book.getName();
            if (currentBookName == name) {
                System.out.println("Book found by " + name + " is: " + book);
                return book;
            }
        }
        return null;
    }


    Book findByAuthor(String author) {

        Book bookFoundByAuthor = books.get(0);

        for (Book book : books) {
            String currentBookAuthor = book.getAuthor();
            if (currentBookAuthor == author) {
                bookFoundByAuthor = book;
                System.out.println("Book found by " + author + " is: " + book);
            }
        }
        return bookFoundByAuthor;

    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
