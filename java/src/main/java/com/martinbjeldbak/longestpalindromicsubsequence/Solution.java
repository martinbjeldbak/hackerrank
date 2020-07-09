package com.martinbjeldbak.longestpalindromicsubsequence;

import com.martinbjeldbak.LongestPalindromicSubSequence;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/longest-palindromic-subsequence/problem
public class Solution {

    static LongestPalindromicSubSequence lps = new LongestPalindromicSubSequence();

    // Complete the longestPalindromicSubsequence function below.
    static int longestPalindromicSubsequence(String s, int k) {
        //System.out.println("Evaluating " + s);

        int numberOfWays = 0;
        int sLongestPalindromicSubsequence = lps.call(s);

        for(char letter = 'a'; letter <= 'z'; letter++) {
            for(int i = 0; i < s.length() + 1; i++) {
                String sWithLetter = s.substring(0, i) + letter + s.substring(i);
                if(lps.call(sWithLetter) >= (sLongestPalindromicSubsequence + k)) {
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
