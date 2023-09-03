package lesson9.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void shouldAddElement() {
        //given
        MyQueue queue = new MyQueue(1);
        //when
        queue.add(1);
        //then
        assertTrue(queue.add(1));
    }

    @Test
    void shouldRemoveElement() {
        //given
        MyQueue queue = new MyQueue(2);
        queue.add(1);
        queue.add(2);
        //when
        Integer removedElement = queue.remove();
        //then
        assertEquals(1, removedElement);
    }

    @Test
    void shouldGetElement() {
        //given
        MyQueue queue = new MyQueue(2);
        queue.add(1);
        queue.add(2);
        //when
        Integer element = queue.element();
        //then
        assertEquals(1, element);
    }

    @Test
    void shouldThrowExceptionWhenQueueIsEmpty() {
        //given
        MyQueue queue = new MyQueue(2);
        //then
        assertThrows(IllegalStateException.class, () -> queue.remove());
    }

    @Test
    void shouldThrowExceptionWhenQueueIsFull() {
        //given
        MyQueue queue = new MyQueue(1);
        queue.add(1);
        //then
        assertThrows(IllegalStateException.class, () -> queue.add(2));
    }

}