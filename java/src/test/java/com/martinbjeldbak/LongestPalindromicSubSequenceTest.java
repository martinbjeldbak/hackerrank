package com.martinbjeldbak;

import com.martinbjeldbak.javastdinandstdoutii.Solution;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubSequenceTest {
    @Test
    void testCase1() {
        LongestPalindromicSubSequence subject = new LongestPalindromicSubSequence();

        assertEquals(7, subject.call("BBABCBCAB"));
    }
}
