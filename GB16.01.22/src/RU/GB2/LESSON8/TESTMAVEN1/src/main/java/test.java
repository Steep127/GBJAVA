import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;

public class test {
    public static void main(String[] arg) {

        //

       SQLITE base = new SQLITE();
       base.connect("jdbc:sqlite:test.db");
       base.ReadAll("jdbc:sqlite:test.db");
//       base.Add("jdbc:sqlite:test.db");
        //

        final String FiveDaysUrl = "http://dataservice.accuweather.com/forecasts/v1/daily/5day/294021";
        final String ApiKey = "?apikey=Uz4k7UblTFARnXSfpMdecY9bpnGAEaBc";
        final double date;

        try {
            URL WeatherURL = new URL(FiveDaysUrl + ApiKey);

            HttpURLConnection urlConnection = (HttpURLConnection) WeatherURL.openConnection();
            System.out.println(urlConnection.getRequestMethod());
            System.out.println(urlConnection.getResponseCode());
            if (urlConnection.getResponseCode() == 200){
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
                    StringBuilder stringBuilder = new StringBuilder();
                    String line = "";
                    while ((line = reader.readLine()) != null){
                        stringBuilder.append(line);
                    }
                    System.out.println(stringBuilder);


                    ObjectMapper objectMapperString = new ObjectMapper();

                    JsonNode dataWearher = objectMapperString.readTree(stringBuilder.toString()).at("/Headline/EffectiveDate");
                    JsonNode typeWeather = objectMapperString.readTree(stringBuilder.toString()).at("/Headline/Category");
                    JsonNode textWeather = objectMapperString.readTree(stringBuilder.toString()).at("/Headline/Text");

                    System.out.println("Today is: "+ dataWearher.asText() + " Will be: " + typeWeather.asText() + " and " + textWeather + " " );

                    String test = stringBuilder.toString();
                    System.out.println(test);
                        StringReader forecastJsonReader = new StringReader(test);
                        JsonReader jsonReader = Json.createReader(forecastJsonReader);
                        JsonObject weatherRespinseJson = jsonReader.readObject();
                        WeatherResponse weatherResponse = new WeatherResponse(weatherRespinseJson);



                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
            }




        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

}









//"{\"Headline\":{\"EffectiveDate\":\"2022-03-25T19:00:00+03:00\",\"EffectiveEpochDate\":1648224000,\"Severity\":4,\"Text\":\"A coating to an inch of snow Friday evening through Saturday morning\",\"Category\":\"snow\",\"EndDate\":\"2022-03-26T13:00:00+03:00\",\"EndEpochDate\":1648288800,\"MobileLink\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?lang=en-us\",\"Link\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?lang=en-us\"},\"DailyForecasts\":[{\"Date\":\"2022-03-24T07:00:00+03:00\",\"EpochDate\":1648094400,\"Temperature\":{\"Minimum\":{\"Value\":27.0,\"Unit\":\"F\",\"UnitType\":18},\"Maximum\":{\"Value\":44.0,\"Unit\":\"F\",\"UnitType\":18}},\"Day\":{\"Icon\":1,\"IconPhrase\":\"Sunny\",\"HasPrecipitation\":false},\"Night\":{\"Icon\":34,\"IconPhrase\":\"Mostly clear\",\"HasPrecipitation\":false},\"Sources\":[\"AccuWeather\"],\"MobileLink\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=1&lang=en-us\",\"Link\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=1&lang=en-us\"},{\"Date\":\"2022-03-25T07:00:00+03:00\",\"EpochDate\":1648180800,\"Temperature\":{\"Minimum\":{\"Value\":37.0,\"Unit\":\"F\",\"UnitType\":18},\"Maximum\":{\"Value\":43.0,\"Unit\":\"F\",\"UnitType\":18}},\"Day\":{\"Icon\":4,\"IconPhrase\":\"Intermittent clouds\",\"HasPrecipitation\":false},\"Night\":{\"Icon\":19,\"IconPhrase\":\"Flurries\",\"HasPrecipitation\":true,\"PrecipitationType\":\"Snow\",\"PrecipitationIntensity\":\"Light\"},\"Sources\":[\"AccuWeather\"],\"MobileLink\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=2&lang=en-us\",\"Link\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=2&lang=en-us\"},{\"Date\":\"2022-03-26T07:00:00+03:00\",\"EpochDate\":1648267200,\"Temperature\":{\"Minimum\":{\"Value\":27.0,\"Unit\":\"F\",\"UnitType\":18},\"Maximum\":{\"Value\":46.0,\"Unit\":\"F\",\"UnitType\":18}},\"Day\":{\"Icon\":29,\"IconPhrase\":\"Rain and snow\",\"HasPrecipitation\":true,\"PrecipitationType\":\"Mixed\",\"PrecipitationIntensity\":\"Light\"},\"Night\":{\"Icon\":19,\"IconPhrase\":\"Flurries\",\"HasPrecipitation\":true,\"PrecipitationType\":\"Snow\",\"PrecipitationIntensity\":\"Light\"},\"Sources\":[\"AccuWeather\"],\"MobileLink\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=3&lang=en-us\",\"Link\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=3&lang=en-us\"},{\"Date\":\"2022-03-27T07:00:00+03:00\",\"EpochDate\":1648353600,\"Temperature\":{\"Minimum\":{\"Value\":23.0,\"Unit\":\"F\",\"UnitType\":18},\"Maximum\":{\"Value\":34.0,\"Unit\":\"F\",\"UnitType\":18}},\"Day\":{\"Icon\":2,\"IconPhrase\":\"Mostly sunny\",\"HasPrecipitation\":false},\"Night\":{\"Icon\":38,\"IconPhrase\":\"Mostly cloudy\",\"HasPrecipitation\":false},\"Sources\":[\"AccuWeather\"],\"MobileLink\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=4&lang=en-us\",\"Link\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=4&lang=en-us\"},{\"Date\":\"2022-03-28T07:00:00+03:00\",\"EpochDate\":1648440000,\"Temperature\":{\"Minimum\":{\"Value\":30.0,\"Unit\":\"F\",\"UnitType\":18},\"Maximum\":{\"Value\":40.0,\"Unit\":\"F\",\"UnitType\":18}},\"Day\":{\"Icon\":29,\"IconPhrase\":\"Rain and snow\",\"HasPrecipitation\":true,\"PrecipitationType\":\"Mixed\",\"PrecipitationIntensity\":\"Light\"},\"Night\":{\"Icon\":29,\"IconPhrase\":\"Rain and snow\",\"HasPrecipitation\":true,\"PrecipitationType\":\"Mixed\",\"PrecipitationIntensity\":\"Light\"},\"Sources\":[\"AccuWeather\"],\"MobileLink\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=5&lang=en-us\",\"Link\":\"http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=5&lang=en-us\"}]}"
