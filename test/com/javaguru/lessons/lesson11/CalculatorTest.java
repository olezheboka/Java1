package com.javaguru.lessons.lesson11;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator victim;

    @Before
    public void setUp() {
        victim = new Calculator();
    }

    @Test
    public void shouldCalculateSum() {
        int result = victim.sum(3, 5);
        assertEquals(8, result);
    }

    @Test(timeout = 1000)
    public void shouldCalculate() {
        int actual = victim.sum(5,10);
        int expected = 15;

        assertEquals(expected, actual);
    }

}