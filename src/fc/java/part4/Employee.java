package fc.java.part4;

public class Employee {
    private String name;
    private int age;
    private String phone;
    private String empdate;
    private String dept;
    private boolean marriage;

    public Employee() {
//        super(); // 상위클래스의 생성자 호출 -> Object class 생성자 호출
    }

    public Employee(String name, int age, String phone, String empdate, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empdate = empdate;
        this.dept = dept;
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empdate='" + empdate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
