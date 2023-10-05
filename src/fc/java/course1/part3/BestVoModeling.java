package fc.java.course1.part3;

import fc.java.course1.model.MovieVO;

public class BestVoModeling {
    public static void main(String[] args) {
        MovieVO movie = new MovieVO("1947 보스턴", 20, "family", "what",130.0f, 2);
        System.out.println("movie = " + movie);

        MovieVO movie2 = new MovieVO("1940 보스턴", 40, "family_2", "how",120.0f, 3);

        System.out.println("movie2 = " + movie2);


    }
}
