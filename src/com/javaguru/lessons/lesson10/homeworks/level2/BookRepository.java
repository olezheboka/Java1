package com.javaguru.lessons.lesson10.homeworks.level2;

import java.util.List;

public class BookRepository implements Repository {

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Object findById(String id) throws ItemNotFoundException {
        return null;
    }

    @Override
    public void save(Object item) {

    }

    @Override
    public void delete(String id) throws ItemNotFoundException {

    }
}
