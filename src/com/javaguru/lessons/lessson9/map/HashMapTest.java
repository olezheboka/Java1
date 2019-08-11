package com.javaguru.lessons.lessson9.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<ProductKey, String> productKeyStringMap = new HashMap<>();

        ProductKey productKey = new ProductKey("apple", "Latvia");

        ProductKey secondProductKey = new ProductKey("pineapple", "Latvia");
        ProductKey thirdProductKey = new ProductKey("orange", "Spain");
        productKeyStringMap.put(productKey, "with love <3");
        productKeyStringMap.put(secondProductKey, "with love <3");
        productKeyStringMap.put(thirdProductKey, "cheap and tasty");

        System.out.println(productKeyStringMap);




    }
}
