package fc.java.part2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("타이틀을 입력해주세요:");
        String title = sc.nextLine();
        System.out.println("title = " + title);

        System.out.println("문자열 입력하세요");
        String st = sc.next();
        System.out.println("st = " + st);
        
        sc.nextLine();  // 버퍼 비우기
        System.out.println("문자열 입력하세요");
        String st2 = sc.nextLine();
        System.out.println("st2 = " + st2);
                
    }
}
