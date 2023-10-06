package fc.java.course2.part2;

import fc.java.course2.model2.Converter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("홍길동","이길동","김길동");
        Collections.sort(lst, String::compareTo);
        System.out.println(lst);
    }
}
