package lesson8.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    @Test
    void shouldReturnSize() {
        //given
        Integer[] elements = {1,2,3,4,5};
        MyList myList = new MyList(elements, 5);
        //when
        int expectedSize = 5;
        int actualSize = myList.size();
        //then
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void shouldReturnTrueIfIsEmpty() {
        //given
        Integer[] elements = {};
        MyList myList = new MyList(elements, 0);
        //when
        boolean isEmpty = myList.isEmpty();
        //then
        assertTrue(isEmpty);
    }

    @Test
    void shouldReturnFalseIfIsNotEmpty() {
        //given
        Integer[] elements = {1,2,3,4,5};
        MyList myList = new MyList(elements, 5);
        //when
        boolean isEmpty = myList.isEmpty();
        //then
        assertFalse(isEmpty);
    }

    @Test
    void shouldGetElement() {
        //given
        Integer[] elements = {1,2,3,4,5};
        MyList myList = new MyList(elements, 5);
        //when
        Integer expectedElement = 1;
        Integer actualElement = myList.get(0);
        //then
        assertEquals(expectedElement, actualElement);
    }

    @Test
    void shouldAddElementToLastIndex() {
        //given
        Integer[] elements = {1,2,3,4,5};
        MyList myList = new MyList(elements, 5);
        //when
        myList.add(6);
        //then
        assertEquals(6, myList.get(5));
    }

    @Test
    void shouldAddElementWithIndex() {
        //given
        Integer[] elements = {1,2,3,4,5};
        MyList myList = new MyList(elements, 5);
        //when
        myList.add(2, 6);
        //then
        assertEquals(6, myList.get(2));
    }

    @Test
    void shouldRemoveElement() {
        //given
        Integer[] elements = {1,2,3,4,5};
        MyList myList = new MyList(elements, 5);
        //when
        myList.remove(0);
        //then
        assertEquals(2, myList.get(0));
    }
}