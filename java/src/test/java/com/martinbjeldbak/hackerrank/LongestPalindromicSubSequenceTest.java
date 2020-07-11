package com.martinbjeldbak.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubSequenceTest {
    LongestPalindromicSubSequence subject = new LongestPalindromicSubSequence();

    @Test
    // BBABCBCAB
    // BABCBAB of length 7 is the longest palindromic subsequence
    void testCase1() {
        assertEquals(7, subject.call("BBABCBCAB"));
    }

    // BBBAB
    // BBBB of length 4 is the longest
    @Test
    void testCase2() {
        assertEquals(4, subject.call("BBBAB"));
    }
}
