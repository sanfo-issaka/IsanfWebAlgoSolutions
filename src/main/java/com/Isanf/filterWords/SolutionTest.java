package com.Isanf.filterWords;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testFilterWords() {
        String[] words = {"the", "dog", "got", "a", "bone"};
        String letters = "ae";
        String[] result = Solution.filterWords(words, letters);
        String[] expected = {"the", "a", "bone"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFilterWordsNoMatches() {
        String[] words = {"cat", "dog", "fish"};
        String letters = "xyz";
        String[] result = Solution.filterWords(words, letters);
        String[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFilterWordsAllMatches() {
        String[] words = {"apple", "banana", "cherry"};
        String letters = "abc";
        String[] result = Solution.filterWords(words, letters);
        String[] expected = {"apple", "banana", "cherry"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFilterWordsMixedMatches() {
        String[] words = {"apple", "banana", "cherry", "date"};
        String letters = "de";
        String[] result = Solution.filterWords(words, letters);
        String[] expected = {"date"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFilterWordsEmptyLetters() {
        String[] words = {"apple", "banana", "cherry"};
        String letters = "";
        String[] result = Solution.filterWords(words, letters);
        String[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFilterWordsEmptyWords() {
        String[] words = {};
        String letters = "abc";
        String[] result = Solution.filterWords(words, letters);
        String[] expected = {};
        assertArrayEquals(expected, result);
    }
}

