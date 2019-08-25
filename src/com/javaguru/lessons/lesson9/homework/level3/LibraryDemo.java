package com.javaguru.lessons.lesson9.homework.level3;

import java.util.List;

public class LibraryDemo {

    public static void main(String[] args) {

        Book bookOne = new Book("War and Peace", "Leo Tolstoy");
        Book bookTwo = new Book("Anna Karenina", "Leo Tolstoy");

        Library library = new Library();

        library.addBook(bookOne);
        library.addBook(bookTwo);

        System.out.println(library);

        String productFoundByName = library.findByName("Anna Karenina");
        System.out.println(productFoundByName);

        List<Book> productsFoundByAuthor = library.findByAuthor("Leo Tolstoy");
        System.out.println(productsFoundByAuthor);

        library.deleteBook(bookTwo);

        System.out.println(library);

    }


}
