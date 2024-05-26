package com.Isanf.findSumPair;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static int[] findSumPair(int[] numbers, int k) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            int complement = k - numbers[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] {numToIndex.get(complement), i};
            }
            if (!numToIndex.containsKey(numbers[i])) {
                numToIndex.put(numbers[i], i);
            }
        }
        
        return new int[] {0, 0};
    }
    
    // This main method is for running the code manually, it can be ignored when running JUnit tests
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int[] pairs = findSumPair(numbers, k);
        System.setOut(outStream);
        for (int i = 0; i < 2; i++) {
            System.out.println(pairs[i]);
        }
    }
}
