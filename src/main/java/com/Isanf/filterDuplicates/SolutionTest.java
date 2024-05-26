package com.Isanf.filterDuplicates;

//JUnit Test
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
 @Test
 public void testFilterDuplicates() {
     assertArrayEquals(new int[]{7, 3, 6, 4, 9}, Solution.filterDuplicates(new int[]{7, 3, 6, 4, 3, 3, 4, 9}));
     assertArrayEquals(new int[]{1, 2, 3}, Solution.filterDuplicates(new int[]{1, 2, 2, 3, 3, 3}));
     assertArrayEquals(new int[]{5, 10, 15, 20}, Solution.filterDuplicates(new int[]{5, 10, 15, 20, 5, 10}));
     assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Solution.filterDuplicates(new int[]{1, 2, 3, 4, 5}));
     assertArrayEquals(new int[]{1}, Solution.filterDuplicates(new int[]{1, 1, 1, 1, 1}));
     assertArrayEquals(new int[]{}, Solution.filterDuplicates(new int[]{}));
 }
}