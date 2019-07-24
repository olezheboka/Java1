package com.javaguru.lessons.lesson5;

public class BookDemo {

    public static void main(String[] args) {
        Book book = new Book();
        book.setBookAuthor("Dostoevskij");
        book.setBookName("Prestuplenie i nakazaine");
        book.setTotalPages(450);

        System.out.println(book);

        Book book1 = new Book();
        book1.setBookAuthor("Dostoevskij");
        book1.setBookName("Prestuplenie i nakazaine");
        book1.setTotalPages(450);

        if (book.equals(book1)) {
            System.out.println("Books are equal");
        } else {
            System.out.println("Books are not equal");
        }
    }


}
