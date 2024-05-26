package com.Isanf.computeMultiplesSum;

import java.util.*; 
import java.io.*; 
import java.math.*; 

class Solution { 
    public static int computeMultiplesSum(int n) { 
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    } 
    
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); 
        PrintStream outStream = System.out; 
        System.setOut(System.err); 
        int res = computeMultiplesSum(n); 
        System.setOut(outStream); 
        System.out.println(res); 
    } 
}

