package com.Isanf.count;

import java.util.*;

class Solution {

    /** Counts the number of pairs for n players. */
    static int count(int n) {
        if (n < 2) {
            return 0;
        }
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(count(n));
    }
}
