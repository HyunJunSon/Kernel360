package fc.java.course2.part1;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
//        String str= "Hello World  Java";
////        String[] arr = str.split(",");
//        String[] arr = str.split("\\s+");

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열입력:");
        String str = sc.nextLine();
        String[] arr = str.split("\\s+");

        for(String st : arr) {
            System.out.print(st+" ");
        }

    }
}
