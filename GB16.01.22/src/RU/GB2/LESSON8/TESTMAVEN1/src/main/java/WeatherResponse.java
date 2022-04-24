import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.util.stream.StreamSupport;

public class WeatherResponse {
    private DailyForecast[] dailyForecasts;

    public WeatherResponse(JsonObject jsonObject) throws JsonProcessingException {
        JsonArray jsonDailyForecastsArray = jsonObject.getJsonArray("DailyForecasts");
        dailyForecasts = new DailyForecast[jsonDailyForecastsArray.size()];
//        System.out.println("OCHOBA " + jsonDailyForecastsArray);
//        System.out.println("DLUNA " + dailyForecasts.length);
        DailyForecast[] sts;


        for (int i = 0; i < dailyForecasts.length; i++){
            ObjectMapper dailyForecasts = new ObjectMapper();
            String Array = jsonDailyForecastsArray.get(i).toString();
            JsonNode data = dailyForecasts.readTree(Array).at("/Date");

            JsonNode tempmin = dailyForecasts.readTree(Array).at("/Temperature/Minimum/Value");
            JsonNode tempmax = dailyForecasts.readTree(Array).at("/Temperature/Maximum/Value");
            JsonNode daywethr = dailyForecasts.readTree(Array).at("/Day/IconPhrase");
            JsonNode nightwethr = dailyForecasts.readTree(Array).at("/Night/IconPhrase");
            // DBFILE adding info
            SQLITE.ADDINFOINTDBFILE("jdbc:sqlite:test.db", data, daywethr, nightwethr, tempmax, tempmin);
            //
            System.out.println("В городе Москва на дату: " + data + " ожидается " + daywethr + " и ночью: " +  nightwethr + " температура от " + tempmin + " до " + tempmax );
            System.out.println();
        }

    }

    public DailyForecast[] getDailyForecasts() {
        return dailyForecasts;
    }

}

