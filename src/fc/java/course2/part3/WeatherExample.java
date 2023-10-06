package fc.java.course2.part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey = "{cb236a6605b2f9b730bd9d290ca57467}";
        String urlString = "http://api.openweathermap.org/geo/1.0/direct?q=Seoul&limit=5&appid="+apiKey;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200){
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputline;
                StringBuffer content = new StringBuffer();

                while((inputline = in.readLine()) != null){
                    content.append(inputline);
                }
                in.close();
                System.out.println(content);
            } else{

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
