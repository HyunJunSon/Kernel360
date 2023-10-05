package fc.java.course2.part1;

import fc.java.course2.model2.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr = {14,5,46,7,324,324,26,45,568,7};
        int max = MinMaxFinder.findMax(arr);
        System.out.println("max = " + max);
        int min = MinMaxFinder.findMin(arr);
        System.out.println("min = " + min);
        
    }
}
