package com.javaguru.lessons.lesson3;

public class EncoderDemo {

    public static void main(String[] args) {
        Encoder myEncoder = new Encoder();
        myEncoder.setCode((short) 65);
        myEncoder.setSymbol('A');
        myEncoder.encode();
        myEncoder.decode();
    }
}
