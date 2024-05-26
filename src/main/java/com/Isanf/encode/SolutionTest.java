package com.Isanf.encode;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testEncode() {
        assertEquals("2a1b2a", Solution.encode("aabaa"));
        assertEquals("4a1b3c3a", Solution.encode("aaaabcccaaa"));
        assertEquals("1a1b1c", Solution.encode("abc"));
        assertEquals("1a", Solution.encode("a"));
        assertEquals("2a", Solution.encode("aa"));
        assertEquals("3a2b3c", Solution.encode("aaabbccc"));
        assertEquals("10a", Solution.encode("aaaaaaaaaa"));
        assertEquals("2a2b2c2a2b2c", Solution.encode("aabbccaabbcc"));
    }
}

