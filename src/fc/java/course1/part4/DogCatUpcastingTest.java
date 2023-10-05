package fc.java.course1.part4;

import fc.java.course1.model.Animal;
import fc.java.course1.model.Cat;
import fc.java.course1.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        Animal ani = new Dog(); // upcasting // 부모가 자식을 가리킨다.
        ani.eat();

        Animal ani2 = new Cat();
        ani2.eat();
    }
}
