package com.bobocode;

/**
 *
 * {@link LinkedStack} is a data structure that follows "last in, first out" rule (LIFO).
 * <br/>
 * {@link LinkedStack} implements {@link Stack} interface by linking of single generic nodes.
 */
public class LinkedStack<T> implements Stack<T> {

    private int size;

    @Override
    public void push(T element) {
        //TODO

        size++;
//        throw new UnsupportedOperationException();
    }

    @Override
    public T pop() {
        //TODO

        size--;

        return null;
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

    @Override
    public boolean isEmpty() {
        //TODO
        throw new UnsupportedOperationException();    }

}
