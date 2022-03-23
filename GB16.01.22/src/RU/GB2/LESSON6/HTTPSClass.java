package RU.GB2.LESSON6;

import sun.net.www.protocol.http.HttpURLConnection;
import sun.plugin.net.protocol.jar.CachedJarURLConnection;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HTTPSClass {
    public static void main (String[] arg){
        try {
            URL weather = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/294021");
           System.out.println("Путь: " + weather.getFile());
           System.out.println("Хост: " + weather.getHost());
           System.out.println("Порт: " + weather.getPort());
           System.out.println("Протокол: " + weather.getProtocol());

            HttpURLConnection urlConnection = (HttpURLConnection) weather.openConnection();

            System.out.println(weather);


            System.out.println("Метод запроса: " + urlConnection.getRequestMethod());
            System.out.println(" :" + urlConnection.getResponseMessage());
            System.out.println(urlConnection.getResponseCode());

            Map<String, List<String>> headers = weather.openConnection().getHeaderFields();

            for (String k : headers.keySet()){
                System.out.println("Ключ " + k + " Значение: " + headers.get(k));
            }


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

   // https://developer.accuweather.com/accuweather-locations-api/apis/get/locations/v1/cities/search
}
