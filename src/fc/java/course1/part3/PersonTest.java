package fc.java.course1.part3;

public class PersonTest {
    public static void main(String[] args) {
        PersonDTO person = new PersonDTO();
        person.name = "hyunjun";
        person.age = 37;
        person.phone = "111-2222";

        System.out.println(person.name);
        person.play();
    }
}