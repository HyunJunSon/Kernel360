package fc.java.course2.part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNumbers {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Arrays.asList(3,4,6,5,1,1,2,4));
        System.out.println(set.size()); //6

        set.forEach(n-> System.out.print(n+" "));


    }
}
