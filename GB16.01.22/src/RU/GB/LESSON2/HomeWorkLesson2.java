package RU.GB.LESSON2;

public class HomeWorkLesson2 {
    public static void main (String [] arg){
       proverka(10, 5);
       proverka2(-5);
       proverka3(-1);
       proverka4(10, '*');
    }
    public static boolean proverka(int a, int b){
        if (a + b >= 10 && a + b <= 20 ){
            System.out.println ("true");
            return true;
        }
        else{
            System.out.println ("false");
            return false;
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

    public static boolean proverka3 (int a){
        if (a >= 0){
            System.out.println(false);
            return false;
        }
        else{
            System.out.println(true);
            return true;
        }
    }

    public static void proverka4 (int a, char k) {
        for (int b = 0; b < a; b++){
            System.out.print(k + " ");
        }
    }

}
