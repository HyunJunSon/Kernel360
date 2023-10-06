package fc.java.course2.part2;

import fc.java.course2.model2.MathOperation;

public class FunctionalInterfaceTest implements MathOperation {
    public static void main(String[] args) {
        FunctionalInterfaceTest fun = new FunctionalInterfaceTest();
        System.out.println(fun.operation(10, 20));

        int result = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x*y;
            }
        }.operation(10, 20);

        System.out.println(result);



    }

    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
