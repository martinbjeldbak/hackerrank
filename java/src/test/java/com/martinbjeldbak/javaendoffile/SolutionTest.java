package com.martinbjeldbak.javaendoffile;

import com.martinbjeldbak.javaendoffile.Solution;
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
        input = "Hello world\n" +
                "I am a file\n" +
                "Read me until end-of-file.";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(defaultInput);
        assertEquals(
                "1 Hello world\n" +
                         "2 I am a file\n" +
                         "3 Read me until end-of-file.\n",
                outContent.toString());
    }
}

