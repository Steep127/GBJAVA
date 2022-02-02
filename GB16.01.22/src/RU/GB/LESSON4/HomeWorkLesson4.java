package RU.GB.LESSON4;

import java.security.PublicKey;
import java.util.Scanner;

public class HomeWorkLesson4 {

    public  static Scanner scan = new Scanner(System.in);
    //public static int x = scan.nextInt() + 1;
    //public static int y = scan.nextInt() + 1;
    public static int y = 4;
    public static int x = 4;
    public static char empty = '_';
    public static char player1 = 'X';
    public static char player2 = '0';
    public static char [][] table = new char[x][y];
    public static  boolean m;



    public static void main(String[] arg){

        createTable();

        do {
            showTable();
            if (end() == false){
                stepplayer1();
            }
            //stepplayer1();
            showTable();
            if (end() == false){
                stepplayer2();
            }
            //stepplayer2();
        } while (!end());
        //proverka1();

    }




    public static void createTable(){

        for (int i = 1; i < x; i++){
            for (int o = 1; o < y; o++){
                table[i][o] = empty;
            }
        }
    }

    public static void showTable(){
        for (int i = 1; i < x; i++){
            for (int o = 1; o < y; o++){
                System.out.print("|" + table[i][o] + "|");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }

    public static void stepplayer1(){
        System.out.println("Ход первого игрока");
        System.out.print("Введите кординату x: ");
        int x = scan.nextInt();
        System.out.print("Введите кординату y: ");
        int y = scan.nextInt();
        if (x >= 1 && x <= 3 && y >= 1 && y <= 3 && table[x][y] == empty) {
            table[x][y] = player1;
        }
        else {
            System.out.println("Не допустимое значение !!!");
            showTable();
            stepplayer1();
        }
        //while (!proverka1(x, y));
    }

    public static void stepplayer2(){
        System.out.println("Ход второго игрока игрока");
            System.out.print("Введите кординату x: ");
            int x = scan.nextInt();
            System.out.print("Введите кординату y: ");
            int y = scan.nextInt();
                if (x >= 1 && x <= 3 && y >= 1 && y <= 3 && table[x][y] == empty) {
                    table[x][y] = player2;
                }
                else {
                    System.out.println("Не допустимое значение или клетка уже занята !!!");
                    showTable();
                    stepplayer2();
                }
        //System.out.print("Введите кординату x: ");
        //int x = scan.nextInt();
        //System.out.print("Введите кординату y: ");
        //int y = scan.nextInt();
        //table[x][y] = player2;
    }

    //public static boolean netXodov(){
        //int pyctbxcletok = x * y;
        //int freecletku = 0;
        //System.out.print(pyctbxcletok);
        //for (int i = 1; i < x; i++){
            //for (int o = 1; o < y; o++){
                //if (table[i][o] == empty){
                    //freecletku++;
                    //return false;
                //}
            //}
        //}
        //return true;
   // }

    public static boolean end(){
        //int pyctbxcletok = x * y;
        //int freecletku = 0;
        //System.out.print(pyctbxcletok);
        for (int i = 1; i < x; i++){
            for (int o = 1; o < y; o++){
                if (table[1][1] == player1 && table[2][1] == player1 && table[3][1] == player1
                        || table[1][2] == player1 && table[2][2] == player1 && table[3][2] == player1
                        || table[1][3] == player1 && table[2][3] == player1 && table[3][3] == player1
                        || table[1][1] == player1 && table[1][2] == player1 && table[1][3] == player1
                        || table[2][1] == player1 && table[2][2] == player1 && table[2][3] == player1
                        || table[3][1] == player1 && table[3][2] == player1 && table[3][3] == player1
                        || table[1][1] == player1 && table[2][2] == player1 && table[3][3] == player1
                        || table[1][3] == player1 && table[2][2] == player1 && table[3][1] == player1){
                    System.out.println();
                    System.out.print("Player 1 win");
                    System.out.println();
                    return true;
                }
                else if (table[1][1] == player2 && table[2][1] == player2 && table[3][1] == player2
                        || table[1][2] == player2 && table[2][2] == player2 && table[3][2] == player2
                        || table[1][3] == player2 && table[2][3] == player2 && table[3][3] == player2
                        || table[1][1] == player2 && table[1][2] == player2 && table[1][3] == player2
                        || table[2][1] == player2 && table[2][2] == player2 && table[2][3] == player2
                        || table[3][1] == player2 && table[3][2] == player2 && table[3][3] == player2
                        || table[1][1] == player2 && table[2][2] == player2 && table[3][3] == player2
                        || table[1][3] == player2 && table[2][2] == player2 && table[3][1] == player2){
                    System.out.println();
                    System.out.print("Player 2 win");
                    System.out.println();
                    return true;
                }
                else if (table[i][o] == empty){
                    //freecletku++;
                    return false;
                }
            }
        }
        System.out.print("DRAW");
        return true;
    }

    //public static boolean ProverkaNaRamkuPole(step){
       // if (x >= 1 && x <= 3 && y >= 1 && y <= 3){
         //   return true;
    //}
     //   return false;
    //}
}


