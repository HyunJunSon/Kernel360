package fc.java.course2.model2;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public ObjectArray() {
//        elements = new Object[DEFAULT_CAPACITY];
        this(DEFAULT_CAPACITY); // this() ;; 생성자 안에서 다른 생성자를 호출
    }

    public ObjectArray(int capacity) {
        elements = new Object[capacity];
    }

    public int size(){
        return size;
    }

    public Object get(int idx){
        if (idx<0 || idx >= size)
            throw new IndexOutOfBoundsException("범위 초과");
        return elements[idx];
    }

    public void add(Object element){
        if (size == elements.length)
            enSureCapacity();

        elements[size++] = element;
    }

    private void enSureCapacity() {
        int newCapacity = elements.length *2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
