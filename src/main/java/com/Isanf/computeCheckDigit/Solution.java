package com.Isanf.computeCheckDigit;

import java.util.*; 
import java.io.*; 

class Solution { 
    public static int computeCheckDigit(String identificationNumber) { 
        int sumEvenPositions = 0;
        int sumOddPositions = 0;

        for (int i = 0; i < identificationNumber.length(); i++) {
            int digit = Character.getNumericValue(identificationNumber.charAt(i));
            if (i % 2 == 0) {
                sumEvenPositions += digit;
            } else {
                sumOddPositions += digit;
            }
        }

        int result = (sumEvenPositions * 3) + sumOddPositions;
        int lastDigit = result % 10;
        int checkDigit = lastDigit == 0 ? 0 : 10 - lastDigit;

        return checkDigit;
    } 

    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in); 
        String identificationNumber = in.next(); 
        PrintStream outStream = System.out; 
        System.setOut(System.err); 
        int checkDigit = computeCheckDigit(identificationNumber); 
        System.setOut(outStream); 
        System.out.println(checkDigit); 
    } 
}

