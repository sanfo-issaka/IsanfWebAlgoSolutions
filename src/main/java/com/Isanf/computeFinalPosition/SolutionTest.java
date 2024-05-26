package com.Isanf.computeFinalPosition;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testComputeFinalPosition() {
        assertArrayEquals(new int[]{3, 3}, Solution.computeFinalPosition(5, 4, new int[]{0, 0}, new int[]{1, 1}, new int[]{2, 3}, "DRR"));
        assertArrayEquals(new int[]{0, 0}, Solution.computeFinalPosition(5, 4, new int[]{0, 0}, new int[]{1, 1}, new int[]{2, 3}, ""));
        assertArrayEquals(new int[]{1, 1}, Solution.computeFinalPosition(5, 4, new int[]{0, 0}, new int[]{1, 1}, new int[]{2, 3}, "DR"));
        assertArrayEquals(new int[]{2, 3}, Solution.computeFinalPosition(5, 4, new int[]{1, 1}, new int[]{1, 1}, new int[]{2, 3}, "R"));
        assertArrayEquals(new int[]{4, 3}, Solution.computeFinalPosition(5, 4, new int[]{1, 1}, new int[]{1, 1}, new int[]{4, 3}, "RDDR"));
    }
}

