package com.Isanf.findNetworkEndpoint;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testFindNetworkEndpoint() {
        int[] fromIds1 = {1, 7, 3, 4, 2, 6, 9};
        int[] toIds1 = {3, 3, 4, 6, 6, 9, 5};
        assertEquals(5, Solution.findNetworkEndpoint(2, fromIds1, toIds1));
        assertEquals(5, Solution.findNetworkEndpoint(1, fromIds1, toIds1));
        assertEquals(5, Solution.findNetworkEndpoint(3, fromIds1, toIds1));
        assertEquals(5, Solution.findNetworkEndpoint(4, fromIds1, toIds1));
        assertEquals(5, Solution.findNetworkEndpoint(6, fromIds1, toIds1));
        assertEquals(5, Solution.findNetworkEndpoint(9, fromIds1, toIds1));
        
        int[] fromIds2 = {1, 2, 3, 4};
        int[] toIds2 = {2, 3, 4, 1};  // Forms a cycle
        assertEquals(1, Solution.findNetworkEndpoint(1, fromIds2, toIds2));
        assertEquals(2, Solution.findNetworkEndpoint(2, fromIds2, toIds2));
        assertEquals(3, Solution.findNetworkEndpoint(3, fromIds2, toIds2));
        assertEquals(4, Solution.findNetworkEndpoint(4, fromIds2, toIds2));
        
        int[] fromIds3 = {1, 2, 3};
        int[] toIds3 = {2, 3, 4};  // No cycle, end at 4
        assertEquals(4, Solution.findNetworkEndpoint(1, fromIds3, toIds3));
        assertEquals(4, Solution.findNetworkEndpoint(2, fromIds3, toIds3));
        assertEquals(4, Solution.findNetworkEndpoint(3, fromIds3, toIds3));
    }
}

