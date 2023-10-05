package fc.java.course2.model2;

public abstract class MinMaxFinder {
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int n : arr){
            if (n < min)
                min = n;
        }
        return min;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int n : arr){
            if (n > max)
                max = n;
        }
        return max;
    }
}
