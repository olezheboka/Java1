package com.javaguru.lessons.lesson5;

public class CreditCardTest {

    public static void main(String[] args) {
        CreditCard myCard = new CreditCard(6467041946153399L, "1234");
        myCard.setCreditLimit(500);

        System.out.println("150 deposit");
        myCard.deposit(150, "1234");
        System.out.println("50 withdraw");
        myCard.withdraw(50, "1234");

        System.out.println("deposit with incorrect pin code");
        myCard.deposit(500, "4321");
        System.out.println("withdraw with incorrect pin code");
        myCard.withdraw(5000, "4321");

        System.out.println("set limit to 75000");
        myCard.setCreditLimit(7500);
        System.out.println("withdraw 5000");
        myCard.withdraw(5000, "1234");

        System.out.println("withdraw 2355334");
        myCard.withdraw(2355334, "1234");

    }
}
