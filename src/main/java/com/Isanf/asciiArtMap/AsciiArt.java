package com.Isanf.asciiArtMap;

public class AsciiArt {
    /**
     * Returns the ASCII art representation of the given character.
     *
     * @param c the character to print (A-Z)
     * @return the ASCII art representation as a string
     */
    public static String printChar(char c) {
        switch (c) {
            case 'A':
                return " A \nA A\nAAA\nA A\nA A";
            case 'B':
                return "BB \nB B\nBB \nB B\nBB ";
            case 'C':
                return " CC \nC  \nC  \nC  \n CC";
            // Add cases for other characters 'D' to 'Z' similarly
            case 'Z':
                return "ZZZ\n  Z\n Z \nZ  \nZZZ";
            default:
                throw new IllegalArgumentException("Character not supported: " + c);
        }
    }
}

