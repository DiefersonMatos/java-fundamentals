package com.matos.fundamentals.oop;

/**
 * Represents a Cat.
 * Inherits from Animal and implements the makeSound method.
 */
public class Cat extends Animal {

    /**
     * Constructs a new Cat with the given name.
     *
     * @param name cat's name
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Returns the sound a cat makes.
     *
     * @return the sound string
     */
    @Override
    public String makeSound() {
        return "Meow!";
    }
}