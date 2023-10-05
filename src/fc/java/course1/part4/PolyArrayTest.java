package fc.java.course1.part4;

import fc.java.course1.model.Animal;
import fc.java.course1.model.Cat;
import fc.java.course1.model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Animal[] arr = new Animal[]{
            new Dog(),
            new Cat()
        };

        for(Animal ani : arr){
            ani.eat();
            if (ani instanceof Cat)
                ((Cat) ani).night();
        }
    }
}
