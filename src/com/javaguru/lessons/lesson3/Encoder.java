package com.javaguru.lessons.lesson3;

public class Encoder {

    private short code;
    private char symbol;

    public void encode() {
        char testChar = (char) code;
        System.out.println(code + " => " + testChar);

    }

    public void decode() {
        short testNumber = (short) symbol;
        System.out.println(symbol + " => " + testNumber);
    }

    public void setCode(short code) {
        this.code = code;
    }

    public short getCode() {
        return code;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
