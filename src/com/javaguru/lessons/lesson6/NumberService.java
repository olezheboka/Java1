package com.javaguru.lessons.lesson6;


public class NumberService {

    public static void main(String[] args) {
        NumberService myRange = new NumberService();
        myRange.rangeSum(1, 10);
        myRange.rangeEvenCount(1, 10);
    }


    public int rangeSum(int start, int finish) {
        int i;
        int sum = 0;

        if (finish > start) {
            for (i = start; i <= finish; i++) {
                sum += i;
            }
        } else {
            for (i = finish; i <= start; i++) {
                sum += i;
            }
        }
        System.out.println("Sum of all numbers are : " + sum);
        return sum;

    }

    public int rangeEvenCount(int start, int finish) {
        int i;
        int count = 0;

        if (finish > start) {
            for (i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("Count of even numbers : " + count);
            return count;
        } else {
            for (i = finish; i <= start; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println("Count of even numbers : " + count);
        return count;
    }


}
