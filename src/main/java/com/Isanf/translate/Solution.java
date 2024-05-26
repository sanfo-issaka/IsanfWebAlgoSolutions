package com.Isanf.translate;

import java.util.*; 
import java.io.*; 

class Solution { 
    public static String translate(String text) { 
        StringBuilder javanais = new StringBuilder();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (vowels.contains(c) && (i == 0 || !vowels.contains(text.charAt(i - 1)))) {
                javanais.append("av");
            }
            javanais.append(c);
        }

        return javanais.toString();
    } 

    /* Ignore and do not change the code below */ 
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in); 
        String text = in.nextLine(); 
        PrintStream outStream = System.out; 
        System.setOut(System.err); 
        String javanais = translate(text); 
        System.setOut(outStream); 
        System.out.println(javanais); 
    } 
    /* Ignore and do not change the code above */ 
}

