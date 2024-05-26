package com.Isanf.solvepackage;

import java.util.*; 
import java.io.*; 
import java.math.*; 

class Player { 
    public static String solve(int width, int height, int length, int mass) { 
        int volume = width * height * length;
        boolean isEncombrant = volume >= 1000000 || width >= 150 || height >= 150 || length >= 150;
        boolean isLourd = mass >= 20;
        
        if (isEncombrant && isLourd) {
            return "REJECTED";
        } else if (isEncombrant || isLourd) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    } 
    
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in); 
        while (true) { 
            int width = in.nextInt(); 
            int height = in.nextInt(); 
            int length = in.nextInt(); 
            int mass = in.nextInt(); 
            PrintStream outStream = System.out; 
            System.setOut(System.err); 
            String action = solve(width, height, length, mass); 
            System.setOut(outStream); 
            System.out.println(action); 
        } 
    } 
}

