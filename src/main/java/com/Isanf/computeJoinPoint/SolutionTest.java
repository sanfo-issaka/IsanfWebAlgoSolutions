package com.Isanf.computeJoinPoint;

//JUnit test
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
 @Test
 public void testComputeJoinPoint() {
     assertEquals(519, Solution.computeJoinPoint(471, 480));
     assertEquals(9, Solution.computeJoinPoint(9, 9));
     assertEquals(15, Solution.computeJoinPoint(10, 13));
     assertEquals(21, Solution.computeJoinPoint(18, 21));
 }
}