package com.matos.fundamentals.collecttions.list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for ListExample class.
 */
public class ListExampleTest {

    @Test
    void testManipulateList() {
        ListExample example = new ListExample();
        List<String> list = example.manipulateList();

        // After manipulation and sorting, list should be ["Apple", "Date"]
        assertEquals(2, list.size());
        assertEquals("Apple", list.get(0));
        assertEquals("Date", list.get(1));
    }

    @Test
    void testSearchFruit() {
        ListExample example = new ListExample();
        List<String> list = example.manipulateList();

        int index = example.searchFruit(list, "Date");
        assertTrue(index >= 0);

        int missingIndex = example.searchFruit(list, "Banana");
        assertTrue(missingIndex < 0);
    }
}
