package com.javaguru.lessons.lessson9.homework.level3;

public class LibraryDemo {

    public static void main(String[] args) {

        Book bookOne = new Book("War and Peace", "Leo Tolstoy");
        Book bookTwo = new Book("Anna Karenina", "Leo Tolstoy");

        Library library = new Library();

        library.addBook(bookOne);
        library.addBook(bookTwo);

        library.findByName("War and Peace");
        library.findByAuthor("Leo Tolstoy");

        library.deleteBook(bookTwo);

    }


}
