package fc.java.course2.part1;

public class HelloWorldString {
    public static void main(String[] args) {
        String str = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = "hello";

        System.out.println(str);
        System.out.println(str==str2);
        System.out.println(str3==str4);

    }
}
