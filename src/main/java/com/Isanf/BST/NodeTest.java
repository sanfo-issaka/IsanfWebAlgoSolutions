package com.Isanf.BST;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class NodeTest {
    @Test
    public void testFindSmallTree() {
        // Creating the small tree from the example
        Node small = new Node(9);
        small.add(7);
        small.add(13);
        small.add(5);
        small.add(8);
        small.add(17);
        small.add(2);
        small.add(6);
        small.add(16);

        // Test cases for the small tree
        assertEquals(9, small.find(9).value);
        assertEquals(7, small.find(7).value);
        assertEquals(13, small.find(13).value);
        assertEquals(5, small.find(5).value);
        assertEquals(8, small.find(8).value);
        assertEquals(17, small.find(17).value);
        assertEquals(2, small.find(2).value);
        assertEquals(6, small.find(6).value);
        assertEquals(16, small.find(16).value);
        assertNull(small.find(10));  // Value not in the tree
    }

    @Test
    public void testFindLargeTree() {
        // Creating the large tree with height 100000, values from 100000 to 0
        Node large = new Node(100000);
        Node current = large;
        for (int i = 99999; i >= 0; i--) {
            current.left = new Node(i);
            current = current.left;
        }

        // Test cases for the large tree
        assertEquals(100000, large.find(100000).value);
        assertEquals(0, large.find(0).value);
        assertEquals(50000, large.find(50000).value);
        assertNull(large.find(100001));  // Value not in the tree
    }
}
