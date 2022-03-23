package RU.GB.LESSON5;

public class HomeWorkLesson5 {
    public static void main(String[] arg){

        //ClassSotrudnuc Sotrudnic1 = new ClassSotrudnuc ("Artem", "Rabotnuk", "Artem@lyst.ru", 5553535, 25000, 20);
        //Sotrudnic1.ShowAllInfo();

        ClassSotrudnuc[] Sotrudnic = new ClassSotrudnuc[5];
        Sotrudnic[0] = new ClassSotrudnuc("Artem SSS KKK", "Rabotnuk", "Artem@lyst.ru", 5553535, 20000, 20);
        Sotrudnic[1] = new ClassSotrudnuc("DMITIRY KARN MMM", "Rabotnuk", "Dmytry@lyst.ru", 5553537, 41000, 41);
        Sotrudnic[2] = new ClassSotrudnuc("Andrey Karandashev Xaa", "Rabotnuk", "Karandash@lyst.ru", 5553538, 35000, 35);
        Sotrudnic[3] = new ClassSotrudnuc("Vertolet Sayga Xaa", "Rabotnuk", "Vertolet@lyst.ru", 5553539, 51000, 51);
        Sotrudnic[4] = new ClassSotrudnuc("Poclednuu Poclednev Poc", "Poclednuu", "Poclednuu@lyst.ru", 5553540, 10000, 10);

        for (int i = 0; i < Sotrudnic.length; i++){
            if (Sotrudnic[i].getAge() > 40){
                Sotrudnic[i].ShowAllInfo();
            }
        }

    }



}
