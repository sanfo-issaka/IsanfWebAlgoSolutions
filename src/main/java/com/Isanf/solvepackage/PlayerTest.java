package com.Isanf.solvepackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void testStandardPackage() {
        assertEquals("STANDARD", Player.solve(100, 100, 100, 10));
        assertEquals("STANDARD", Player.solve(50, 50, 50, 15));
    }

    @Test
    public void testSpecialPackage() {
        assertEquals("SPECIAL", Player.solve(200, 100, 50, 10));
        assertEquals("SPECIAL", Player.solve(100, 100, 100, 30));
        assertEquals("SPECIAL", Player.solve(200, 200, 2, 10));
        assertEquals("SPECIAL", Player.solve(100, 100, 100, 20));
    }

    @Test
    public void testRejectedPackage() {
        assertEquals("REJECTED", Player.solve(200, 200, 200, 25));
        assertEquals("REJECTED", Player.solve(150, 150, 150, 20));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("SPECIAL", Player.solve(150, 100, 100, 10));
        assertEquals("SPECIAL", Player.solve(100, 150, 100, 10));
        assertEquals("SPECIAL", Player.solve(100, 100, 150, 10));
        assertEquals("REJECTED", Player.solve(150, 150, 150, 20));
    }
}

