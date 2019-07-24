package com.javaguru.lessons.lesson5;

public class BasicCounter {

    private int counter;

    BasicCounter() {
    }

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public void clear() {
        counter = 0;
    }

    public void setCounter(int counter) {
        if (isPositive(counter)) {
            this.counter = counter;
        } else {
            clear();
        }
    }

    private boolean isPositive(int value) {
        return value > 0;
    }


}
