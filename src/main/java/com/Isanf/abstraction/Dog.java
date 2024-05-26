package com.Isanf.abstraction;

class Dog extends Animal {
    private final String name;

    /**
     * Creates a new dog with the given name.
     */
    Dog(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return name;
    }
}
