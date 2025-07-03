package com.bobocode.bst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    private BinarySearchTree<Integer> binarySearchTree;

    @BeforeEach
    public void setUp() {
        binarySearchTree = new RecursiveBinarySearchTree<>();
    }

    @Test
    @DisplayName("Test size of empty BinarySearchTree")
    public void testSizeOfEmptyBinarySearchTree() {
        int expected = 0;
        int actual = binarySearchTree.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test size of BinarySearchTree after adding elements")
    public void testSizeOfBinarySearchTreeAfterAddingElements() {
        binarySearchTree.add(7);
        binarySearchTree.add(14);
        binarySearchTree.add(-3);

        int expected = 3;
        int actual = binarySearchTree.size();

        assertEquals(expected, actual);
    }

}
