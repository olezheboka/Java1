package com.javaguru.lessons.lessson9;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    Set<String> words = new HashSet<>();


    public void addWord(String word) {
        if (word != "") {
            words.add(word);
        }
    }

    public int getWordsCount() {
        System.out.println(words.size());
        return words.size();
    }

    public void printVocabulary() {
        System.out.println(words);
    }

}
