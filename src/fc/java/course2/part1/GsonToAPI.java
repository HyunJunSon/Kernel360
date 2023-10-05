package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.course2.model2.Person;

import java.util.Random;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("hyunjun", 37);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);

        Person p = gson.fromJson(json, Person.class);
        System.out.println(p.getName());
        System.out.println(p.getClass());

    }
}
