package fc.java.model;

public class Dog extends Animal {
    int a;
//    Dog(int a){
//        this.a = a;
////        super(); super는 첫문장에 와야 한다.
//    }
    @Override
    public void eat() {
        System.out.println("개처럼 먹다.");
    }
}
