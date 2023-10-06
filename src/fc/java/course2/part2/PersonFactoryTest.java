package fc.java.course2.part2;

import fc.java.course2.model2.PersonFactory;
import fc.java.course2.model2.Person;
public class PersonFactoryTest {
    public static void main(String[] args) {
        PersonFactory pf = Person::new;
        Person p = pf.create("hyunjun", 34);
        System.out.println(p);

    }
}
