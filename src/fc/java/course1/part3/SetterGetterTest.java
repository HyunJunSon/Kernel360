package fc.java.course1.part3;

import fc.java.course1.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        PersonVO person = new PersonVO();

        person.setName("hyunjun");
        person.setAge(37);
        person.setPhone("111-2222");

        System.out.println("person.getName() = " + person.getName());
    }
}
