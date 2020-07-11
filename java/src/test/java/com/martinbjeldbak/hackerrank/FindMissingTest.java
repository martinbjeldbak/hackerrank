package com.martinbjeldbak.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingTest {
    @Test
    void testSetImplementation() {
        FindMissing subject = new FindMissing();

        assertEquals(5, subject.call(new int[] {4, 12, 9, 5, 6 }, new int[] {4, 9, 12, 6}));
    }

    @Test
    void testSetImplementationWithoutMatch() {
        FindMissing subject = new FindMissing();

        assertEquals(-1, subject.call(new int[] {4, 12, 9, 6 }, new int[] {4, 9, 12, 6}));
    }

    @Test
    void testArrayImplementation() {
        FindMissing subject = new FindMissing();

        assertEquals(5, subject.callArrayImplementation(new int[] {4, 12, 9, 5, 6 }, new int[] {4, 9, 12, 6}));
    }
}
