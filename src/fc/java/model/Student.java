package fc.java.model;

public class Student {
    private String name;
    private String dept;
    private String email;
    private int age;
    private int year;
    private String phone;

    public Student() {
    }

    public Student(String name, String dept, String email, int age, int year, String phone) {
        this.name = name;
        this.dept = dept;
        this.email = email;
        this.age = age;
        this.year = year;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getYear() {
        return year;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", year=" + year +
                ", phone='" + phone + '\'' +
                '}';
    }
}
