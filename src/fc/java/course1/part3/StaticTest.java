package fc.java.course1.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        int tot = hap(a,b);
        System.out.println("tot = " + tot);

    }

    public static int hap(int a, int b){
        return a+b;
    }
}
