package com.Isanf.isTwin;

import java.util.Arrays;

class Solution { 
    public static boolean isTwin(String a, String b) { 
        // Convert both strings to lower case to ignore case sensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If the lengths are not the same, they can't be twins
        if (a.length() != b.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        // Sort the char arrays
        Arrays.sort(aArray);
        Arrays.sort(bArray);

        // Compare the sorted char arrays
        return Arrays.equals(aArray, bArray);
    }
}
