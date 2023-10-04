package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoCon;

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
