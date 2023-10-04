package fc.java.poly;

public class TV implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("Tv채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("Tv채널이 내려간다.");

    }

    @Override
    public void volUp() {
        System.out.println("Tv볼륨이 올라간다.");

    }

    @Override
    public void volDown() {
        System.out.println("Tv볼륨이 내려간다.");

    }
}
