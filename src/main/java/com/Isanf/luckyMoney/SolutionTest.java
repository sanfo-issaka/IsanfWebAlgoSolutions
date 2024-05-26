package com.Isanf.luckyMoney;

//JUnit Test
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
 @Test
 public void testLuckyMoney() {
     assertEquals(0, Solution.luckyMoney(12, 2));
     assertEquals(2, Solution.luckyMoney(24, 4));
     assertEquals(0, Solution.luckyMoney(7, 2));
     assertEquals(0, Solution.luckyMoney(9, 2)); // Not enough money to make an 8-dollar gift
     assertEquals(1, Solution.luckyMoney(16, 2)); // One 8-dollar gift possible
     assertEquals(1, Solution.luckyMoney(15, 3)); // One 8-dollar gift possible after initial distribution
     assertEquals(0, Solution.luckyMoney(10, 5)); // Evenly distributed but no 8-dollar gift possible
     assertEquals(1, Solution.luckyMoney(23, 3)); // One 8-dollar gift and proper distribution
     assertEquals(0, Solution.luckyMoney(19, 5)); // Not enough money to make an 8-dollar gift after distribution
 }
}
