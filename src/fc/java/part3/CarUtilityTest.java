package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        String carName = "BMW828i";
        int carPrice = 90000000;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType ="G";

        CarDTO car = new CarDTO();
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

//        carPrint(car);
        CarUtility.carPrint(car);
    }

//    public static void carPrint(CarDTO car){
//        System.out.println(car);
//    }
}
