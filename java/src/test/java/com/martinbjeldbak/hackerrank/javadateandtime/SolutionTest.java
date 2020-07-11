package com.martinbjeldbak.hackerrank.javadateandtime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

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
        input = "08 05 2015\n";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        try {
            Solution.main(defaultInput);
        }
        catch(IOException ex) {
            System.out.println("Failed!");
        }
        assertEquals("WEDNESDAY\n", outContent.toString());
    }
}


