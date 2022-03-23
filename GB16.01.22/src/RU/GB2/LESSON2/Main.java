package RU.GB2.LESSON2;

public class Main {
    public static void main(String[] arg) {
        String[][] proverkaMyArraySizeExceptionFalse = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}};
        String[][] proverkaMyArraySizeExceptionTrue = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] proverkaMyArrayDataExceptionFalse = {{"1", "2", "3", "4"}, {"5", "6", "h", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] proverkaMyArrayDataExceptionTrue = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};



        try {
            Main.proverkaMyArraySizeException(proverkaMyArraySizeExceptionFalse);
            System.out.println("MySize");
        }catch (MyArraySizeException exception){
            exception.printStackTrace();
        }
        try {
            Main.proverkaMyArraySizeException(proverkaMyArraySizeExceptionTrue);
            System.out.println("MySize");
        }catch (MyArraySizeException exception){
            exception.printStackTrace();
        }
        try {
            Main.proverkaMyArrayDataException(proverkaMyArrayDataExceptionFalse);
            System.out.println("Bce Horm");
        }catch (MyArrayDataException exception){
            exception.printStackTrace();
        }
        try {
            Main.proverkaMyArrayDataException(proverkaMyArrayDataExceptionTrue);
            System.out.println("Bce Horm");
        }catch (MyArrayDataException exception){
            exception.printStackTrace();
        }

    }

    public static void proverkaMyArraySizeException(String[][] array) throws MyArraySizeException{
        if (array.length != 4){
            throw new MyArraySizeException("Array have another size !!!");
        }
    }

    public static void proverkaMyArrayDataException(String[][] array) throws MyArrayDataException{
        int b = 0;
        int a = 0;
        int o = 1;
        String k;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                k = array[i][j];
                if (array[i][j] == "q" || array[i][j] == "w" || array[i][j] == "e" || array[i][j] == "r" || array[i][j] == "t" || array[i][j] == "y" || array[i][j] == "u" || array[i][j] == "i" || array[i][j] == "o" ||
                        array[i][j] == "p" || array[i][j] == "a" || array[i][j] == "s" || array[i][j] == "d" || array[i][j] == "f" || array[i][j] == "g" || array[i][j] == "h" || array[i][j] == "j" || array[i][j] == "k"
                        || array[i][j] == "l" || array[i][j] == "z" || array[i][j] == "x" || array[i][j] == "c" || array[i][j] == "v" || array[i][j] == "b" || array[i][j] == "b" || array[i][j] == "n" || array[i][j] == "m"){
                    throw new MyArrayDataException("В массиве содержиться символ: " + k + " в строчке №: " + i + " в столбце №: " + j);
                }
                else {
                    b = Integer.parseInt(k);
                    a = a + b;
                }
            }
        }
        System.out.println(a);
    }


}
