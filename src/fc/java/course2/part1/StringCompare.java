package fc.java.course2.part1;

public class StringCompare {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "world";

        if (str.equals(str2))
            System.out.println("문자열이 같습니다.");
        else
            System.out.println("문자열이 다릅니다.");


        String str3 = "apple";
        String str4 = "banana";

        if (str3.compareTo(str4) == 0)
            System.out.println("문자열이 같습니다.");
        else if (str3.compareTo(str4) < 0)
            System.out.println("str3이 먼저 나옵니다.");
        else
            System.out.println("str4가 먼저 나옵니다.");

        }
    }

