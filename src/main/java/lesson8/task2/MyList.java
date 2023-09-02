package lesson8.task2;

public class MyList implements OwnList {
    private Integer[] elements;
    private int size;

    public MyList(Integer[] elements, int size) {
        this.elements = elements;
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Integer get(int index) {
        return elements[index];
    }

    @Override
    public void add(Integer element) {
        if (size == elements.length) {
            Integer[] newElements = new Integer[2 * size];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }

    @Override
    public void add(int index, Integer element) {
        if (size == elements.length) {
            Integer[] newElements = new Integer[2 * size];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Integer removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return removedElement;
    }
}
