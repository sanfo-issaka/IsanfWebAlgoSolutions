package com.Isanf.reshape;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testReshape() {
        // Test cases
        assertEquals("abc\ndef\nghi\nj", Solution.reshape(3, "abc de fghij"));
        assertEquals("12", Solution.reshape(2, "1 23 456"));
        assertEquals("abcdefghij", Solution.reshape(10, "abc de fghij"));
        assertEquals("a\nb\nc", Solution.reshape(1, "a b c"));
        assertEquals("", Solution.reshape(2, "  "));
    }
}

