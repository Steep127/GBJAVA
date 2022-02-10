package RU.GB.LESSON7;

public class HomeWork7 {

        public static void main(String[] args) {
            //Cat cat = new Cat("Barsik", 5, false);
            Plate plate = new Plate(100);
            //cat.infogolod();
            //cat.eat(plate);
            //plate.info();
            //cat.infogolod();


            Cat[] cat = new Cat[4];
            cat[0] = new Cat("Barsik", 80, true);
            cat[1] = new Cat("Vasyi", 25, false);
            cat[2] = new Cat("Markuz", 20, true);
            cat[3] = new Cat("Myrzik", 10, true);
            //cat[3] = new Cat("Borsk", 4, false);
            //cat[4] = new Cat("Kot", 20, false);

            for (int i = 0; i < cat.length; i++){
                plate.info();
                System.out.print("KoT " + cat[i].name + " golod is "); cat[i].infogolod();
                if(cat[i].golod == true){
                    System.out.println("KoT " + cat[i].name + " Begun to eat"); cat[i].eat(plate);
                    if(plate.boolGolod() == true){
                        cat[i].golodfalse();
                    }
                }
                plate.info();
                System.out.print("KoT " + cat[i].name + " golod is "); cat[i].infogolod();
                if (cat[i].golod == true){
                    System.out.println("KoT " + cat[i].name + " Begun to eat"); cat[i].eat(plate);
                }
            }
        }
}

