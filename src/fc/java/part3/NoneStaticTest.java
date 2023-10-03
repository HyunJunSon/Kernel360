package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {

        int a= 10;
        int b= 20;
        NoneStaticTest ns = new NoneStaticTest();
        int sum = ns.hap(a,b);
        System.out.println("sum = " + sum);
    }

    public int hap(int a, int b){
        return a+b;
    }
}
