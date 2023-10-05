package fc.java.course1.part2;

public class BookExam {
    public static void main(String[] args) {

        Book b = new Book();
        b.title = "자바";
        b.price = 30000;
        b.company = "패스트캠퍼스";
        b.author = "박매일";
        b.isbn = "19988110";


        System.out.println(b.title+"\t"+b.price+"\t"+b.company+"\n"+b.page+"\n"+b.isbn+"\n");

    }
}
