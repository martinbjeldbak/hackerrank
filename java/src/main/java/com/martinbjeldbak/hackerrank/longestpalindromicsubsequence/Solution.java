package com.martinbjeldbak.hackerrank.longestpalindromicsubsequence;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/longest-palindromic-subsequence/problem
public class Solution {

    // NOTE: lps function copied from LongestPalindromicSubSequence object for easier pasting into Hackerrank
    static int lps(String x) {
        if(x.length() == 0)
            return 0;
        if(x.length() == 1)
            return 1;

        if(x.charAt(0) == x.charAt(x.length() - 1)) {
            return 2 + lps(x.substring(1, x.length() - 1));
        }
        else {
            return Math.max(lps(x.substring(0, x.length()-1)),
                    lps(x.substring(1, x.length())));
        }
    }

    static int longestPalindromicSubsequence(String s, int k) {
        int numberOfWays = 0;
        int targetPalindromeSubsequenceLength = lps(s) + k;

        for(char letter = 'a'; letter <= 'z'; letter++) {
            for(int i = 0; i < s.length() + 1; i++) {
                String sWithLetter = s.substring(0, i) + letter + s.substring(i);
                if(lps(sWithLetter) >= targetPalindromeSubsequenceLength) {
                    numberOfWays++;
                }
            }
        }

        return numberOfWays;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // Uncommented because Hackerrank uses environment variable to set output
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            String s = scanner.nextLine();

            int result = longestPalindromicSubsequence(s, k);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
