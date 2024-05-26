package com.Isanf.filterDuplicates;

import java.io.PrintStream;
import java.util.*;

class Solution { 
    public static int[] filterDuplicates(int[] data) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int value : data) {
            set.add(value);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int value : set) {
            result[index++] = value;
        }
        return result;
    }
    
    /* Ignore and do not change the code below */ 
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); 
        int[] data = new int[n]; 
        for (int i = 0; i < n; i++) { 
            data[i] = in.nextInt(); 
        } 
        PrintStream outStream = System.out; 
        System.setOut(System.err); 
        int[] filtered = filterDuplicates(data); 
        System.setOut(outStream); 
        for (int i = 0; i < filtered.length; i++) { 
            System.out.println(filtered[i]); 
        } 
    } 
    /* Ignore and do not change the code above */ 
}
