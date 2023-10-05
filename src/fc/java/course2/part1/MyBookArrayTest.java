package fc.java.course2.part1;

import fc.java.course2.model2.Book;
import fc.java.course2.model2.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        BookArray list = new BookArray();

        list.add(new Book("노인과바다",10000,"한빛","hyunjun"));
        list.add(new Book("그리스인조르바",15000,"감영사","heejun"));
        list.add(new Book("싯다르타",16000,"그림과빛","박글매"));

        System.out.println(list.size());

        System.out.println(list.get(2));


        };



}

