package RU.GB.LESSON2;

public class HomeWorkLesson2 {
    public static void main (String [] arg){
       proverka(10, 5);
       proverka2(-5);
       proverka3(500);
       proverka4(5, '*');
    }
    public static void proverka(int a, int b){
        boolean m = (a + b >= 10 && a + b <= 20 );
        if (m == true){
            System.out.println (m);
        }
        else{
            System.out.println (m);
        }
    }

    public static void proverka2 (int a){
        if (a >= 0){
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }

    public static void proverka3 (int a){
        boolean m = (a >= 0);
        if (m == true){
            System.out.println(m);
        }
        else{
            System.out.println(m);
        }
    }

    public static void proverka4 (int a, char k) {
        for (int b = 0; b < a; b++){
            System.out.print(k + " ");
        }
    }

}
