package com.martinbjeldbak.hackerrank.javadatatypes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private final InputStream originalIn = System.in;
    private final String[] defaultInput = new String[]{};
    private ByteArrayInputStream inContent;
    private String input;

    @BeforeEach
    void init() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testCase1() {
        input = "5\n" +
                "-150\n" +
                "150000\n" +
                "1500000000\n" +
                "213333333333333333333333333333333333\n" +
                "-100000000000000\n";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(defaultInput);
        assertEquals(
                "-150 can be fitted in:\n" +
                        "* short\n" +
                        "* int\n" +
                        "* long\n" +
                        "150000 can be fitted in:\n" +
                        "* int\n" +
                        "* long\n" +
                        "1500000000 can be fitted in:\n" +
                        "* int\n" +
                        "* long\n" +
                        "213333333333333333333333333333333333 can't be fitted anywhere.\n" +
                        "-100000000000000 can be fitted in:\n" +
                        "* long\n",
                outContent.toString());
    }

}
