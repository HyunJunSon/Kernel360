package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello,world!";
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            if (map.containsKey(ch))
                map.put(ch,map.get(ch) + 1);
             else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}
