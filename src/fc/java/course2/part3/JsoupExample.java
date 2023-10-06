package fc.java.course2.part3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupExample {
    public static void main(String[] args) {
        String url = "https://sum.su.or.kr:8888/bible/today";
        String date = "?base_de=2023-03-21";
        Document document = null;
        try {
            document = Jsoup.connect(url+date).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Element bibleText = document.getElementById("bible_text");
        Element bibleInfoBox = document.getElementById("bibleinfo_box");

        System.out.println("bibleText = " + bibleText.text());
        System.out.println("bibleInfoBox = " + bibleInfoBox.text());

        Elements num = document.select(".num");
        Elements info = document.select(".info");

//        num.forEach(e -> System.out.println(e.text()));
//        info.forEach(e -> System.out.println(e.text()));
        for(int i=0; i<num.size(); i++){
            System.out.println(num.get(i).text()+":"+ info.get(i).text());
        }
    }
}
