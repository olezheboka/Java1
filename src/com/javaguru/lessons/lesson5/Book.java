package com.javaguru.lessons.lesson5;

import java.util.Objects;

public class Book {

    private String bookAuthor;
    private String bookName;
    private int totalPages;

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return totalPages == book.totalPages &&
                Objects.equals(bookAuthor, book.bookAuthor) &&
                Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookAuthor, bookName, totalPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookAuthor='" + bookAuthor + '\'' +
                ", bookName='" + bookName + '\'' +
                ", totalPages=" + totalPages +
                '}';
    }
}
