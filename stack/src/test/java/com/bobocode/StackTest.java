package com.bobocode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    @DisplayName("Test is empty stack without elements")
    public void testIsEmptyStackWithoutElements() {
        boolean actual = stack.isEmpty();

        assertTrue(actual);
    }

    @Test
    @DisplayName("Test is empty stack after adding elements")
    public void testIsEmptyStackAfterAddingElements() {
        stack.push(5);
        stack.push(73);
        stack.push(12);

        boolean actual = stack.isEmpty();

        assertFalse(actual);
    }

    @Test
    @DisplayName("Test is empty stack after popping all elements")
    public void testIsEmptyStackAfterPoppingAllElements() {
        stack.push(5);
        stack.push(73);
        stack.push(12);

        stack.pop();
        stack.pop();
        stack.pop();

        boolean actual = stack.isEmpty();

        assertTrue(actual);
    }

    @Test
    @DisplayName("Test adding elements into stack")
    public void testAddingElementsIntoStack() {
        stack.push(5);
        stack.push(73);
        stack.push(12);

        int expectedSize = 3;
        int actualSize = stack.size();

        assertEquals(expectedSize, actualSize);

        /////////////////////////////////////////////

        int expectedElement = 12;
        int actualElement = stack.pop();
        expectedSize = 2;
        actualSize = stack.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);

        /////////////////////////////////////////////

        expectedElement = 73;
        actualElement = stack.pop();
        expectedSize = 1;
        actualSize = stack.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }

}
