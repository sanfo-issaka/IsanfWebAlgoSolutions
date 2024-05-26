package com.Isanf.asciiArtMap;

import static org.junit.Assert.*;
import org.junit.Test;

public class ATest {

    @Test
    public void testScanChar() {
        // Mock ASCII art representations for testing
        String aArt = " A \nA A\nAAA\nA A\nA A";
        String bArt = "BB \nB B\nBB \nB B\nBB ";

        assertEquals('A', A.scanChar(aArt));
        assertEquals('B', A.scanChar(bArt));
    }

    @Test
    public void testScanCharInvalid() {
        // Test with an invalid ASCII art
        String invalidArt = "Invalid\nArt";
        assertEquals('?', A.scanChar(invalidArt));
    }

    @Test
    public void testScanCharBoundary() {
        // Test with edge cases
        String zArt = "ZZZ\n  Z\n Z \nZ  \nZZZ";
        assertEquals('Z', A.scanChar(zArt));
    }

    // Additional test cases can be added to ensure full coverage
}

