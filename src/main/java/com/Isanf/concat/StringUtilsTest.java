package com.Isanf.concat;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testConcatSingleElement() {
        assertEquals("foo", StringUtils.concat(new String[]{"foo"}));
    }

    @Test
    public void testConcatMultipleElements() {
        assertEquals("foobar", StringUtils.concat(new String[]{"foo", "bar"}));
        assertEquals("hello world", StringUtils.concat(new String[]{"hello ", "world"}));
        assertEquals("123456", StringUtils.concat(new String[]{"1", "2", "3", "4", "5", "6"}));
    }

    @Test
    public void testConcatEmptyStrings() {
        assertEquals("", StringUtils.concat(new String[]{""}));
        assertEquals("foo", StringUtils.concat(new String[]{"", "foo"}));
        assertEquals("bar", StringUtils.concat(new String[]{"bar", ""}));
    }

    @Test
    public void testConcatMixed() {
        assertEquals("foobar", StringUtils.concat(new String[]{"f", "o", "o", "bar"}));
        assertEquals("1234", StringUtils.concat(new String[]{"1", "2", "3", "4"}));
        assertEquals(" ", StringUtils.concat(new String[]{" ", ""}));
    }
}

