package RU.GB2.LESSON3;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg){
       //Задание№ 1
        String[] strings = {"1", "2", "3"};
        System.out.println(Arrays.toString(strings));
        changeArrayElements(strings, 0, 2);
        System.out.println(Arrays.toString(strings));
        //Задание№ 1

        System.out.println();

        //Задание№ 2
        int all = 0;
        Orange orange = new Orange(5.0F, 50);
        Box<Orange> orangeBox = new Box<>(orange, 0, "orange");
        orangeBox.setWeightBox(_getWeight(orangeBox.getWeightBox(), orange.getOrangeWeight(), orange.getOrangeAll()));
        System.out.println();
        System.out.println("Weight of box: " + orangeBox.getArrayList().getClass().getSimpleName() + " is: " + orangeBox.getWeightBox());


        System.out.println();
        System.out.println();
        Apple apple = new Apple(2.0F, 20);
        Box<Apple> appleBox = new Box<>(apple, 0, "apple");
        Box<Apple> appleBox1 = new Box<>(apple, 0, "apple");
        appleBox.setWeightBox(_getWeight(appleBox.getWeightBox(), apple.getAppleWeight(), apple.getAppleAll()));
        System.out.println();
        System.out.println("Weight of box: " + appleBox.getArrayList().getClass().getSimpleName() + " is: " + appleBox.getWeightBox());
        System.out.println();
        System.out.println();
        appleBox.comapre(orangeBox, appleBox);
        System.out.println();
        System.out.println();
        appleBox.sum(appleBox1, orangeBox);
        System.out.println();
        System.out.println();
        appleBox.sum(appleBox1, appleBox);

        //Задание№ 2

    }


    //Задание№ 1
    public static <T>void changeArrayElements(T[] array, int _first, int _secound){
        T _array = array[_first];
        array[_first] = array[_secound];
        array[_secound] = _array;
    }
    //Задание№ 1

    //Задание№ 2
    public static <S> float _getWeight(float _all, float _weight, int _allin){
        _all = _allin * _weight;
        return _all;
    }






    //Задание№ 1
}
