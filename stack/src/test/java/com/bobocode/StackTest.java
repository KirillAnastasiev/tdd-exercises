package com.bobocode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new LinkedStack<>();
    }

    @Test
    @DisplayName("Test size of stack without elements")
    public void testSizeOfStackWithoutElements() {
        int expected = 0;
        int actual = stack.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test size of stack after adding elements")
    public void testSizeOfStackAfterAddingElements() {
        stack.push(5);
        stack.push(73);
        stack.push(12);

        int expected = 3;
        int actual = stack.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test size of stack after popping elements")
    public void testSizeOfStackAfterPoppingElements() {
        stack.push(5);
        stack.push(73);
        stack.push(12);

        stack.pop();
        stack.pop();

        int expected = 1;
        int actual = stack.size();

        assertEquals(expected, actual);
    }

}
