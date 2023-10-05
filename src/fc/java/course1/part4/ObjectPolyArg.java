package fc.java.course1.part4;

import fc.java.course1.poly.A;
import fc.java.course1.poly.B;

public class ObjectPolyArg {
    public static void main(String[] args) {
//        Object[] arr = {new A(), new B()};
//        for(Object obj : arr){
//            if (obj instanceof A)
//                ((A)obj).printGo();
//            else
//                ((B)obj).printGo();
//        }
        A a = new A();
        display(a);
        B b = new B();
        display(b);

    }

    private static void display(Object obj) {
        if (obj instanceof A)
            ((A)obj).printGo();
        else
            ((B)obj).printGo();
    }
}
