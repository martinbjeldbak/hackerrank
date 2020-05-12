package com.martinbjeldbak.javastaticinitializerblock;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

// https://www.hackerrank.com/challenges/java-static-initializer-block/problem
public class Solution {
    static short B;
    static short H;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);

        B = scanner.nextShort();
        H = scanner.nextShort();

        scanner.close();

        flag = B > 0 && H > 0;
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}


