package fc.java.course2.model2;

public class MySQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password를 이용하여 MySQL DB 접속시도한다.");

    }
}
