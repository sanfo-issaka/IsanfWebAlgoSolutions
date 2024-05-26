package com.Isanf.asciiArtMap;

import java.util.HashMap;
import java.util.Map;


class A {
    private static final Map<String, Character> asciiArtMap = new HashMap<>();

    static {
        // Initialize the map with ASCII art representations for each character A-Z
        for (char c = 'A'; c <= 'Z'; c++) {
            asciiArtMap.put(AsciiArt.printChar(c), c);
        }
    }

    /** 
     * @return the char that is represented by s 
     */ 
    static char scanChar(String s) { 
        return asciiArtMap.getOrDefault(s, '?');
    }
}

