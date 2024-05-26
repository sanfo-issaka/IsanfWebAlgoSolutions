package com.Isanf.calculateTotalPrice;

//JUnit Test
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
 @Test
 public void testCalculateTotalPrice() {
     assertEquals(270, Solution.calculateTotalPrice(new int[]{100, 200, 300}, 10));
     assertEquals(450, Solution.calculateTotalPrice(new int[]{150, 150, 150}, 0));
     assertEquals(90, Solution.calculateTotalPrice(new int[]{100}, 10));
     assertEquals(0, Solution.calculateTotalPrice(new int[]{100}, 100));
     assertEquals(189000, Solution.calculateTotalPrice(new int[]{100000, 90000}, 10));
 }
}
