package fc.java.course1.part3;

import fc.java.course1.model.PersonVO;

public class ConstructorOverloadingJava {
    public static void main(String[] args) {
        PersonVO person = new PersonVO("hyunjun",37, "111-2222");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getPhone());
    }
}
