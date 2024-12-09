package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberFindTest {

    @Test
    public void testIsPrime_withNegativeNumber() {
        assertFalse(NumberFind.isPrime(-5));
    }

    @Test
    public void testIsPrime_withZero() {
        assertFalse(NumberFind.isPrime(0));
    }

    @Test
    public void testIsPrime_withOne() {
        assertFalse(NumberFind.isPrime(1));
    }

    @Test
    public void testIsPrime_withPrimeNumber() {
        assertTrue(NumberFind.isPrime(3));
    }
}