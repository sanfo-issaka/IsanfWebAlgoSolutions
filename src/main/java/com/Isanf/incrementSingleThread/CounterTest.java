package com.Isanf.incrementSingleThread;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CounterTest {

    @Test
    public void testIncrementSingleThread() {
        Counter.reset();
        assertEquals(1, Counter.increment());
        assertEquals(2, Counter.increment());
        assertEquals(3, Counter.increment());
    }

    @Test
    public void testIncrementMultipleThreads() throws InterruptedException {
        Counter.reset();
        int numberOfThreads = 1000;
        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(() -> {
                Counter.increment();
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        assertEquals(numberOfThreads, Counter.getCount());
    }
}

