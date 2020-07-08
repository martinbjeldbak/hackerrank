package com.martinbjeldbak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingTest {
    @Test
    void testExample1() {
        FindMissing subject = new FindMissing();

        assertEquals(5, subject.call(new int[] {4, 12, 9, 5, 6 }, new int[] {4, 9, 12, 6}));
    }
}
