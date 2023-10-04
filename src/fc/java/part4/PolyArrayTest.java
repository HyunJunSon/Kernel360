package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

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
