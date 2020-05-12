package com.martinbjeldbak.javaendoffile;

import java.util.NoSuchElementException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-end-of-file/problem
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer i = 1;
        String line;


        try {
            while((line = scanner.nextLine()) != "") {
                System.out.println(i + " " + line);
                i++;
            }
        } catch(NoSuchElementException ignored) {
        }
    }
}
