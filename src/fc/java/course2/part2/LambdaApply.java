package fc.java.course2.part2;

import fc.java.course2.model2.StringOperation;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation upper = String::toUpperCase;
        StringOperation lower = String::toLowerCase;

        change("aabBcCdD",upper);
        change("aabBcCdD",lower);

    }

    private static void change(String str, StringOperation op) {
        System.out.println(op.apply(str));
    }
}
