package com.Isanf.closestToZero;

import java.util.Scanner;

class Solution {
    public static int closestToZero(int[] ints) {
        if (ints == null || ints.length == 0) {
            return 0;
        }

        int closest = ints[0];
        for (int num : ints) {
            if (Math.abs(num) < Math.abs(closest) || (Math.abs(num) == Math.abs(closest) && num > closest)) {
                closest = num;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = in.nextInt();
        }
        System.out.println(closestToZero(ints));
    }
}
