package fc.java.course2.part2;

import java.util.Arrays;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] number = new int[]{1,2,3,4,5,6,7};

        int sum = Arrays.stream(number).filter(n-> n%2 ==0).sum();
        System.out.println(sum);

    }
}
