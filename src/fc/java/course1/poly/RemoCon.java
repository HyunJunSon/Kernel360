package fc.java.course1.poly;

public interface RemoCon {
    public abstract void chUp(); // public abstract는 생략가능
    public abstract void chDown();
    public abstract void volUp();
    public abstract void volDown();
    default void internet(){
        System.out.println("인터넷이 지원된다.");
    }
    // 구현클래스 때문에, 추상클래스는 기능이 비슷한 기능을 묶어주어야 한다.
}