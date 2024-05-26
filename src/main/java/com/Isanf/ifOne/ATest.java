package com.Isanf.ifOne;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ATest {

    @Test
    public void testAWithFirstArgumentOne() {
        assertTrue(A.a(1, 5));
    }

    @Test
    public void testAWithSecondArgumentOne() {
        assertTrue(A.a(5, 1));
    }

    @Test
    public void testAWithSumOne() {
        assertTrue(A.a(-3, 4));
    }

    @Test
    public void testAWithNoOneAndSumNotOne() {
        assertFalse(A.a(2, 3));
    }

    @Test
    public void testAWithBothArgumentsOne() {
        assertTrue(A.a(1, 1));
    }

    @Test
    public void testAWithNegativeSumOne() {
        assertTrue(A.a(-1, 2));
    }

    @Test
    public void testAWithZeroArguments() {
        assertFalse(A.a(0, 0));
    }
}

