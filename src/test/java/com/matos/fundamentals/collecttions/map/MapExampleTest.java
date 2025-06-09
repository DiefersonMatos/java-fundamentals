package com.matos.fundamentals.collecttions.map;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the MapExample class.
 */
public class MapExampleTest {

    /**
     * Tests the creation of the country map.
     */
    @Test
    void testCreateCountryCodeMap() {
        MapExample example = new MapExample();
        Map<String, String> map = example.createCountryCodeMap();

        assertEquals(3, map.size());
        assertEquals("Portugal", map.get("PT"));
        assertTrue(map.containsKey("DE"));
    }

    /**
     * Tests retrieval of a country by its code.
     */
    @Test
    void testGetCountryByCode() {
        MapExample example = new MapExample();
        Map<String, String> map = example.createCountryCodeMap();

        assertEquals("France", example.getCountryByCode(map, "FR"));
        assertNull(example.getCountryByCode(map, "IT"));
    }

    /**
     * Tests adding or updating a country in the map.
     */
    @Test
    void testAddOrUpdateCountry() {
        MapExample example = new MapExample();
        Map<String, String> map = example.createCountryCodeMap();

        example.addOrUpdateCountry(map, "IT", "Italy"); // Add
        assertEquals("Italy", map.get("IT"));

        example.addOrUpdateCountry(map, "PT", "República Portuguesa"); // Update
        assertEquals("República Portuguesa", map.get("PT"));
    }

    /**
     * Tests removal of a country from the map.
     */
    @Test
    void testRemoveCountryByCode() {
        MapExample example = new MapExample();
        Map<String, String> map = example.createCountryCodeMap();

        assertTrue(example.removeCountryByCode(map, "DE"));
        assertFalse(map.containsKey("DE"));

        assertFalse(example.removeCountryByCode(map, "ES")); // Not in map
    }
}
