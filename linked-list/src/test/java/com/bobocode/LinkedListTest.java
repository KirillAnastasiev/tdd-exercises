package com.bobocode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

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
    @DisplayName("Test of adding elements into LinkedList")
    public void testOfAddingElementsIntoLinkedList() {
        List<Integer> list = new LinkedList<>();
        list.add(5);

        int expectedElement = 5;
        int actualElement = list.get(0);
        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);

        ////////////////////////////////////////////////

        list.add(73);

        expectedElement = 73;
        actualElement = list.get(1);
        expectedSize = 2;
        actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    @DisplayName("Test of adding elements into LinkedList with elements")
    public void testOfAddingElementsIntoLinkedListWithElements() {
        List<Integer> list = LinkedList.of(5, 73, 12);
        list.add(41);
        list.add(-3);

        int expectedElement = -3;
        int actualElement = list.get(4);
        int expectedSize = 5;
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    @DisplayName("Test of adding element into empty LinkedList by index")
    public void testOfAddingElementIntoEmptyLinkedListByIndex() {
        List<Integer> list = new LinkedList<>();
        list.add(0, 5);

        int expectedElement = 5;
        int actualElement = list.get(0);
        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    @DisplayName("Test of adding element to end LinkedList by index")
    public void testOfAddingElementToEndOfLinkedListByIndex() {
        List<Integer> list = LinkedList.of(5, 73, 12);
        list.add(3, 41);

        int expectedElement = 41;
        int actualElement = list.get(3);
        int expectedSize = 4;
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    @DisplayName("Test of adding element to empty LinkedList by index and then adding element to end of LinkedList by index")
    public void testOfAddingElementToEmptyLinkedListByIndexAndThenAddingElementToEndOfLinkedListByIndex() {
        List<Integer> list = new LinkedList<>();
        list.add(0, 5);

        int expectedElement = 5;
        int actualElement = list.get(0);
        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);

        ////////////////////////////////////////////////

        list.add(1, 73);

        expectedElement = 73;
        actualElement = list.get(1);
        expectedSize = 2;
        actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    @DisplayName("Test of adding element into LinkedList by index")
    public void testOfAddingElementIntoLinkedListByIndex() {
        List<Integer> list = LinkedList.of(5, 73, 12);
        list.add(1, 41);

        int expectedElement = 41;
        int actualElement = list.get(1);
        int expectedSize = 4;
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);

        ////////////////////////////////////////////////

        expectedElement = 5;
        actualElement = list.get(0);

        assertEquals(expectedElement, actualElement);

        ////////////////////////////////////////////////

        expectedElement = 73;
        actualElement = list.get(2);

        assertEquals(expectedElement, actualElement);
    }

    @Test
    @DisplayName("Test of adding element into LinkedList by index when index less then zero")
    public void testOfAddingElementIntoLinkedListByIndexWhenIndexLessThenZero() {
        List<Integer> list = new LinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, 5));
    }

    @Test
    @DisplayName("Test of adding element into LinkedList by index bigger then LinkedList size")
    public void testOfAddingElementIntoLinkedListByIndexBiggerThenLinkedListSize() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(4, 41));
    }

    @Test
    @DisplayName("Test of setting elements to LinkedList with elements")
    public void testOfSettingElementToLinkedListWithElements() {
        List<Integer> list = LinkedList.of(5, 73, 12);
        list.set(1, -3);

        int expectedElement = -3;
        int actualElement = list.get(1);
        int expectedSize = 3;
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    @DisplayName("Test of setting first element to LinkedList with elements")
    public void testOfSettingFirstElementToLinkedListWithElements() {
        List<Integer> list = LinkedList.of(5, 73, 12);
        list.set(0, 41);

        int expected = 41;
        int actual = list.get(0);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test of setting element to LinkedList with elements")
    public void testOfSettingLastElementToLinkedListWithElements() {
        List<Integer> list = LinkedList.of(5, 73, 12);
        list.set(2, 27);

        int expected = 27;
        int actual = list.get(2);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test of setting element to empty LinkedList")
    public void testOfSettingElementToEmptyLinkedList() {
        List<Integer> list = new LinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.set(0, 41));
    }

    @Test
    @DisplayName("Test of setting element to LinkedList by negative index")
    public void testOfSettingElementToLinkedListByNegativeIndex() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        assertThrows(IndexOutOfBoundsException.class, () -> list.set(-5, 41));
    }

    @Test
    @DisplayName("Test of setting element to LinkedList by index bigger then index of last element")
    public void testOfSettingElementToLinkedListByIndexBiggerThenIndexOfLastElement() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        assertThrows(IndexOutOfBoundsException.class, () -> list.set(3, 41));
    }

    @Test
    @DisplayName("Test of removing element from LinkedList with elements")
    public void testOfRemovingElementFromLinkedListWithElements() {
        List<Integer> list = LinkedList.of(5, 73, 12);
        list.remove(1);

        int expectedElement = 5;
        int actualElement = list.get(0);
        int expectedSize = 2;
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);

        ////////////////////////////////////////////////

        expectedElement = 12;
        actualElement = list.get(1);

        assertEquals(expectedElement, actualElement);
    }

    @Test
    @DisplayName("Test of removing first element from LinkedList")
    public void testOfRemovingFirstElementFromLinkedList() {
        List<Integer> list = LinkedList.of(5, 73, 12);
        list.remove(0);

        int expectedElement = 73;
        int actualElement = list.get(0);
        int expectedSize = 2;
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    @DisplayName("Test of removing last element from LinkedList")
    public void testOfRemovingLastElementFromLinkedList() {
        List<Integer> list = LinkedList.of(5, 73, 12);
        list.remove(2);

        int expectedElement = 73;
        int actualElement = list.get(1);
        int expectedSize = 2;
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    @DisplayName("Test of removing element from empty LinkedList")
    public void testOfRemovingElementFromEmptyLinkedList() {
        List<Integer> list = new LinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    @DisplayName("Test of removing element from LinkedList by negative index")
    public void testOfRemovingElementFromLinkedListByNegativeIndex() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
    }

    @Test
    @DisplayName("Test of removing element from LinkedList by index bigger than index of last element")
    public void testOfRemovingElementFromLinkedListByIndexBiggerThanIndexOfLastElement() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(3));
    }

    @Test
    @DisplayName("Test of getting element from LinkedList")
    public void testOfGettingElementFromLinkedList() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        int expected = 5;
        int actual = list.get(0);

        assertEquals(expected, actual);

        ////////////////////////////////////////////////

        expected = 12;
        actual = list.get(2);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test of getting element from empty LinkedList by index zero")
    public void testOfGettingElementFromEmptyLinkedListByIndexZero() {
        List<Integer> list = new LinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    @DisplayName("Test of getting element from LinkedList by negative index")
    public void testOfGettingElementFromLinkedListByNegativeIndex() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-5));
    }

    @Test
    @DisplayName("Test of getting element from LinkedList by index bigger then index of last element")
    public void testOfGettingElementFromLinkedListByIndexBiggerThenIndexOfLastElement() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
    }

    @Test
    @DisplayName("Test get first element from LinkedList with elements")
    public void testGetFirstElementFromLinkedListWithElements() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        int expected = 5;
        int actual = list.getFirst();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test get first element from empty LinkedList")
    public void testGetFirstElementFromEmptyLinkedList() {
        List<Integer> list = new LinkedList<>();

        assertThrows(NoSuchElementException.class, list::getFirst);
    }

    @Test
    @DisplayName("Test get last element from LinkedList with elements")
    public void testGetLastElementFromLinkedListWithElements() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        int expected = 12;
        int actual = list.getLast();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test get last element from empty LinkedList")
    public void testGetLastElementFromEmptyLinkedList() {
        List<Integer> list = new LinkedList<>();

        assertThrows(NoSuchElementException.class, list::getLast);
    }

    @Test
    @DisplayName("Test if LinkedList contains element")
    public void testIfLinkedListContainsElement() {
        List<Integer> list = LinkedList.of(5, 73, 12);

        assertTrue(list.contains(73));

        ////////////////////////////////////////////////

        assertTrue(list.contains(12));

        ////////////////////////////////////////////////

        assertFalse(list.contains(-40));
    }

    @Test
    @DisplayName("Test if empty LinkedList contains element")
    public void testIfEmptyLinkedListContainsElement() {
        List<Integer> list = new LinkedList<>();

        assertFalse(list.contains(5));
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

    @Test
    @DisplayName("Test of clearing LinkedList")
    public void testOfClearingLinkedList() {
        List<Integer> list = LinkedList.of(5, 73, 12);
        list.clear();

        assertTrue(list.isEmpty());

        ////////////////////////////////////////////////

        assertThrows(NoSuchElementException.class, list::getFirst);

        ////////////////////////////////////////////////

        assertThrows(NoSuchElementException.class, list::getLast);
    }

}
