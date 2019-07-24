package com.javaguru.lessons.lesson5;

public class CounterTest {

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.getValue();
        counter.getStep();

        counter.increment();
        counter.getValue();

        counter.setStep(5);
        counter.increment();

        counter.setStep(2);
        counter.decrement();

        counter.getValue();
        counter.getStep();

        System.out.println(counter);
    }


}
