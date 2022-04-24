import javax.json.JsonNumber;
import javax.json.JsonObject;

public class DailyForecast {
    private String date;
    private String typeWeather;
    private String temperature;
    private int test;
    public DailyForecast(JsonObject _jsonObject){

//      temperature = String.valueOf(_jsonObject.getJsonObject("Temperature").getJsonObject("Minimum").getJsonNumber("Value").doubleValue());
      test = _jsonObject.getJsonNumber("EpochDate").intValue();

    }

    public String getTemperature() {
        return temperature;
    }

    public int getTest() {
        return test;
    }
}
