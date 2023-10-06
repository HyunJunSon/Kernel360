package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Member;

public class GsonFromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"hyunjun\",\"age\":33,\"email\":\"@naver.com\"}";
        Gson gson = new Gson();
        Member member = gson.fromJson(json, Member.class);
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getEmail());

    }
}
