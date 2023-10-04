package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        Animal ani = new Cat();
        ((Cat)ani).night();

    }
}
