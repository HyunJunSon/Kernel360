package fc.java.course1.part4;

import fc.java.course1.poly.Radio;
import fc.java.course1.poly.RemoCon;

public class InterfaceTest {
    public static void main(String[] args) {
        RemoCon remoCon = new Radio();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volUp();
        remoCon.volDown();
        remoCon.internet(); //오동작
    }
}
