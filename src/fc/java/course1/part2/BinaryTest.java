package fc.java.course1.part2;

public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f;
        boolean b = false;
        char c = 'A';
        java.lang.String s = "APPLE";
        // Q. 69를 2진수, 8진수, 16진수로 출력하시오.

//        System.out.println(Integer.toBinaryString(69));
//        System.out.println(Integer.toOctalString(69));
//        System.out.println(Integer.toHexString(69));
        int decimal = 69;
        System.out.println("decimal = " + decimal);

        int binary = 0b01000101;
        System.out.println("binary = " + binary);

        int octal = 0105;
        System.out.println("octal = " + octal);
        
        int hexa = 0x45;
        System.out.println("hexa = " + hexa);
    }
}
