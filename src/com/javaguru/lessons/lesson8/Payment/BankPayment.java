package com.javaguru.lessons.lesson8.Payment;

public class BankPayment implements Payment {

    private String senderBankAccount;
    private String receiverBankAccount;

    public BankPayment(String senderBankAccount, String receiverBankAccount) {
        this.senderBankAccount = senderBankAccount;
        this.receiverBankAccount = receiverBankAccount;
    }

    @Override
    public void process(int amount) {
        System.out.println("Processing Card Payment:");
        System.out.println("Transferring '" + amount + "€' from '" + senderBankAccount + "' to '" + receiverBankAccount + "'");
    }
}
