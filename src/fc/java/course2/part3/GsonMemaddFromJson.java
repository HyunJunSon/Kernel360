package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Person;

public class GsonMemaddFromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"hyunjun\",\"age\":33,\"email\":\"yahoo.co.kr\",\"address\":{\"city\":\"seoul\",\"country\":\"korea\"}}";

        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);

        System.out.println(person);

    }
}
