package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        RempVO vo = new RempVO("hyunjun",5555,"개발부","111-2222","2023-12-23",false);
//        vo.name = "hyunjun";
//        //'name' has protected access in 'fc.java.part4.Employee'
//        // 같은 패키지에서만 접근할수 있다.
//        vo.age = 5555;
//        vo.dept = "개발부";
//        vo.phone = "111-2222";
//        vo.empdate = "2023-12-22";
//        vo.marriage = false;

        System.out.println("vo = " + vo);
    }
}
