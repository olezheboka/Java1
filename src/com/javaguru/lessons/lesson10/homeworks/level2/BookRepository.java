package com.javaguru.lessons.lesson10.homeworks.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {

    Map<String, Book> bookRepository = new HashMap<>();

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(bookRepository.values());
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        if (!bookRepository.containsKey(id)) {
            throw new ItemNotFoundException(id);
        }
        return bookRepository.get(id);
    }

    @Override
    public void save(Book item) {
        bookRepository.put(item.getId(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if (!bookRepository.containsKey(id)) {
            throw new ItemNotFoundException(id);
        }
        bookRepository.remove(id);
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "bookRepository=" + bookRepository +
                '}';
    }
}
