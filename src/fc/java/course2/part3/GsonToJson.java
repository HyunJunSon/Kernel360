package fc.java.course2.part3;


import com.google.gson.Gson;
import fc.java.course2.model3.Member;

public class GsonToJson {
    public static void main(String[] args) {
        Member member = new Member("hyunjun", 33, "@naver.com");
        Gson gson = new Gson();
        String json = gson.toJson(member);
        System.out.println(json);
    }
}
