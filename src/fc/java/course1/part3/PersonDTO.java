package fc.java.course1.part3;

public class PersonDTO {
    public String name;
    public int age;
    public String phone;

    public void play(){
        System.out.println("운동을한다.");
    }
    public void eat(){
        System.out.println("음식을 먹다.");
    }
    public void walk(){
        System.out.println("걷다.");
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
