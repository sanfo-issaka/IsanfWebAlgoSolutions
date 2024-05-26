package com.Isanf.findLargest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlgorithmTest {

    @Test
    public void testFindLargest() {
        int[] numbers = {1, 3, 5, 7, 9};
        int result = Algorithm.findLargest(numbers);
        assertEquals(9, result);
    }

    @Test
    public void testFindLargestSingleElement() {
        int[] numbers = {42};
        int result = Algorithm.findLargest(numbers);
        assertEquals(42, result);
    }

    @Test
    public void testFindLargestNegativeNumbers() {
        int[] numbers = {-1, -3, -5, -7, -9};
        int result = Algorithm.findLargest(numbers);
        assertEquals(-1, result);
    }

    @Test
    public void testFindLargestMixedNumbers() {
        int[] numbers = {-10, 0, 10, 20, 5};
        int result = Algorithm.findLargest(numbers);
        assertEquals(20, result);
    }

    @Test
    public void testFindLargestAllSameNumbers() {
        int[] numbers = {2, 2, 2, 2, 2};
        int result = Algorithm.findLargest(numbers);
        assertEquals(2, result);
    }
}

