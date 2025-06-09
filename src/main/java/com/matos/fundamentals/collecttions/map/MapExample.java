package com.matos.fundamentals.collecttions.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates usage of Map in Java using HashMap.
 * A Map stores key-value pairs. Keys are unique, but values can be duplicated.
 */
public class MapExample {

    /**
     * Creates a map of country codes to country names.
     *
     * @return a populated HashMap with country codes
     */
    public Map<String, String> createCountryCodeMap() {
        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("PT", "Portugal");
        countryMap.put("FR", "France");
        countryMap.put("DE", "Germany");

        return countryMap;
    }

    /**
     * Retrieves a country name by its code.
     *
     * @param map       the map of country codes
     * @param code      the country code
     * @return the country name or null if not found
     */
    public String getCountryByCode(Map<String, String> map, String code) {
        return map.get(code);
    }

    /**
     * Updates or adds a country in the map.
     *
     * @param map        the map of country codes
     * @param code       the country code
     * @param country    the country name
     */
    public void addOrUpdateCountry(Map<String, String> map, String code, String country) {
        map.put(code, country);
    }

    /**
     * Removes a country by code.
     *
     * @param map   the map of country codes
     * @param code  the code to remove
     * @return true if the element was removed, false otherwise
     */
    public boolean removeCountryByCode(Map<String, String> map, String code) {
        return map.remove(code) != null;
    }
}

