package com.javaguru.lessons.lesson9.homework.level3;


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

        Book bookFoundByName = null;

        for (Book book : books) {
            String currentBookName = book.getName();
            if (currentBookName.equals(name)) {
                bookFoundByName = book;
            }
        }
        return bookFoundByName;
    }


    List<Book> findByAuthor(String author) {

        List<Book> booksFoundByAuthor = new ArrayList<>();

        for (Book book : books) {
            String currentBookAuthor = book.getAuthor();
            if (currentBookAuthor.equals(author)) {
                booksFoundByAuthor.add(book);
            }
        }
        return booksFoundByAuthor;

    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
