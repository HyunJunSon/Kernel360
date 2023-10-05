package fc.java.course1.part2;

public class CharTest {
    public static void main(String[] args) {
//        char ch = '가';
//        System.out.println("ch = " + ch);
//
//        char ch2 = 'A';
//        System.out.println((char)(ch2+32));

        char a = '1';
        char b = '2';

        System.out.println(Character.getNumericValue(a) + Character.getNumericValue(b));
    }
}
