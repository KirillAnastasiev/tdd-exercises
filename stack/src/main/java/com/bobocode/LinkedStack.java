package com.bobocode;

import java.util.Objects;

/**
 *
 * {@link LinkedStack} is a data structure that follows "last in, first out" rule (LIFO).
 * <br/>
 * {@link LinkedStack} implements {@link Stack} interface by linking of single generic nodes
 * which are implemented by static nested class {@link Node}
 */
public class LinkedStack<T> implements Stack<T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;

    /**
     * Adds an element to the beginning of the stack.
     *
     * @param element the element to add
     */
    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);

        if (Objects.isNull(head)) {
            head = tail = newNode;
        } else {
            newNode.previous = tail;
            tail = newNode;
        }

        size++;
    }

    /**
     * Retrieves and removes stack head.
     *
     * @return an element that was retrieved from the head or null if stack is empty
     */
    @Override
    public T pop() {
        //TODO
        Node<T> resultNode = tail;
        tail = resultNode.previous;

        size--;

        return resultNode.value;
    }

    /**
     * Returns a size of the stack.
     *
     * @return an integer value that is a size of stack
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return {@code true} if the stack is empty, returns {@code false} if it's not
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<T> {

        T value;
        Node<T> previous;

        Node(T value) {
            this.value = value;
        }

    }

}
