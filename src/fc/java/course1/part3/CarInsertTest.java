package fc.java.course1.part3;

import fc.java.course1.model.CarDAO;
import fc.java.course1.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 자동차정보를 키보드로 부터 입력을 받아서 DB에 저장하세요.(JDBC)
        //Q. 자동차 정보를 키보드로 입력 받아서 다른 메서드로 이동해야 하는 경우를 생각해보자.
        Scanner sc = new Scanner(System.in);
        System.out.print("자동차일련번호:");
        int carSn = sc.nextInt();

        sc.nextLine(); // 버퍼비우기 (엔터가 버퍼에 남아있어서)

        System.out.print("자동차이름:");
        String carName = sc.nextLine();


        System.out.print("자동차가격:");
        int carPrice = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차소유자:");
        String carOwner = sc.nextLine();

        System.out.print("자동차년식:");
        int carYear = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차타입:"); //G(휘발유), D(경유)
        String carType = sc.nextLine();


        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carOwner = carOwner;
        car.carPrice = carPrice;
        car.carType = carType;
        car.carYear = carYear;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}
