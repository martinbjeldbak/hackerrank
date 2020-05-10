package com.martinbjeldbak.javaifelse;

import com.martinbjeldbak.javastdinandstdouti.Solution;
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
    private ByteArrayInputStream inContent;
    private String input;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @AfterEach
    public void tearDownStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }


    @Test
    void oddInput() {
        input = "3\n";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(new String[]{});

        assertEquals("Weird", outContent.toString());
    }

    @Test
    void evenInput() {
        input = "24\n";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(new String[]{});

        assertEquals("Not Weird", outContent.toString());
    }
}
