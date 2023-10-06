package fc.java.course2.part2;

import fc.java.course2.model2.Pair;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("hello", 1);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        Map<String, Integer> maps = new HashMap<>(Map.of("kor",60, "eng",79,"math", 90));

        maps.forEach((k,v) -> System.out.println(k +" "+v));
    }
}
