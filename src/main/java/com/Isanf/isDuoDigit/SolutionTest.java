package com.Isanf.isDuoDigit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testIsDuoDigit() {
        assertEquals("y", Solution.isDuoDigit(1));       // Single digit
        assertEquals("y", Solution.isDuoDigit(2020));    // Two distinct digits
        assertEquals("n", Solution.isDuoDigit(102));     // Three distinct digits
        assertEquals("y", Solution.isDuoDigit(-33333));  // Single distinct digit with negative sign
        assertEquals("y", Solution.isDuoDigit(110));     // Two distinct digits
        assertEquals("n", Solution.isDuoDigit(-2021));   // Three distinct digits with negative sign
        assertEquals("y", Solution.isDuoDigit(0));       // Single digit (zero)
        assertEquals("y", Solution.isDuoDigit(-10));     // Two distinct digits with negative sign
    }
}
