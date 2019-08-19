package com.javaguru.lessons.lesson10.homeworks.level2;

import java.util.List;

public class BookRepositoryDemo {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        Book book1 = new Book("1", "GORE OT UMA", "GRIBOEDOV", 300);
        Book book2 = new Book("2", "VOJNA I MIR", "TOLSTOY", 1000);
        Book book3 = new Book("3", "MASTER I MARGARITA", "BULGAKOV", 500);

        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);

        System.out.println(bookRepository);

        bookRepository.delete("2");

        System.out.println(bookRepository);

        Book bookFoundById = bookRepository.findById("1");
        System.out.println(bookFoundById);

        List<Book> foundAllBooks = bookRepository.findAll();
        System.out.println(foundAllBooks);


    }
}
