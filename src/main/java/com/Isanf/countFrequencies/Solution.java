package com.Isanf.countFrequencies;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.TreeMap;

class Solution { 
    public static int[] countFrequencies(String[] words) { 
        // Use a TreeMap to store the frequency of each word, which automatically sorts the keys
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();
        
        // Count the frequency of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        // Convert the frequency values to an array
        int[] frequencies = new int[wordCountMap.size()];
        int index = 0;
        for (int count : wordCountMap.values()) {
            frequencies[index++] = count;
        }
        
        return frequencies;
    } 
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); 
        int x = in.nextInt(); 
        if (in.hasNextLine()) { 
            in.nextLine(); 
        } 
        String[] words = new String[n]; 
        for (int i = 0; i < n; i++) { 
            words[i] = in.nextLine(); 
        } 
        PrintStream outStream = System.out; 
        System.setOut(System.err); 
        int[] counts = countFrequencies(words); 
        System.setOut(outStream); 
        for (int i = 0; i < x; i++) { 
            System.out.println(counts[i]); 
        } 
    } 
} 