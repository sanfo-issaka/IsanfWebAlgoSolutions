package com.Isanf.isTwin;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testIsTwin() {
        assertTrue(Solution.isTwin("Marion", "Romain"));
        assertTrue(Solution.isTwin("Listen", "Silent"));
        assertTrue(Solution.isTwin("Triangle", "Integral"));
        assertFalse(Solution.isTwin("Apple", "Papel"));
        assertFalse(Solution.isTwin("Hello", "Olelh"));
        assertFalse(Solution.isTwin("Test", "Taste"));
        assertTrue(Solution.isTwin("Dormitory", "DirtyRoom"));
        assertTrue(Solution.isTwin("Schoolmaster", "Theclassroom"));
        assertFalse(Solution.isTwin("Python", "Typhon"));
        assertTrue(Solution.isTwin("Evil", "Vile"));
    }
}

