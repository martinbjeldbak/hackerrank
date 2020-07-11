package com.martinbjeldbak.hackerrank.javaifelse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final String output;

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if((N % 2 == 1) || (N > 5 && N < 21)) {
            output = "Weird";
        }
        else { // even
            output = "Not Weird";
        }

        System.out.println(output);
    }
}

