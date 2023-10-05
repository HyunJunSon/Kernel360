package fc.java.course1.part4;

import fc.java.course1.poly.Animal;
import fc.java.course1.poly.Cat;
import fc.java.course1.poly.Dog;

public class InNotOverride {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani = new Cat();
        ani.eat();

        //오버라이딩 하지 않았기 때문에 부모가 명령을 내리면(메세지를 보내면) 오동작을 한다.
        //[다형성을 보장하지 않음] >> 다형성을 보장하려면 재정의를 강제로 하도록 만들어준다.

    }
}
