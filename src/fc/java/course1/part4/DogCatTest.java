package fc.java.course1.part4;

import fc.java.course1.model.*;


public class DogCatTest {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.eat();
//
//        Cat cat = new Cat();
//        cat.eat();
//        cat.night();

//        Animal animal = new Dog();
//        animal.eat();
//        Animal animal2 = new Cat();
//        animal2.eat();

        Animal[] arr = new Animal[]{new Dog(), new Cat()};
        for(Animal ani : arr){
            ani.eat();
        }
    }
}
