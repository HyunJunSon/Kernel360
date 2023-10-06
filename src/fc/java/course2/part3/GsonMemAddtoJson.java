package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Address;
import fc.java.course2.model3.Person;

public class GsonMemAddtoJson {
    public static void main(String[] args) {
        Address address = new Address("seoul", "korea");
        Person person = new Person("hyunjun", 33, "yahoo.co.kr", address);

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
