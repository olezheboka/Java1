package com.javaguru.lessons.lesson9.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("C");
        strings.add("C");
        strings.add("C");

        System.out.println(strings);


    }

}
