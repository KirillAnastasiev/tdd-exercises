package com.bobocode.bst;

import java.util.Objects;
import java.util.function.Consumer;

public class RecursiveBinarySearchTree<E extends Comparable<E>> implements BinarySearchTree<E> {

    private int size;
    private Node<E> root;

    @Override
    public boolean add(E element) {
        if (Objects.isNull(root)) {
            root = new Node<>(element);
            incrementSize();
            return true;
        } else {
            return addRecursive(root, element);
        }
    }

    @Override
    public boolean search(E element) {
        if (Objects.isNull(root)) {
            return false;
        } else {
            return searchRecursive(root, element);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int height() {
        if (Objects.isNull(root)) {
            return 0;
        } else {
            return computeHeightRecursive(root);
        }
    }

    @Override
    public void inOrderTraversal(Consumer<E> consumer) {
        //TODO
        throw new UnsupportedOperationException();
    }

    private boolean addRecursive(Node<E> currentRoot, E element) {
        if (currentRoot.element.compareTo(element) > 0) {
            if (Objects.isNull(currentRoot.left)) {
                return addLeft(currentRoot, element);
            } else {
                return addRecursive(currentRoot.left, element);
            }
        }

        if (currentRoot.element.compareTo(element) < 0) {
            if (Objects.isNull(currentRoot.right)) {
                return addRight(currentRoot, element);
            } else {
                return addRecursive(currentRoot.right, element);
            }
        }

        return false;
    }

    private boolean addRight(Node<E> currentRoot, E element) {
        currentRoot.right = new Node<>(element);
        incrementSize();
        return true;
    }

    private boolean addLeft(Node<E> currentRoot, E element) {
        currentRoot.left = new Node<>(element);
        incrementSize();
        return true;
    }

    private void incrementSize() {
        size++;
    }

    private boolean searchRecursive(Node<E> currentRoot, E element) {
        if (currentRoot.element.compareTo(element) > 0) {
            if (Objects.isNull(currentRoot.left)) {
                return false;
            } else {
                return searchRecursive(currentRoot.left, element);
            }
        }

        if (currentRoot.element.compareTo(element) < 0) {
            if (Objects.isNull(currentRoot.right)) {
                return false;
            } else {
                return searchRecursive(currentRoot.right, element);
            }
        }

        return true;
    }

    private int computeHeightRecursive(Node<E> currentRoot) {
        if (Objects.isNull(currentRoot)) {
            return 0;
        }

        return Math.max(computeHeightRecursive(currentRoot.left),
                        computeHeightRecursive(currentRoot.right)) + 1;
    }

    private static class Node<T extends Comparable<T>> {


        private T element;
        private Node<T> left;
        private Node<T> right;

        public Node(T element) {
            this.element = element;
        }

    }

}
