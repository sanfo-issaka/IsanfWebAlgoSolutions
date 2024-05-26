package com.Isanf.BST;

class Node {
    Node left, right;
    int value;

    public Node(int value) {
        this.value = value;
    }

    public Node find(int v) {
        // If the current node's value is equal to v, return the current node
        if (this.value == v) {
            return this;
        }
        // If v is less than the current node's value, search in the left subtree
        if (v < this.value && left != null) {
            return left.find(v);
        }
        // If v is greater than the current node's value, search in the right subtree
        if (v > this.value && right != null) {
            return right.find(v);
        }
        // If the value is not found, return null
        return null;
    }

    // Method to add a new value to the BST, useful for creating test cases
    public void add(int v) {
        if (v < this.value) {
            if (left == null) {
                left = new Node(v);
            } else {
                left.add(v);
            }
        } else {
            if (right == null) {
                right = new Node(v);
            } else {
                right.add(v);
            }
        }
    }
}

