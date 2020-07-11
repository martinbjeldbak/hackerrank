package com.martinbjeldbak.hackerrank.javaloopsi;

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
        input = "2\n";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(defaultInput);
        assertEquals(
                "2 x 1 = 2\n" +
                        "2 x 2 = 4\n" +
                        "2 x 3 = 6\n" +
                        "2 x 4 = 8\n" +
                        "2 x 5 = 10\n" +
                        "2 x 6 = 12\n" +
                        "2 x 7 = 14\n" +
                        "2 x 8 = 16\n" +
                        "2 x 9 = 18\n" +
                        "2 x 10 = 20\n",
                outContent.toString());
    }
}

