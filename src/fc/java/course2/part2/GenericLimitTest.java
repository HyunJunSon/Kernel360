package fc.java.course2.part2;

import fc.java.course2.model2.AverageCalculaor;

public class GenericLimitTest {
    public static void main(String[] args) {
        AverageCalculaor<Integer> cal = new AverageCalculaor<>(new Integer[]{1,2,3,4,5});
        System.out.println(cal.calculatorAverage());
    }
}
