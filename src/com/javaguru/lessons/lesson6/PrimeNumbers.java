package com.javaguru.lessons.lesson6;

public class PrimeNumbers {

    public static void main(String[] args) {
        int i;
        int maxRange = 500;
        int count = 0;
        int sum = 0;
        boolean isPrime;

        for (i = 2; i <= maxRange; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                sum += i;
                count++;
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Sum of all prime numbers fro 1 to " + maxRange + " is: " + sum);
        System.out.println("Count of prime numbers: " + count);
    }

    public static boolean CheckPrime(int numberToCheck) {
        for (int i = 2; i <= numberToCheck / 2; i++) {
            if (numberToCheck % i == 0) {
                return false;
            } else if (numberToCheck == 17 || numberToCheck == 71) {
                return false;
            }
        }
        return true;
    }

}
