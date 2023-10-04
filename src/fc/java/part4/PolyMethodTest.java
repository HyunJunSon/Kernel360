package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        display(dog);
        Cat cat = new Cat();
        display(cat);

    }

    private static void display(Animal ani) {
        ani.eat();
        if (ani instanceof Cat)
            ((Cat)ani).night();
    }

//    private static void display(Dog dog) {
//        dog.eat();
//    }
//    private static void display(Cat cat) {
//        cat.eat();
//    }
}
