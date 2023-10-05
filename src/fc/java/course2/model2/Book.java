package fc.java.course2.model2;

public class Book {
    private String title;
    private int price;
    private String company;
    private String name;

    public Book(String title, int price, String company, String name) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
