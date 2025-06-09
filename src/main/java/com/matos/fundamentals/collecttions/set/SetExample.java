package com.matos.fundamentals.collecttions.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Demonstrates usage of Set in Java using HashSet.
 * A Set does not allow duplicate elements and has no guaranteed order.
 */
public class SetExample {

    /**
     * Adds several names to a set and demonstrates uniqueness.
     *
     * @return a set containing unique names
     */
    public Set<String> createUniqueNameSet() {
        Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Duplicate, will not be added

        return names;
    }

    /**
     * Checks if a name exists in the set.
     *
     * @param set  the set of names
     * @param name the name to search for
     * @return true if the name is present, false otherwise
     */
    public boolean containsName(Set<String> set, String name) {
        return set.contains(name);
    }

    /**
     * Removes a name from the set.
     *
     * @param set  the set of names
     * @param name the name to remove
     * @return true if the name was removed, false if it did not exist
     */
    public boolean removeName(Set<String> set, String name) {
        return set.remove(name);
    }
}

