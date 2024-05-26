package com.Isanf.calc;

//JUnit Test
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {
 @Test
 public void testCalc() {
     // Test with a range within the array
     assertEquals(15, Solution.calc(new int[]{1, 2, 3, 4, 5}, 1, 3));
     
     // Test with the entire array
     assertEquals(15, Solution.calc(new int[]{1, 2, 3, 4, 5}, 0, 4));
     
     // Test with a single element range
     assertEquals(4, Solution.calc(new int[]{1, 2, 3, 4, 5}, 3, 3));
     
     // Test with first and last elements only
     assertEquals(6, Solution.calc(new int[]{1, 2, 3, 4, 5}, 0, 1));
     assertEquals(9, Solution.calc(new int[]{1, 2, 3, 4, 5}, 3, 4));
     
     // Test with larger numbers
     assertEquals(30, Solution.calc(new int[]{10, 20, 30, 40, 50}, 0, 1));
     assertEquals(120, Solution.calc(new int[]{10, 20, 30, 40, 50}, 2, 4));
     
     // Test with negative numbers
     assertEquals(-1, Solution.calc(new int[]{-1, -2, -3, -4, -5}, 0, 0));
     assertEquals(-15, Solution.calc(new int[]{-1, -2, -3, -4, -5}, 0, 4));
     
     // Test with mixed positive and negative numbers
     assertEquals(0, Solution.calc(new int[]{1, -1, 2, -2, 3, -3, 4, -4, 5, -5}, 0, 9));
     assertEquals(3, Solution.calc(new int[]{1, -1, 2, -2, 3, -3, 4, -4, 5, -5}, 4, 6));
 }
}
