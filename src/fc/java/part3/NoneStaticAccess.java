package fc.java.part3;

import fc.java.model.MyUtil2;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        MyUtil2 util = new MyUtil2();
        int sum = util.hap(a, b);
        System.out.println("sum = " + sum);
    }
}
