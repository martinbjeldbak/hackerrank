package com.martinbjeldbak.hackerrank.javaloopsi;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-loops-i
public class Solution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final int multiples = 10;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 1; i <= multiples; i++) {
            System.out.printf("%d x %d = %d%n", N, i, N * i);
        }

        scanner.close();
    }
}

