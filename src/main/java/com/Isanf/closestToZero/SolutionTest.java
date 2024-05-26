package com.Isanf.closestToZero;

//JUnit Test
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
 @Test
 public void testClosestToZero() {
     assertEquals(1, Solution.closestToZero(new int[]{7, 5, 9, 1, 4}));
     assertEquals(5, Solution.closestToZero(new int[]{-5, 5}));
     assertEquals(0, Solution.closestToZero(new int[]{}));
     assertEquals(0, Solution.closestToZero(null));
     assertEquals(-1, Solution.closestToZero(new int[]{-1}));
     assertEquals(2, Solution.closestToZero(new int[]{3, 2, -2}));
     assertEquals(1, Solution.closestToZero(new int[]{-2, -1, 1}));
     assertEquals(0, Solution.closestToZero(new int[]{0}));
 }
}
