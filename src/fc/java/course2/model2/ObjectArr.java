package fc.java.course2.model2;

import java.util.Arrays;

public class ObjectArr<T> {
    private T[] arr;
    private int size;
    public ObjectArr(int size) {
        this.arr = (T[])new Object[size];
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
        size++;
    }

    public int size(){
        return size;
    }
    @Override
    public String toString() {
        return "ObjectArr{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
