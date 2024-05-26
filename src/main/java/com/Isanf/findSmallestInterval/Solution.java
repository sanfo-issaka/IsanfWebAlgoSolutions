package com.Isanf.findSmallestInterval;

import java.util.*; 
import java.io.*; 
import java.math.*; 

class Solution { 
    public static int findSmallestInterval(int[] numbers) { 
        // Sorting the array to find the smallest interval efficiently
        Arrays.sort(numbers);
        
        // Initialize the smallest interval to a large value
        int smallestInterval = Integer.MAX_VALUE;
        
        // Iterate through the sorted array and find the smallest difference
        for (int i = 1; i < numbers.length; i++) {
            int interval = numbers[i] - numbers[i - 1];
            if (interval < smallestInterval) {
                smallestInterval = interval;
            }
        }
        
        return smallestInterval;
    } 

    /* Ignore and do not change the code below */ 
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); 
        int[] numbers = new int[n]; 
        for (int i = 0; i < n; i++) { 
            numbers[i] = in.nextInt(); 
        } 
        PrintStream outStream = System.out; 
        System.setOut(System.err); 
        int res = findSmallestInterval(numbers); 
        System.setOut(outStream); 
        System.out.println(res); 
    } 
    /* Ignore and do not change the code above */ 
}

