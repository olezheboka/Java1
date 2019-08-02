package com.javaguru.lessons.lesson5;

import java.util.Objects;

public class CreditCard {

    private long cardNumber;
    private String pinCode;
    private int balance = 0;
    private int creditLimit;
    private int debt = 0;


    public CreditCard(long cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public void withdraw(int withdrawalAmount, String enteredPinCode) {

        if (enteredPinCode.equals(pinCode) && balance >= withdrawalAmount) {
            balance = balance - withdrawalAmount;
            System.out.println(toString());
        } else if (enteredPinCode.equals(pinCode) && isCreditLimitEnough(withdrawalAmount)) {
            debt = debt + withdrawalAmount - balance;
            balance = 0;
            System.out.println(toString());
        } else if (enteredPinCode.equals(pinCode)) {
            System.out.println("Credit limit exceeded " + "\n" + toString());
        } else {
            System.out.println("Declined: Incorrect PIN code");
        }
    }

    private boolean isCreditLimitEnough(int withdrawalAmount) {
        return creditLimit >= debt + withdrawalAmount - balance;
    }


    public void deposit(int depositAmount, String enteredPinCode) {
        if (enteredPinCode.equals(pinCode) && debt <= 0) {
            balance = balance + depositAmount;
            System.out.println(toString());
        } else if (enteredPinCode.equals(pinCode)) {
            if (depositAmount <= debt) {
                debt = debt - depositAmount;
            } else {
                balance = depositAmount - debt;
                debt = 0;
            }
            System.out.println(toString());
        } else {
            System.out.println("Declined: Incorrect PIN code");
        }
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNumber == that.cardNumber &&
                pinCode == that.pinCode &&
                balance == that.balance &&
                creditLimit == that.creditLimit &&
                debt == that.debt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, pinCode, balance, creditLimit, debt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", pinCode=" + pinCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", debt=" + debt +
                '}';
    }
}
