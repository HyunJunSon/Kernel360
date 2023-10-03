package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {

//        int[] arr = new int[]{10,30,45,55,71,32};
//        for( int a : arr) {
//            System.out.println(a);
//        }

        Student[] arr = new Student[]{
            new Student("hyunjun", "컴퓨터공학과","@naver.com", 22,2023,"1111-2222"),
            new Student("jun", "의학과","@google.com", 26,2021,"1111-3333"),
            new Student("hyun", "기계공학과","@yahoo.com", 28,2022,"1111-6666"),
            new Student("hyunhee", "물리학과","@kakao.com", 30,2017,"1111-3333")
        };

        for(Student st : arr){
            System.out.println( st);
        }

    }
}
