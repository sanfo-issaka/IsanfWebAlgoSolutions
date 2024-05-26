package com.Isanf.abstraction;

class Cat extends Animal {
    private final String name;

    /**
     * Creates a new cat with the given name.
     */
    Cat(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return name;
    }
}
