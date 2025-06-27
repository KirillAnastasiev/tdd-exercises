package com.bobocode;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * {@link LinkedList} is a list implementation that is based on singly linked generic nodes. A node is implemented as
 * inner static class {@link Node<E>}.
 *
 * @param <E> generic type parameter
 */
public class LinkedList<E> implements List<E> {

    private int size;
    private Node<E> headNode;
    private Node<E> tailNode;

    /**
     * This method creates a list of provided elements
     *
     * @param elements elements to add
     * @param <E>      generic type
     * @return a new list of elements the were passed as method parameters
     */
    public static <E> List<E> of(E... elements) {
        LinkedList<E> result = new LinkedList<>();
        Stream.of(elements).forEach(result::add);

        return result;
    }

    /**
     * Adds an element to the end of the list. This operation is performed in constant time O(1)
     *
     * @param element element to add
     */
    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (Objects.isNull(headNode)) {
            headNode = tailNode = newNode;
        } else {
            tailNode.next = newNode;
            tailNode = newNode;
        }

        size++;
    }

    /**
     * Adds a new element to the specific position in the list. In case provided index in out of the list bounds it
     * throws {@link IndexOutOfBoundsException}
     *
     * @param index   an index of new element
     * @param element element to add
     */
    @Override
    public void add(int index, E element) {
        size++;
//        throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method
    }

    /**
     * Changes the value of an list element at specific position. In case provided index in out of the list bounds it
     * throws {@link IndexOutOfBoundsException}
     *
     * @param index   an position of element to change
     * @param element a new element value
     */
    @Override
    public void set(int index, E element) {
        throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method
    }

    /**
     * Retrieves an elements by its position index. In case provided index in out of the list bounds it
     * throws {@link IndexOutOfBoundsException}
     *
     * @param index element index
     * @return an element value
     */
    @Override
    public E get(int index) {
        Node<E> current = headNode;

        for (int i = 1; i <= index ; i++) {
            current = current.next;
        }
        return current.element;
//        throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method
    }

    /**
     * Returns the first element of the list. Operation is performed in constant time O(1)
     *
     * @return the first element of the list
     * @throws java.util.NoSuchElementException if list is empty
     */
    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method

    }

    /**
     * Returns the last element of the list. Operation is performed in constant time O(1)
     *
     * @return the last element of the list
     * @throws java.util.NoSuchElementException if list is empty
     */
    @Override
    public E getLast() {
        throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method
    }

    /**
     * Removes an elements by its position index. In case provided index in out of the list bounds it
     * throws {@link IndexOutOfBoundsException}
     *
     * @param index element index
     * @return an element value
     */
    @Override
    public void remove(int index) {
        size--;
//        throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method
    }


    /**
     * Checks if a specific exists in he list
     *
     * @return {@code true} if element exist, {@code false} otherwise
     */
    @Override
    public boolean contains(E element) {
        throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method
    }

    /**
     * Checks if a list is empty
     *
     * @return {@code true} if list is empty, {@code false} otherwise
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of elements in the list
     *
     * @return number of elements
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Removes all list elements
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("This method is not implemented yet"); // todo: implement this method
    }

    private static class Node<T> {

        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }

    }

}
