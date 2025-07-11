package com.bobocode.bst;

import java.util.function.Consumer;

/**
 * Binary search tree should have an API that allow provides the following functionality:
 * - insert an element and return true if it was inserted successfully
 * - search an element and return true it element exists
 * - get tree size
 * - get tree height
 * - perform in-order traversal by passing element @{@link java.util.function.Consumer} as a parameter
 */
public interface BinarySearchTree<E extends Comparable<E>> {

    boolean add(E element);

    boolean search(E element);

    int size();
    
    int height();
    
    void inOrderTraversal(Consumer<E> consumer);

}
