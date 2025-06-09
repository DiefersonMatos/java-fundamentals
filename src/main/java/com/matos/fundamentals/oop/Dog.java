package com.matos.fundamentals.oop;

/**
 * Represents a Dog.
 * Inherits from Animal and implements the makeSound method.
 */
public class Dog extends Animal {

    /**
     * Constructs a new Dog with the given name.
     *
     * @param name dog's name
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Returns the sound a dog makes.
     *
     * @return the sound string
     */
    @Override
    public String makeSound() {
        return "Woof!";
    }
}

