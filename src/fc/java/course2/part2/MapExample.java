package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map =
                new HashMap<>(Map.of("kim",95,"park",90,"choi",88));

//        System.out.println(map.size());

        map.put("lee", 70);
//        System.out.println(map.size());
        map.put("choi", 90);

//        System.out.println(map.get("choi"));
//        System.out.println(map);

        map.putIfAbsent("koo", 70);
//        System.out.println(map.get("koo"));

//        map.forEach((k,v)-> System.out.println(k+" "+v));
//        for(String st : map.keySet()){
//            System.out.print(st+" ");
//        }

//        map.putAll(Map.of("kim",20,"choo",99));
//        System.out.println(map);
        map.replace("choo", 80);
        System.out.println(map.get("choo"));
    }
}
