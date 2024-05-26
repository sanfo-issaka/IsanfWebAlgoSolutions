package com.Isanf.translate;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testTranslate() {
        assertEquals("havellavo", Solution.translate("hello"));
        assertEquals("savecret maveetaving tavonavight.", Solution.translate("secret meeting tonight."));
        assertEquals("javavanaivais", Solution.translate("javais"));
        assertEquals("avav", Solution.translate("av"));
        assertEquals("z", Solution.translate("z"));
        assertEquals("avexavavampavel", Solution.translate("example"));
        assertEquals("havellavo, savecret maveetaving tavonavight.", Solution.translate("hello, secret meeting tonight."));
    }
}

