package com.Isanf.countFrequencies;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testCountFrequencies() {
        // Test case 1
        String[] words1 = {"the", "dog", "got", "the", "bone"};
        int[] expected1 = {1, 1, 1, 2};  // bone = 1, dog = 1, got = 1, the = 2
        assertArrayEquals(expected1, Solution.countFrequencies(words1));

        // Test case 2
        String[] words2 = {"a", "b", "a", "b", "c", "c", "c"};
        int[] expected2 = {2, 2, 3};  // a = 2, b = 2, c = 3
        assertArrayEquals(expected2, Solution.countFrequencies(words2));

        // Test case 3
        String[] words3 = {"one", "one", "one", "one"};
        int[] expected3 = {4};  // one = 4
        assertArrayEquals(expected3, Solution.countFrequencies(words3));

        // Test case 4
        String[] words4 = {"apple", "banana", "apple", "orange", "banana", "banana"};
        int[] expected4 = {2, 3, 1};  // apple = 2, banana = 3, orange = 1
        assertArrayEquals(expected4, Solution.countFrequencies(words4));

        // Test case 5
        String[] words5 = {};
        int[] expected5 = {};  // empty array
        assertArrayEquals(expected5, Solution.countFrequencies(words5));
    }
}
