package fc.java.poly;

public class Radio implements RemoCon{

    @Override
    public void chUp() {
        System.out.println("채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("채널이 내려간다.");

    }

    @Override
    public void volUp() {
        System.out.println("볼륨이 올라간다.");

    }

    @Override
    public void volDown() {
        System.out.println("볼륨이 올라간다.");
    }
}
