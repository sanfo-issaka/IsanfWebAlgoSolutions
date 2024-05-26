package com.Isanf.sumRange;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSumRange() {
        assertEquals(0, Solution.sumRange(new int[] {}));
        assertEquals(10, Solution.sumRange(new int[] {10}));
        assertEquals(0, Solution.sumRange(new int[] {9}));
        assertEquals(100, Solution.sumRange(new int[] {100}));
        assertEquals(0, Solution.sumRange(new int[] {101}));
        assertEquals(55, Solution.sumRange(new int[] {5, 10, 15, 25, 5}));
        assertEquals(210, Solution.sumRange(new int[] {10, 20, 30, 40, 50, 60}));
        assertEquals(45, Solution.sumRange(new int[] {5, 15, 20, 25, 5}));
        assertEquals(0, Solution.sumRange(new int[] {5, 6, 7, 8, 9}));
        //assertEquals(5050, Solution.sumRange(new int[] {1, 2, 3, ..., 100}));
    }
}

