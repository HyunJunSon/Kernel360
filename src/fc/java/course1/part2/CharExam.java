package fc.java.course1.part2;

public class CharExam {
    public static void main(String[] args) {
        char[] arr = {'1','2','3','4','5'};
        int sum =0;
        for(char a : arr) {
            sum += Character.getNumericValue(a);
        }

        System.out.println("sum = " + sum);
    }
}
