package com.javaguru.lessons.lesson5;

public class Counter {

    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.value = 1;
    }

    public void increment() {
        if (value + step < 100) {
            value = value + step;
        }
    }

    public void decrement() {
        if (value - step > 0) {
            value = value - step;
        }
    }

    public void reset() {
        value = 0;
        step = 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                ", step=" + step +
                '}';
    }
}
