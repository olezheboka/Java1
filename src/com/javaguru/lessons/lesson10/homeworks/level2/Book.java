package com.javaguru.lessons.lesson10.homeworks.level2;

import java.util.Objects;

public class Book {

    String id;
    String name;
    String author;
    int pagesCount;

    public Book(String id, String name, String author, int pagesCount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pagesCount == book.pagesCount &&
                Objects.equals(id, book.id) &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, pagesCount);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pagesCount=" + pagesCount +
                '}';
    }
}
