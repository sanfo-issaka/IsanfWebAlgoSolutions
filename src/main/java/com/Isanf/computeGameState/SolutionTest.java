package com.Isanf.computeGameState;

//JUnit Test
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
 @Test
 public void testComputeGameState() {
     assertEquals("Bob 30 - Anna 15", Solution.computeGameState("Bob", "Anna", new String[]{"Bob", "Anna", "Bob"}));
     assertEquals("DEUCE", Solution.computeGameState("Bob", "Anna", new String[]{"Bob", "Anna", "Bob", "Anna", "Bob", "Anna"}));
     assertEquals("Bob ADVANTAGE", Solution.computeGameState("Bob", "Anna", new String[]{"Bob", "Anna", "Bob", "Anna", "Bob", "Anna", "Bob"}));
     assertEquals("Anna ADVANTAGE", Solution.computeGameState("Bob", "Anna", new String[]{"Bob", "Anna", "Bob", "Anna", "Bob", "Anna", "Anna"}));
     assertEquals("Anna WINS", Solution.computeGameState("Bob", "Anna", new String[]{"Bob", "Anna", "Bob", "Anna", "Bob", "Anna", "Anna", "Anna"}));
     assertEquals("15a", Solution.computeGameState("Bob", "Anna", new String[]{"Bob", "Anna"}));
     assertEquals("30a", Solution.computeGameState("Bob", "Anna", new String[]{"Bob", "Anna", "Bob", "Anna"}));
     assertEquals("Bob 40 - Anna 0", Solution.computeGameState("Bob", "Anna", new String[]{"Bob", "Bob", "Bob"}));
     assertEquals("Bob 40 - Anna 15", Solution.computeGameState("Bob", "Anna", new String[]{"Bob", "Bob", "Anna", "Bob"}));
 }
}
