package com.Isanf.encode;

import java.util.*; 
import java.io.*; 

class Solution { 
    public static String encode(String plainText) { 
        if (plainText == null || plainText.length() == 0) {
            return "";
        }
        
        StringBuilder encoded = new StringBuilder();
        char currentChar = plainText.charAt(0);
        int count = 1;

        for (int i = 1; i < plainText.length(); i++) {
            if (plainText.charAt(i) == currentChar) {
                count++;
            } else {
                encoded.append(count).append(currentChar);
                currentChar = plainText.charAt(i);
                count = 1;
            }
        }
        // Append the last set of characters
        encoded.append(count).append(currentChar);
        
        return encoded.toString();
    } 

    /* Ignore and do not change the code below */ 
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in); 
        String plainText = in.nextLine(); 
        PrintStream outStream = System.out; 
        System.setOut(System.err); 
        String encoded = encode(plainText); 
        System.setOut(outStream); 
        System.out.println(encoded); 
    } 
    /* Ignore and do not change the code above */ 
}

