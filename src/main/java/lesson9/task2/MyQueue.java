package lesson9.task2;

public class MyQueue implements OwnQueue {

    private Integer[] elements;
    private int firstElementPosition;
    private int lastElementPosition;
    private int size;

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be bigger than zero.");
        }
        elements = new Integer[capacity];
        firstElementPosition = 0;
        lastElementPosition = -1;
        size = 0;
    }

    @Override
    public boolean add(Integer newElement) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full.");
        }
        lastElementPosition = (lastElementPosition + 1) % elements.length;
        elements[lastElementPosition] = newElement;
        size++;
        return true;
    }

    @Override
    public Integer remove() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        Integer removedElement = elements[firstElementPosition];
        elements[firstElementPosition] = null;
        firstElementPosition = (firstElementPosition + 1) % elements.length;
        size--;
        return removedElement;
    }

    @Override
    public Integer element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        return elements[firstElementPosition];
    }

}
