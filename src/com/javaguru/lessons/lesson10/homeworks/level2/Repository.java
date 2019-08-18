package com.javaguru.lessons.lesson10.homeworks.level2;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();

    T findById(String id) throws ItemNotFoundException;

    void save(T item);

    void delete(String id) throws ItemNotFoundException;


}
