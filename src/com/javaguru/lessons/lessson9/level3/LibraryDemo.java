package com.javaguru.lessons.lessson9.level3;

public class LibraryDemo {

    public static void main(String[] args) {

        Book bookOne = new Book("War and Peace", "Leo Tolstoy");
        Book bookTwo = new Book("Anna Karenina", "Leo Tolstoy");
        Book bookThree = new Book("The Master and Margarita", "Mikhail Bulgakov");
        Book bookFour = new Book("Crime and Punishment", "Fyodor Dostoyevsky");


        Library library = new Library();

        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
        library.addBook(bookFour);

        System.out.println(library);

        library.removeBook(bookTwo);

        System.out.println(library);

        library.findByAuthor(bookOne);

        library.findByName(bookThree);

    }


}
