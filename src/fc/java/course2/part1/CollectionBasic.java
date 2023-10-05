package fc.java.course2.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionBasic {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(lst);

        lst.add(60);
        System.out.println(lst);

        lst.forEach(System.out::print);

    }
}
