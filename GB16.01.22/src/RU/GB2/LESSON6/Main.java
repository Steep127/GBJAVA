package RU.GB2.LESSON6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] arg) {
        final String FiveDaysUrl = "http://dataservice.accuweather.com/forecasts/v1/daily/5day/294021";
        final String ApiKey = "?apikey=Uz4k7UblTFARnXSfpMdecY9bpnGAEaBc";

        try {
            URL WeatherURL = new URL(FiveDaysUrl + ApiKey);

            HttpURLConnection urlConnection = (HttpURLConnection) WeatherURL.openConnection();

            System.out.println(urlConnection.getRequestMethod());
            System.out.println();
            System.out.println(urlConnection.getResponseCode());
            System.out.println(urlConnection.getResponseMessage());
            if (urlConnection.getResponseCode() == 200){
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
                    StringBuilder stringBuilder = new StringBuilder();
                    String line = "";
                    while ((line = reader.readLine()) != null){
                        stringBuilder.append(line);
                    }
                    System.out.println(stringBuilder);

                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
            }


        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
