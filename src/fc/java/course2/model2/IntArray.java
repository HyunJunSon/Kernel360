package fc.java.course2.model2;
import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY = 5;
    private int[] elements;
    private int size = 0;

    public IntArray() {
        elements = new int[DEFAULT_CAPACITY];
    }
    public int size(){
        return size;
    }

    public int get(int idx){
        if (idx<0 || idx >= size)
            throw new IndexOutOfBoundsException("범위 초과");
        return elements[idx];
    }

    public void add(int element){
        if (size == elements.length)
            enSureCapacity();

        elements[size++] = element;
    }

    private void enSureCapacity() {
        int newCapacity = elements.length *2;
        elements = Arrays.copyOf(elements, newCapacity);
    }


}
