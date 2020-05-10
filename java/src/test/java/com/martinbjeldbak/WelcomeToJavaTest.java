package com.martinbjeldbak;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WelcomeToJavaTest {
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

    private final WelcomeToJava instance = new WelcomeToJava();

    @Test
    void itPrintsHelloToStdOut() {
        instance.print();

        assertEquals("Hello, World.\nHello, Java.\n", outContent.toString());
    }
}
