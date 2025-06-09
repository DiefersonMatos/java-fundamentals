package com.matos.fundamentals.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Object-Oriented Programming (OOP) examples in the {@code com.matos.fundamentals.oop} package.
 *
 * <p>This class tests the behavior of the {@link Dog} and {@link Cat} classes, ensuring that:
 * <ul>
 *   <li>Each animal makes the correct sound</li>
 *   <li>The name can be retrieved correctly</li>
 *   <li>The name can be changed (for Cat)</li>
 * </ul>
 *
 * <p>These tests demonstrate polymorphism, encapsulation, and class inheritance concepts.
 *
 * @author
 */
public class OOPTest {

    /**
     * Tests that a {@link Dog} object returns the correct sound ("Woof!") when {@code makeSound()} is called.
     */
    @Test
    void testDogMakeSound() {
        Dog dog = new Dog("Buddy");
        assertEquals("Woof!", dog.makeSound(), "Dog should bark");
    }

    /**
     * Tests that a {@link Cat} object returns the correct sound ("Meow!") when {@code makeSound()} is called.
     */
    @Test
    void testCatMakeSound() {
        Cat cat = new Cat("Whiskers");
        assertEquals("Meow!", cat.makeSound(), "Cat should meow");
    }

    /**
     * Tests that the {@code getName()} method of {@link Dog} returns the correct name after initialization.
     */
    @Test
    void testDogName() {
        Dog dog = new Dog("Rex");
        assertEquals("Rex", dog.getName());
    }

    /**
     * Tests that the {@code setName()} method of {@link Cat} properly changes the name,
     * and that {@code getName()} reflects this change.
     */
    @Test
    void testCatNameChange() {
        Cat cat = new Cat("Luna");
        cat.setName("Mimi");
        assertEquals("Mimi", cat.getName());
    }
}
