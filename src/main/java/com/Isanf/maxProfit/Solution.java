package com.Isanf.maxProfit;

import java.io.PrintStream;
import java.util.*;

class Solution {
    public static int[] maxProfit(int[] data) {
        int maxSoFar = data[0];
        int maxEndingHere = data[0];
        int start = 0;
        int end = 0;
        int s = 0;

        for (int i = 1; i < data.length; i++) {
            if (data[i] > maxEndingHere + data[i]) {
                maxEndingHere = data[i];
                s = i;
            } else {
                maxEndingHere += data[i];
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = s;
                end = i;
            }
        }

        return new int[]{start, end};
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
        int[] max = maxProfit(data);
        System.setOut(outStream);
        for (int i = 0; i < 2; i++) {
            System.out.println(max[i]);
        }
    }
}
