package com.martinbjeldbak.javaifelse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if(N % 2 == 1) { // odd
            System.out.println("Weird");
        }
        else { // even
            if(N > 5 && N < 21) {
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }
    }
}

