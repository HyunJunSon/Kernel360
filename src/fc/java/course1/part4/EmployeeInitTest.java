package fc.java.course1.part4;

public class EmployeeInitTest {
    public static void main(String[] args) {
        RempVO vo = new RempVO("홍길동", 5555, "111-2222", " 2022-10-22","홍보부", false);
        System.out.println("vo = " + vo);
    }   // 정보은닉이 되지 않아서 age가 5555라도 문제없이 작동해버림

}
