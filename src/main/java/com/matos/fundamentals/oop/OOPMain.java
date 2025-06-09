package com.matos.fundamentals.oop;

import lombok.extern.log4j.Log4j2;

/**
 * Entry point to demonstrate OOP principles: inheritance, polymorphism, encapsulation.
 */
@Log4j2
public class OOPMain {
    public static void main(String[] args) {
        Animal dog = new Dog("Lemmy");
        Animal cat = new Cat("Blondie");

        log.info("{} says {}", dog.getName(), dog.makeSound());
        log.info("{} says {}", cat.getName(), cat.makeSound());;
    }
}