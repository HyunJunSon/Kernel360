package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apikey = "c6334a3af795e5d6bf2fd5dc4c6e8a1e";
        String city = "Seoul";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=" + apikey;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputline;
                StringBuffer content = new StringBuffer();

                while ((inputline = in.readLine()) != null) {
                    content.append(inputline);
                }
                in.close();

                JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                double temp = weatherData.getAsJsonObject("main").get("temp").getAsDouble();
                System.out.println("temp = " + temp);

            } else {
                System.out.println("오류");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


