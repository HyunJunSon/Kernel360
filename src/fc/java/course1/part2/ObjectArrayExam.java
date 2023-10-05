package fc.java.course1.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] arr = new Movie[]{
                new Movie("1947 보스턴"),
                new Movie("첫사랑"),
                new Movie("친구")
        };
        
        for(Movie m : arr){
            System.out.println("movie = " + m);
        }

    }
}
