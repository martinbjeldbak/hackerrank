package com.martinbjeldbak;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.martinbjeldbak.welcometojava.Solution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDownStreams() {
        System.setOut(originalOut);
    }

    @Test
    void itPrintsHelloToStdOut() {
        Solution.main(new String[]{});

        assertEquals("Hello, World.\nHello, Java.\n", outContent.toString());
    }
}
