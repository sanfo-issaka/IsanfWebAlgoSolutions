package com.Isanf.computeCheckDigit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testComputeCheckDigit() {
        // Test cases
        assertEquals(3, Solution.computeCheckDigit("39847"));
        assertEquals(0, Solution.computeCheckDigit("123456"));
        assertEquals(7, Solution.computeCheckDigit("98765"));
        assertEquals(4, Solution.computeCheckDigit("11111"));
        assertEquals(0, Solution.computeCheckDigit("0"));
        assertEquals(2, Solution.computeCheckDigit("2468"));
    }
}

