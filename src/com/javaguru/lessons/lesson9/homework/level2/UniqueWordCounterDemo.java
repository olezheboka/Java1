package com.javaguru.lessons.lesson9.homework.level2;

public class UniqueWordCounterDemo {

    public static void main(String[] args) {
        UniqueWordCounter wordCounter = new UniqueWordCounter();

        wordCounter.addWord("Apple");
        wordCounter.addWord("apPle");
        wordCounter.addWord("apple");
        wordCounter.addWord("banana");
        wordCounter.addWord("banana");
        wordCounter.addWord("BANANA");
        wordCounter.addWord("banana");
        wordCounter.addWord("strawberry");
        wordCounter.addWord("watermelon");


        wordCounter.getMostFrequentWord();
        wordCounter.printWordsFrequency();


    }
}
