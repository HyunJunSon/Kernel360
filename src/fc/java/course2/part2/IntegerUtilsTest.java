package fc.java.course2.part2;

import fc.java.course2.model2.Converter;
import fc.java.course2.model2.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        Converter<String, Integer> con = IntegerUtils::StringToInt;
        Converter<String, Integer> con2 = s -> Integer.parseInt(s);

        int result = con.covert("123");
        System.out.println(result);

        System.out.println(con2.covert("9999"));
    }
}
