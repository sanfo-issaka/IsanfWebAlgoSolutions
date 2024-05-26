package com.Isanf.computeJoinPoint;

import java.io.PrintStream;
import java.util.*;

class Solution {
    public static int computeJoinPoint(int s1, int s2) {
        while (s1 != s2) {
            if (s1 < s2) {
                s1 += sumOfDigits(s1);
            } else {
                s2 += sumOfDigits(s2);
            }
        }
        return s1;
    }

    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int res = computeJoinPoint(s1, s2);
        System.setOut(outStream);
        System.out.println(res);
    }
}
