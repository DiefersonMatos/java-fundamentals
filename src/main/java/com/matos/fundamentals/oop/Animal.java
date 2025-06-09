package com.matos.fundamentals.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Abstract class that represents a general Animal.
 * Demonstrates abstraction and inheritance.
 */
@Data
@AllArgsConstructor
public abstract class Animal {
    private String name;

    /**
     * Abstract method for the animal's sound.
     * Implemented by each subclass.
     *
     * @return sound of the animal
     */
    public abstract String makeSound();
}
