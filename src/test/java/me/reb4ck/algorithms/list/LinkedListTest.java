package me.reb4ck.algorithms.list;

import me.reb4ck.algorithms.list.arraylist.TheArrayList;
import me.reb4ck.algorithms.list.linkedlist.TheLinkedList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Array List tests
 */
@ExtendWith(MockitoExtension.class)
public class LinkedListTest {
    private static final String FIRST_ELEMENT_TO_ADD = "1st String Element";
    private static final String SECOND_ELEMENT_TO_ADD = "2nd String Element";
    private static final String THIRD_ELEMENT_TO_ADD = "3rd String Element";
    private static final Integer ELEMENTS_TO_ADD_AMOUNT = 5;

    /**
     * Test when add multiple elements is performed successfully
     */
    @Test
    public void testWhenAddMultipleElementsToArrayList() {
        final TheList<String> list = new TheLinkedList<>();

        for (int i = 0; i < ELEMENTS_TO_ADD_AMOUNT; i++) {
            list.add("Value: " + i);
        }

        list.showValues();
        assertEquals(list.size(), ELEMENTS_TO_ADD_AMOUNT);
    }

    /**
     * Test when add one element is performed successfully
     */
    @Test
    public void testWhenAddOneElementToArrayList() {
        final TheList<String> list = new TheArrayList<>();

        list.add(FIRST_ELEMENT_TO_ADD);

        assertEquals(list.size(), 1);
        assertEquals(list.get(0), FIRST_ELEMENT_TO_ADD);
    }

    /**
     * Test when one element is removed successfully
     */
    @Test
    public void testWhenRemoveElement() {
        final TheList<String> list = new TheArrayList<>();

        list.add(FIRST_ELEMENT_TO_ADD);
        list.add(SECOND_ELEMENT_TO_ADD);
        list.add(THIRD_ELEMENT_TO_ADD);

        list.remove(SECOND_ELEMENT_TO_ADD);

        assertEquals(list.size(), 2);
        assertEquals(list.get(1), THIRD_ELEMENT_TO_ADD);
    }


    /**
     * Test when multiple elements are removed successfully
     */
    @Test
    public void testWhenRemoveMultipleElements() {
        final TheList<String> list = new TheArrayList<>();

        list.add(FIRST_ELEMENT_TO_ADD);
        list.add(SECOND_ELEMENT_TO_ADD);
        list.add(THIRD_ELEMENT_TO_ADD);

        list.remove(SECOND_ELEMENT_TO_ADD);
        list.remove(THIRD_ELEMENT_TO_ADD);

        assertEquals(list.size(), 1);
        assertEquals(list.get(0), FIRST_ELEMENT_TO_ADD);
    }

    /**
     * Test When Remove Index Is Success
     */
    @Test
    public void testWhenRemoveIndexIsSuccess() {
        final TheList<String> list = new TheArrayList<>();

        list.add(FIRST_ELEMENT_TO_ADD);
        list.add(SECOND_ELEMENT_TO_ADD);
        list.add(THIRD_ELEMENT_TO_ADD);

        list.remove(1);

        assertEquals(list.size(), 2);
        assertEquals(list.get(1), THIRD_ELEMENT_TO_ADD);
    }

    /**
     * Test When Add at Index Is Success
     */
    @Test
    public void testWhenAddAtIndexIsSuccess() {
        final TheList<String> list = new TheArrayList<>();

        list.add(FIRST_ELEMENT_TO_ADD);
        list.add(SECOND_ELEMENT_TO_ADD);
        list.add(THIRD_ELEMENT_TO_ADD);

        list.add(1, FIRST_ELEMENT_TO_ADD);

        assertEquals(list.size(), 3);
        assertEquals(list.get(1), FIRST_ELEMENT_TO_ADD);
    }
}
