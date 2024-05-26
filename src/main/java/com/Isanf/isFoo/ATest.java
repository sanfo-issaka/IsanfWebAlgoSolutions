package com.Isanf.isFoo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ATest {

    @Test
    public void testIsFooWithFoo() {
        assertTrue(A.isFoo("foo"));
    }

    @Test
    public void testIsFooWithDifferentString() {
        assertFalse(A.isFoo("bar"));
    }

    @Test
    public void testIsFooWithEmptyString() {
        assertFalse(A.isFoo(""));
    }

    @Test
    public void testIsFooWithNull() {
        assertFalse(A.isFoo(null));
    }

    @Test
    public void testIsFooWithFooCaseInsensitive() {
        assertFalse(A.isFoo("Foo"));
    }
}

