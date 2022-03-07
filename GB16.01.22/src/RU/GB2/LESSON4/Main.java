package RU.GB2.LESSON4;

import java.util.ArrayList;

public class Main {
    public static void main (String[] arg){

        //ЗАДАНИЕ № 1
        ArrayList<String> twenty = new ArrayList<>();
        ArrayList<String> twentyitog = new ArrayList<>();
        twenty.add("QQQ");
        twenty.add("www");
        twenty.add("www");
        twenty.add("rrr");
        twenty.add("QQQ");
        twenty.add("QQQ");
        twenty.add("QQQ");
        twenty.add("iii");
        twenty.add("QQQ");
        twenty.add("aaa");
        for (int i = 0; i < twenty.size(); i++){
            int w = 0;
            for (int j = 0; j < twenty.size(); j++){
                if (twenty.get(i) == twenty.get(j)){
                    w = w + 1;
                }
                else {
                }

            }
            if (w == 1){
                twentyitog.add(i, twenty.get(i) + " repeats: " + w + " time's. ITSSSS EPIC WORLD " );
            }
            else {
                twentyitog.add(i, twenty.get(i) + " repeats: " + w + " time's ");
            }

        }


        for (int i = 0; i < twentyitog.size(); i++){
            for (int j = 0; j < twentyitog.size(); j++){
                if (twentyitog.get(i) == twentyitog.get(j)){
                    if (i == j){
                        twentyitog.remove(j);

                    }
                }
            }
        }

        System.out.println(twentyitog);
        //ЗАДАНИЕ №1




        //Задание №2

        tepelhone tepelhone = new tepelhone();

        tepelhone.add("888", "Andrey");

        tepelhone.add("555", "Alex");

        tepelhone.add("222", "Alex");


        tepelhone.get("Andrey");

        tepelhone.get("Alex");

        //Задание №2
    }

}
