package com.Isanf.reshape;

import java.util.*;

class Solution { 
    public static String reshape(int n, String str) { 
        // Remove all spaces from the input string
        String noSpacesStr = str.replaceAll(" ", "");

        // Use a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Process the string in chunks of 'n' characters
        for (int i = 0; i < noSpacesStr.length(); i += n) {
            if (i > 0) {
                result.append("\n");
            }
            if (i + n <= noSpacesStr.length()) {
                result.append(noSpacesStr.substring(i, i + n));
            } else {
                result.append(noSpacesStr.substring(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(reshape(3, "abc de fghij"));
        System.out.println(reshape(2, "1 23 456"));
    }
}

