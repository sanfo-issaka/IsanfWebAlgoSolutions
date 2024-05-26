package com.Isanf.abstraction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test
    public void testGetDogName() {
        Animal dog = new Dog("Buddy");
        assertEquals("Buddy", Application.getAnimalName(dog));
    }

    @Test
    public void testGetCatName() {
        Animal cat = new Cat("Whiskers");
        assertEquals("Whiskers", Application.getAnimalName(cat));
    }

    @Test
    public void testEmptyDogName() {
        Animal dog = new Dog("");
        assertEquals("", Application.getAnimalName(dog));
    }

    @Test
    public void testEmptyCatName() {
        Animal cat = new Cat("");
        assertEquals("", Application.getAnimalName(cat));
    }

    @Test
    public void testNullDogName() {
        Animal dog = new Dog(null);
        assertEquals(null, Application.getAnimalName(dog));
    }

    @Test
    public void testNullCatName() {
        Animal cat = new Cat(null);
        assertEquals(null, Application.getAnimalName(cat));
    }
}

