package com.javaguru.lessons.lessson9.level3;


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

    void findByName(String name) {
        for (Book book : books) {

            String currentBookName = book.getName();
            if (currentBookName == name) {
                System.out.println(book);
                break;
            }
        }
    }


    void findByAuthor(String author) {

        for (Book book : books) {

            String currentBookAuthor = book.getAuthor();
            if (currentBookAuthor == author) {
                System.out.println(book);
            }
        }

    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
