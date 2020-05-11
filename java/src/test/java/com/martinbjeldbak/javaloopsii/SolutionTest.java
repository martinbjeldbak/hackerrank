package com.martinbjeldbak.javaloopsii;

import com.martinbjeldbak.javaloopsii.Solution;
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
        input = "2\n" +
                "0 2 10\n" +
                "5 3 5";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(defaultInput);
        assertEquals(
                "2 6 14 30 62 126 254 510 1022 2046\n" +
                        "8 14 26 50 98\n",
                outContent.toString());
    }
}

