package com.Isanf.optimalChange;

//JUnit Test
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {
 @Test
 public void testOptimalChange() {
     // Test cases from the problem description
     assertNull(Solution.optimalChange(1));
     
     Change expected = new Change();
     expected.coin2 = 3;
     assertEquals(expected, Solution.optimalChange(6));
     
     expected = new Change();
     expected.bill10 = 1;
     assertEquals(expected, Solution.optimalChange(10));
     
     expected = new Change();
     expected.bill10 = 922337203685477580L;
     expected.coin2 = 1;
     expected.bill5 = 1;
     assertEquals(expected, Solution.optimalChange(9223372036854775807L));
     
     // Additional test cases
     expected = new Change();
     expected.coin2 = 0;
     expected.bill5 = 1;
     expected.bill10 = 0;
     assertEquals(expected, Solution.optimalChange(5));

     expected = new Change();
     expected.coin2 = 1;
     expected.bill5 = 1;
     expected.bill10 = 0;
     assertEquals(expected, Solution.optimalChange(7));

     expected = new Change();
     expected.coin2 = 4;
     expected.bill5 = 0;
     expected.bill10 = 0;
     assertEquals(expected, Solution.optimalChange(8));

     expected = new Change();
     expected.coin2 = 0;
     expected.bill5 = 0;
     expected.bill10 = 2;
     assertEquals(expected, Solution.optimalChange(20));
 }
}
