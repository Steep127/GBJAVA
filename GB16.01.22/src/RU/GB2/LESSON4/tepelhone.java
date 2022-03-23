package RU.GB2.LESSON4;

import java.util.ArrayList;

public class tepelhone {

    ArrayList<String> telephoneInfo = new ArrayList<>();
    ArrayList<String> nameInfo = new ArrayList<>();

    public tepelhone(){
        telephoneInfo.add(0, "888888");
        nameInfo.add(0, "Alex");

    }

    public void add(String number, String name){
        int t = 0;
        t = telephoneInfo.size();
        System.out.println(t);
        telephoneInfo.add(t, number);
        nameInfo.add(t, name);
    }


    public void get(String name){
        for (int i = 0; i < nameInfo.size(); i++){
            if (name == nameInfo.get(i)){
                System.out.println(nameInfo.get(i) + " phone is: " + telephoneInfo.get(i));
            }
        }
    }


}
