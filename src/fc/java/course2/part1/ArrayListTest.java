package fc.java.course2.part1;

import fc.java.course2.model2.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.addAll(Arrays.asList("hi",2,3,new Book("노인과바다",10000,"한빛","hyunjun")));

        System.out.println(list.size());

        System.out.println(list.get(3));

    }
}
