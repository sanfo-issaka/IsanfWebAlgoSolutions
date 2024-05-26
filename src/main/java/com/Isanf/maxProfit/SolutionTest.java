package com.Isanf.maxProfit;

//JUnit Test
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
 @Test
 public void testMaxProfit() {
     assertArrayEquals(new int[]{1, 5}, Solution.maxProfit(new int[]{-1, 9, 0, 8, -5, 6, -24}));
     assertArrayEquals(new int[]{2, 4}, Solution.maxProfit(new int[]{-10, -2, 5, 6, 2, -1, -4}));
     assertArrayEquals(new int[]{0, 0}, Solution.maxProfit(new int[]{5}));
     assertArrayEquals(new int[]{0, 2}, Solution.maxProfit(new int[]{3, -1, 2, -5}));
     assertArrayEquals(new int[]{2, 2}, Solution.maxProfit(new int[]{-3, -1, 2, -5}));
     assertArrayEquals(new int[]{1, 3}, Solution.maxProfit(new int[]{-3, 4, -1, 2, 1, -5}));
 }
}
