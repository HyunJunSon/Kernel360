package fc.java.course1.part4;

import fc.java.course1.model.Animal;
import fc.java.course1.model.Cat;

public class ObjectCasting {
    public static void main(String[] args) {
        Animal ani = new Cat();
        ((Cat)ani).night();

    }
}
