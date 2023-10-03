package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloadingJava {
    public static void main(String[] args) {
        PersonVO person = new PersonVO("hyunjun",37, "111-2222");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getPhone());
    }
}
