package com.matos.fundamentals.collecttions.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates common operations on Java List (ArrayList).
 * Shows adding, removing, updating, iterating, sorting, and searching.
 */
public class ListExample {

    /**
     * Creates a list of fruits and performs add, remove, update, sort and search operations.
     *
     * @return the final list after operations
     */
    public List<String> manipulateList() {
        List<String> list = new ArrayList<>();
        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Remove "Banana"
        list.remove("Banana");

        // Update element at index 1 to "Date"
        list.set(1, "Date");

        // Sort the list alphabetically
        Collections.sort(list);

        return list;
    }

    /**
     * Searches for a fruit in the sorted list using binary search.
     *
     * @param list sorted list of fruits
     * @param fruit fruit name to search
     * @return index of fruit if found, else negative value
     */
    public int searchFruit(List<String> list, String fruit) {
        return Collections.binarySearch(list, fruit);
    }
}

