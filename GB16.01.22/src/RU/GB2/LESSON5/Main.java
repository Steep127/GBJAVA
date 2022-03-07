package RU.GB2.LESSON5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {

        String[] header = new String[]{"sss", "www", "qqq"};
        int[][] data = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};



        masiveStringOne(header);
        newStroka();
        masiveIntTwo(data);
        read("test1.csv");
//        HardReset(); - для сброса содержимого в тхт


    }




    public static void newStroka(){
        try (FileOutputStream ggg = new FileOutputStream("test1.txt", true)) {
            ggg.write("\n".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sendInfoStream(byte[] l_){
        try (FileOutputStream ggg = new FileOutputStream("test1.txt", true)) {
            ggg.write(l_);
            ggg.write(";".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void HardReset(){
        try (FileOutputStream ggg = new FileOutputStream("test1.txt", false)) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void read(String filename){
        try (BufferedReader reader = new BufferedReader(new
                FileReader(filename))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void masiveStringOne(String[] header_){
        for (int i = 0; i < header_.length; i++) {
            byte[] l = header_[i].getBytes(StandardCharsets.UTF_8);
            sendInfoStream(l);
        }
    }

    public static void masiveIntTwo(int[][] data_){
        for (int i = 0; i < data_.length; i++) {
            for (int p = 0; p < data_.length; p++) {
                int k = data_[i][p];
                String s = Integer.toString(k);
                byte[] l = s.getBytes(StandardCharsets.UTF_8);
                sendInfoStream(l);
            }
            newStroka();
        }
    }

}






