package fc.java.course2.part1;

import fc.java.course2.model2.Connection;
import fc.java.course2.model2.MSSQLDriver;
import fc.java.course2.model2.MySQLDriver;
import fc.java.course2.model2.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        //orable DB접속
        Connection[] conn = {new OracleDriver()
                            ,new MySQLDriver()
                            ,new MSSQLDriver()};

        for (Connection con : conn ){
            con.getConnection("www.naver.com", "hyunjun", "111");
        }



    }

}
