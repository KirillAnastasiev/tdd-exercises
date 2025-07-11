package com.bobocode.bst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    private BinarySearchTree<Integer> binarySearchTree;

    @BeforeEach
    public void setUp() {
        binarySearchTree = new RecursiveBinarySearchTree<>();
    }

    @Test
    @DisplayName("Test of adding element to BinarySearchTree")
    public void testOfAddingElementsToBinarySearchTree() {
        boolean actual = binarySearchTree.add(7);

        assertTrue(actual);

        ////////////////////////////////////////////////

        actual = binarySearchTree.add(14);

        assertTrue(actual);

        ////////////////////////////////////////////////

        actual = binarySearchTree.add(-3);

        assertTrue(actual);
    }

    @Test
    @DisplayName("Test of adding element to BinarySearchTree that already contains such element")
    public void testOfAddingElementToBinarySearchTreeThatAlreadyContainsSuchElement() {
        binarySearchTree.add(7);
        binarySearchTree.add(14);
        binarySearchTree.add(-3);
        binarySearchTree.add(2);
        binarySearchTree.add(100);
        binarySearchTree.add(0);

        boolean actual = binarySearchTree.add(2);

        assertFalse(actual);
    }

    @Test
    @DisplayName("Test of searching element in empty BinarySearchTree")
    public void testOfSearchingElementInEmptyBinarySearchTree() {
        boolean actual = binarySearchTree.search(7);

        assertFalse(actual);
    }

    @Test
    @DisplayName("Test of searching elements in BinarySearchTree")
    public void testOfSearchingElementsInBinarySearchTree() {
        binarySearchTree.add(7);
        binarySearchTree.add(14);
        binarySearchTree.add(-3);
        binarySearchTree.add(2);
        binarySearchTree.add(100);
        binarySearchTree.add(0);

        boolean actual = binarySearchTree.search(14);

        assertTrue(actual);

        ////////////////////////////////////////////////

        actual = binarySearchTree.search(2);

        assertTrue(actual);

        ////////////////////////////////////////////////

        actual = binarySearchTree.search(7);

        assertTrue(actual);

        ////////////////////////////////////////////////

        actual = binarySearchTree.search(-7);

        assertFalse(actual);
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

    @Test
    @DisplayName("Test height of empty BinarySearchTree")
    public void testHeightOfEmptyBinarySearchTree() {
        int expected = 0;
        int actual = binarySearchTree.height();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test height of BinarySearchTree")
    public void testHeightOfBinarySearchTree() {
        binarySearchTree.add(7);
        binarySearchTree.add(14);
        binarySearchTree.add(-3);
        binarySearchTree.add(2);
        binarySearchTree.add(100);
        binarySearchTree.add(55);
        binarySearchTree.add(0);
        binarySearchTree.add(-5);
        binarySearchTree.add(-1);

        int expected = 5;
        int actual = binarySearchTree.height();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test in order traversal of BinarySearchTree")
    public void testInOrderTraversalOfBinarySearchTree() {
        binarySearchTree.add(7);
        binarySearchTree.add(14);
        binarySearchTree.add(-3);
        binarySearchTree.add(2);
        binarySearchTree.add(100);
        binarySearchTree.add(0);

        List<Integer> list = new ArrayList<>();
        binarySearchTree.inOrderTraversal(e -> list.add(e * 2));

        List<Integer> expected = List.of(-6, 0, 4, 14, 28, 200);
        List<Integer> actual = list;

        assertEquals(expected, actual);
    }

}
