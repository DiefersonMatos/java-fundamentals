package com.matos.fundamentals.collecttions.set;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the SetExample class.
 */
public class SetExampleTest {

    /**
     * Tests that the set created contains only unique elements.
     */
    @Test
    void testCreateUniqueNameSet() {
        SetExample example = new SetExample();
        Set<String> set = example.createUniqueNameSet();

        // Alice appears twice, so total should be 3
        assertEquals(3, set.size());
        assertTrue(set.contains("Alice"));
        assertTrue(set.contains("Bob"));
        assertTrue(set.contains("Charlie"));
    }

    /**
     * Tests the containsName method.
     */
    @Test
    void testContainsName() {
        SetExample example = new SetExample();
        Set<String> set = example.createUniqueNameSet();

        assertTrue(example.containsName(set, "Alice"));
        assertFalse(example.containsName(set, "Daniel"));
    }

    /**
     * Tests removal of an element from the set.
     */
    @Test
    void testRemoveName() {
        SetExample example = new SetExample();
        Set<String> set = example.createUniqueNameSet();

        boolean removed = example.removeName(set, "Bob");
        assertTrue(removed);
        assertFalse(set.contains("Bob"));

        boolean notRemoved = example.removeName(set, "Daniel");
        assertFalse(notRemoved);
    }
}
