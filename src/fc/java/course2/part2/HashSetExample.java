package fc.java.course2.part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(Arrays.asList("hi","hello","안녕","니하오","hi","hello")){};

        System.out.println(set.size());

        for (String s : set) {
            System.out.println(s);
        }

        set.remove("hi");

        System.out.println(set.size());

        set.forEach(System.out::println);

        System.out.println(set.contains("hi"));

        set.clear();

        System.out.println(set.isEmpty());
    }
}
