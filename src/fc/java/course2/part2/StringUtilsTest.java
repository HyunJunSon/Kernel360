package fc.java.course2.part2;

import fc.java.course2.model2.Converter;
import fc.java.course2.model2.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils st = new StringUtils();
        Converter<String, String> con = st::reverse;
        System.out.println(con.covert("abcde"));
    }
}
