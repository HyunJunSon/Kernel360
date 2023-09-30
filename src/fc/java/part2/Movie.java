package fc.java.part2;

public class Movie {
    String title;
    String genre ="love";

    public Movie(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Part2.Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
