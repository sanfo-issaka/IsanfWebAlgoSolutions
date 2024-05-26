package com.Isanf.computeMultiplesSum;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testComputeMultiplesSum() {
        assertEquals(0, Solution.computeMultiplesSum(1));
        assertEquals(3, Solution.computeMultiplesSum(4));
        assertEquals(8, Solution.computeMultiplesSum(6));
        assertEquals(40, Solution.computeMultiplesSum(11));
        assertEquals(63, Solution.computeMultiplesSum(14));
        assertEquals(272, Solution.computeMultiplesSum(30));
        assertEquals(33173, Solution.computeMultiplesSum(1000));
    }
    
    @Test
    public void testEdgeCases() {
        assertEquals(0, Solution.computeMultiplesSum(0));
        assertEquals(0, Solution.computeMultiplesSum(3));
        assertEquals(0, Solution.computeMultiplesSum(5));
        assertEquals(0, Solution.computeMultiplesSum(7));
    }
}

