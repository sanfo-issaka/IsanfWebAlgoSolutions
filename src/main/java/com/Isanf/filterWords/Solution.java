package com.Isanf.filterWords;

import java.io.PrintStream;
import java.util.*;

class Solution {
    public static String[] filterWords(String[] words, String letters) {
        // Convert letters to a set for fast lookup
        Set<Character> letterSet = new HashSet<>();
        for (char c : letters.toCharArray()) {
            letterSet.add(c);
        }

        // Create a list to store the filtered words
        List<String> filteredWords = new ArrayList<>();

        // Filter the words
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (letterSet.contains(c)) {
                    filteredWords.add(word);
                    break;
                }
            }
        }

        // Convert the list to an array
        return filteredWords.toArray(new String[0]);
    }

    // This main method is for running the code manually, it can be ignored when running JUnit tests
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.nextLine();
        }
        String letters = in.nextLine();
        PrintStream outStream = System.out;
        System.setOut(System.err);
        String[] remaining = filterWords(words, letters);
        System.setOut(outStream);
        for (int i = 0; i < remaining.length; i++) {
            System.out.println(remaining[i]);
        }
    }
}

