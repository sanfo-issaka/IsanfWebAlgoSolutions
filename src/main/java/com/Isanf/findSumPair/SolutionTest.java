package com.Isanf.findSumPair;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testFindSumPairExists() {
        int[] numbers = {1, 5, 8, 1, 2};
        int k = 13;
        int[] result = Solution.findSumPair(numbers, k);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testFindSumPairNoPair() {
        int[] numbers = {1, 5, 8, 1, 2};
        int k = 20;
        int[] result = Solution.findSumPair(numbers, k);
        assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    public void testFindSumPairMultiplePairs() {
        int[] numbers = {1, 5, 3, 7, 8};
        int k = 8;
        int[] result = Solution.findSumPair(numbers, k);
        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    public void testFindSumPairSameIndex() {
        int[] numbers = {1, 3, 5, 7, 3};
        int k = 6;
        int[] result = Solution.findSumPair(numbers, k);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testFindSumPairDuplicates() {
        int[] numbers = {3, 3, 4, 4};
        int k = 6;
        int[] result = Solution.findSumPair(numbers, k);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}
