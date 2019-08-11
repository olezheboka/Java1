package com.javaguru.lessons.lessson9.level2;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UniqueWordCounter {

    Map<String, Integer> words = new HashMap<>();

    void addWord(String word) {
        word = word.toLowerCase();

        if (words.containsKey(word)) {
            words.put(word, words.get(word) + 1);
        } else {
            words.put(word, 1);
        }
    }

    int getMostFrequentWord() {
        int numberOfTimesAdded = 0;
        String mostFrequentWord = null;

        for (String word : words.keySet()) {
            int currentValue = words.get(word);
            if (currentValue > numberOfTimesAdded) {
                numberOfTimesAdded = currentValue;
                mostFrequentWord = word;
            }
        }
        System.out.println("Most frequently used word is " + mostFrequentWord + ". It was used " + numberOfTimesAdded + " times");
        return numberOfTimesAdded;
    }

    void printWordsFrequency() {
        System.out.println(words);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueWordCounter that = (UniqueWordCounter) o;
        return Objects.equals(words, that.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }

    @Override
    public String toString() {
        return "UniqueWordCounter{" +
                "words=" + words +
                '}';
    }
}
