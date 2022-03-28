import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] arg) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car1 = new Car("red", "bmw");
        objectMapper.writeValue(new File("car.json"), car1);
        String json = objectMapper.writeValueAsString(car1);
        System.out.println(json);

    }
}
