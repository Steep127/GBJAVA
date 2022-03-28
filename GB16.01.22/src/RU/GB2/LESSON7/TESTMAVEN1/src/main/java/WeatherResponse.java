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
        System.out.println("OCHOBA " + jsonDailyForecastsArray);
        System.out.println("DLUNA " + dailyForecasts.length);
        DailyForecast[] sts;

        //

        for (int i = 0; i < dailyForecasts.length; i++){
            ObjectMapper dailyForecasts = new ObjectMapper();
//            System.out.println(jsonDailyForecastsArray.get(i));
            String k = jsonDailyForecastsArray.get(i).toString();
            JsonNode data = dailyForecasts.readTree(k).at("/Date");
            System.out.println(data);


//            ObjectMapper Op = new ObjectMapper();
//            System.out.println("Array size is  " + jsonDailyForecastsArray.size());
//////            JsonNode www = Op.readTree().at("/Date");
//            System.out.println(jsonDailyForecastsArray.get(i));
//            System.out.println();
//            for (int w = 0; i < jsonDailyForecastsArray.size(); w++){
//                String post = jsonDailyForecastsArray.getString(w, "EpochDate");
//                System.out.println(post);
//                System.out.println();
//            }
        }


        //
//        dailyForecasts = new DailyForecast[jsonDailyForecastsArray.size()];
//        System.out.println(jsonDailyForecastsArray.size());
//        for (int forecast = 0; forecast < dailyForecasts.length; forecast++){
//            JsonObject jsonObject1 = jsonDailyForecastsArray.getJsonObject(forecast);
//            DailyForecast dailyForecast = new DailyForecast(jsonObject1);
//            dailyForecasts[forecast] = dailyForecast;
//            System.out.println(dailyForecasts[1].getClass().toString());
//        }
    }

    public DailyForecast[] getDailyForecasts() {
        return dailyForecasts;
    }

}
