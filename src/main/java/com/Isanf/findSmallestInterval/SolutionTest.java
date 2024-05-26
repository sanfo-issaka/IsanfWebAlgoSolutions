package com.Isanf.findSmallestInterval;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testFindSmallestInterval() {
        assertEquals(1, Solution.findSmallestInterval(new int[] {1, 6, 4, 8, 2}));
        assertEquals(2, Solution.findSmallestInterval(new int[] {3, 8, 5, 12, 1}));
        assertEquals(0, Solution.findSmallestInterval(new int[] {4, 4, 4, 4}));
        assertEquals(1, Solution.findSmallestInterval(new int[] {10, 3, 6, 8, 5}));
        assertEquals(3, Solution.findSmallestInterval(new int[] {7, 10, 20, 23}));
    }
}

