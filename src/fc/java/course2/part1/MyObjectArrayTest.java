package fc.java.course2.part1;

import fc.java.course2.model2.Book;
import fc.java.course2.model2.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        ObjectArray list = new ObjectArray();

        list.add(new Book("노인과바다",10000,"한빛","hyunjun"));
        list.add(new Book("그리스인조르바",15000,"감영사","heejun"));
        list.add(new Book("싯다르타",16000,"그림과빛","박글매"));

        list.add("hi");
        list.add("hello");
        list.add("speed");

        System.out.println(list.size());

        System.out.println(list.get(3));


    }
}
