package com.bobocode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    @DisplayName("Test 'of' method returns LinkedList class")
    public void testOfMethodReturnsLinkedListClass() {
        List<?> list = LinkedList.of();

        Class<?> expected = LinkedList.class;
        Class<?> actual = list.getClass();

        assertSame(expected, actual);
    }

    @Test
    @DisplayName("Test 'of' method adds elements into LinkedList")
    public void testOfMethodAddsElementsIntoLinkedList() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        int expected = 5;
        int actual = list.get(0);

        assertEquals(expected, actual);

        ////////////////////////////////////////////////

        expected = 73;
        actual = list.get(1);

        assertEquals(expected, actual);

        ////////////////////////////////////////////////

        expected = 12;
        actual = list.get(2);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test size of empty LinkedList")
    public void testSizeOfEmptyLinkedList() {
        List<Integer> list = new LinkedList<>();

        int expected = 0;
        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test size of LinkedList with elements")
    public void testSizeOfLinkedListWithElements() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        int expected = 3;
        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test size of LinkedList after elements adding")
    public void testSizeOfLinkedListAfterElementsAdding() {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(73);

        int expected = 2;
        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test size of LinkedList after elements adding by index")
    public void testSizeOfLinkedListAfterElementsAddingByIndex() {
        List<Integer> list = new LinkedList<>();
        list.add(0, 5);
        list.add(0, 73);
        list.add(0, 12);

        int expected = 3;
        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test size of LinkedList after elements removing")
    public void testSizeOfLinkedListAfterElementsRemoving() {
        List<Integer> list = LinkedList.of(5, 73, 12);
        list.remove(0);
        list.remove(0);

        int expected = 1;
        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test is LinkedList without elements empty")
    public void testIsLinkedListWithoutElementsEmpty() {
        List<Integer> list = new LinkedList<>();

        assertTrue(list.isEmpty());
    }

    @Test
    @DisplayName("Test is LinkedList with elements empty")
    public void testIsLinkedListWithElementsEmpty() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        assertFalse(list.isEmpty());
    }

}
