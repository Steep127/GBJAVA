import com.fasterxml.jackson.databind.JsonNode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLITE {

    public static void ADDINFOINTDBFILE(String DBFILE, JsonNode jsonNodedata, JsonNode jsonNodeDayText, JsonNode jsonNodeNightText, JsonNode jsonNodeMinTemp, JsonNode jsonNodeMaxTemp) {
        String url = DBFILE;
        String Add = "INSERT INTO weather (localDate, dayText, nightText, minTemperature, maxTemperatue) VALUES(" + jsonNodedata + "," + jsonNodeDayText + "," + jsonNodeNightText + "," + jsonNodeMinTemp + "," + jsonNodeMaxTemp + ");";
        try (Connection sqlite = DriverManager.getConnection(DBFILE);
             Statement statement = sqlite.createStatement();
        ){
            sqlite.setAutoCommit(false);
            statement.execute(Add);
            sqlite.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }

    public void connect(String DBFILE){
        String url = DBFILE;
        String CreateTable = "CREATE TABLE IF NOT EXISTS weather (id integer PRIMARY KEY AUTOINCREMENT NOT NULL, localDate text NOT NULL, dayText text NOT NULL, nightText text NOT NULL, minTemperature real NOT NULL, maxTemperatue real NOT NULL);";

//
        try (Connection sqlite = DriverManager.getConnection(url);
             Statement statement = sqlite.createStatement()
        ){
            sqlite.setAutoCommit(false);
            statement.execute(CreateTable);
            System.out.println("Connected");
            sqlite.commit();

        }catch (Exception exception){
            System.out.println("NotConnected");
            System.out.println(exception.getMessage());
        }
    }



    public void ReadAll(String DBFILE){
        String url = DBFILE;
        String readAll = "SELECT * FROM weather;";
        try (Connection sqlite = DriverManager.getConnection(url);
        Statement statement = sqlite.createStatement();
        ){
            sqlite.setAutoCommit(false);
            ResultSet resultSet = statement.executeQuery(readAll);
            while (resultSet.next()){
                String data = resultSet.getString("localDate");
                String dayText = resultSet.getString("dayText");
                String nightText = resultSet.getString("nightText");
                Double minTemperature = resultSet.getDouble("minTemperature");
                Double maxTemperatue = resultSet.getDouble("maxTemperatue");

                System.out.println("WEATHER IN DB FILE: " + data + " " + dayText + " " + nightText + " " + minTemperature + " " + maxTemperatue);
                sqlite.commit();
            }

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public void Add(String DBFILE){
        String url = DBFILE;
        String Add = "INSERT INTO weather (localDate, dayText, nightText, minTemperature, maxTemperatue) VALUES(\"brabra\", \"brabra\", \"brabra\", 55.44, 22.11);";
        try (Connection sqlite = DriverManager.getConnection(url);
             Statement statement = sqlite.createStatement();
        ){
            sqlite.setAutoCommit(false);
            statement.execute(Add);
            sqlite.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());

        }

    }

}
