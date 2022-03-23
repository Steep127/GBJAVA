package RU.GB.LESSON3;

import java.util.Scanner;

public class HomeWorkLesson3 {
    public static void main (String[] arg){
        MasivZamena();
        RoadTo100();
        SixTwo();
        Dioganalb();
        Vvod();
    }
    public static void MasivZamena() {
        int [] ZeroOne = {0, 1, 0, 1, 1, 1};
        //System.out.println(ZeroOne[1] + " " + ZeroOne[2]);
        for (int i = 0; i < ZeroOne.length; i++) {

            if (ZeroOne[i] == 0){
                System.out.print("1 |");
            }
            else{
                System.out.print("0 |");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void RoadTo100(){
        int [] start = new int [100];
        for (int i = 0; i < start.length; i++){
            start[i] = i + 1;
            System.out.print(start[i] + " |");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void SixTwo(){
        int [] TwoSix = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < TwoSix.length; i++){
            if (TwoSix[i] < 6){
                TwoSix[i] = TwoSix[i] * 2;
                System.out.print(TwoSix[i] + " |");
            }
            else {
                System.out.print(TwoSix[i] + " |");
            }
        }

    }
    public static void Dioganalb(){
        int [] [] tabluca = new int[5][6];
        int chuclo = 1;
        for (int i = 0; i < tabluca.length; i++){
            for (int j = 0; j < tabluca.length; j++){
                //tabluca[i][j] = chuclo;
                if (tabluca[i] == tabluca[j]){
                    System.out.print('\t' + "0 |");
                }
                //System.out.print('\t' + tabluca[i][j] + " |");
                else {
                    System.out.print('\t' + "1 |");
                }
            }
            System.out.println(" ");
            System.out.println(" ");
        }


    }

    public static void Vvod(){
        Scanner isc = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);
        System.out.print("Введите число строк масива: ");
        int len = isc.nextInt();
        System.out.print("Введите содержимое масива: ");
        int gen = ssc.nextInt();
        //String initialValue = ssc.nextLine();
        int[] Mas = new int[len];
        for (int i = 0; i < Mas.length; i++){
            System.out.print(" " + gen + " ");
        }


    }



}
