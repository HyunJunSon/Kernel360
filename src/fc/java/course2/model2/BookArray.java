package fc.java.course2.model2;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY = 5;
    private Book[] elements;
    private int size = 0;

    public BookArray() {
        elements = new Book[DEFAULT_CAPACITY];
    }
    public int size(){
        return size;
    }

    public Book get(int idx){
        if (idx<0 || idx >= size)
            throw new IndexOutOfBoundsException("범위 초과");
        return elements[idx];
    }

    public void add(Book element){
        if (size == elements.length)
            enSureCapacity();

        elements[size++] = element;
    }

    private void enSureCapacity() {
        int newCapacity = elements.length *2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
