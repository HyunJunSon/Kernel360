package fc.java.course2.part2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> lst = new LinkedList<>(Arrays.asList(1,2,2,35,45,57,67));

        lst.add(1, 99);
        System.out.println(lst);
    }
}
