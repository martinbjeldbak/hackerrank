package com.martinbjeldbak.javaifelse;

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
    void oddInput() {
        input = "3\n";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(defaultInput);

        assertEquals("Weird\n", outContent.toString());
    }

    @Test
    void evenAndBetween2and5() {
        input = "4\n";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(defaultInput);

        assertEquals("Not Weird\n", outContent.toString());
    }

    @Test
    void evenAndBetween6and20When8() {
        input = "8\n";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(defaultInput);

        assertEquals("Weird\n", outContent.toString());
    }

    @Test
    void evenAndBetween6and20When6() {
        input = "6\n";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(defaultInput);

        assertEquals("Weird\n", outContent.toString());
    }

    @Test
    void evenAndBetween6and20When20() {
        input = "20\n";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(defaultInput);

        assertEquals("Weird\n", outContent.toString());
    }

    @Test
    void evenAndGreaterThan20Input() {
        input = "24\n";

        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        Solution.main(defaultInput);

        assertEquals("Not Weird\n", outContent.toString());
    }
}
