package com.Isanf.count;

//JUnit Test
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
 @Test
 public void testCount() {
     assertEquals(6, Solution.count(4)); // AB, AC, AD, BC, BD, CD
     assertEquals(3, Solution.count(3)); // AB, AC, BC
     assertEquals(1, Solution.count(2)); // AB
     assertEquals(0, Solution.count(1)); // No pairs
     assertEquals(0, Solution.count(0)); // No pairs
     assertEquals(45, Solution.count(10)); // 10 players forming 45 pairs
     assertEquals(49995000, Solution.count(10000)); // 10000 players forming 49995000 pairs
 }
}
