package com.javaguru.lessons.lessson9.level3;


import java.util.HashSet;
import java.util.Set;

public class Library {

    private Set<Book> books = new HashSet<>();

    void addBook(Book newBook) {
        books.add(newBook);
    }

    void removeBook(Book bookToDelete) {
        books.remove(bookToDelete);
    }

    void findByName(Book newBook) {
        if (books.contains(newBook)) {
            System.out.println(newBook);
        }
    }

    void findByAuthor(Book bookToGetAuthorFrom) {


        String initialAuthor = bookToGetAuthorFrom.getAuthor();

        for (Book book : books) {

            String currentBookAuthor = book.getAuthor();
            if (currentBookAuthor == initialAuthor) {
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
