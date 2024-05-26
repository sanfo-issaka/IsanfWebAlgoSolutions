package com.Isanf.isDuoDigit;

import java.util.*; 
import java.io.*; 

class Solution { 
    public static String isDuoDigit(int number) { 
        String numStr = Integer.toString(number);
        Set<Character> digitSet = new HashSet<>();
        
        for (char ch : numStr.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitSet.add(ch);
            }
            if (digitSet.size() > 2) {
                return "n";
            }
        }
        
        return "y";
    } 
    
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in); 
        int number = in.nextInt(); 
        PrintStream outStream = System.out; 
        System.setOut(System.err); 
        String result = isDuoDigit(number); 
        System.setOut(outStream); 
        System.out.println(result); 
    } 
}

