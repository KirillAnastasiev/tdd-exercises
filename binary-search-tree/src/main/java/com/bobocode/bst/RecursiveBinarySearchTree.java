package com.bobocode.bst;

import java.util.function.Consumer;

public class RecursiveBinarySearchTree<E extends Comparable<E>> implements BinarySearchTree<E> {

    private int size;

    @Override
    public boolean add(E element) {
        //TODO
        incrementSize();
        return true;
//        throw new UnsupportedOperationException();
    }

    @Override
    public boolean search(E element) {
        //TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int height() {
        //TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public void inOrderTraversal(Consumer<E> consumer) {
        //TODO
        throw new UnsupportedOperationException();
    }

    private void incrementSize() {
        size++;
    }

}
