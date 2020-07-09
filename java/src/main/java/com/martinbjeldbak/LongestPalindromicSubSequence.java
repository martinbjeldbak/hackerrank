package com.martinbjeldbak;

// https://www.hackerrank.com/challenges/longest-palindromic-subsequence/problem
public class LongestPalindromicSubSequence {

    // BBABCBCAB
    // Answer: BABCBAB of length 7 is the longest palindromic subsequence
    public int call(String x) {
        if(x.length() == 0)
            return 0;
        if(x.length() == 1)
            return 1;

        if(x.charAt(0) == x.charAt(x.length() - 1)) {
            return 2 + call(x.substring(1, x.length() - 1));
        }
        else {
            return Math.max(call(x.substring(0, x.length()-1)),
                            call(x.substring(1, x.length())));
        }
    }
}
