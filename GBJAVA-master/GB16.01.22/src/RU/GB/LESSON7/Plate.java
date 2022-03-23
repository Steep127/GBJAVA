package RU.GB.LESSON7;

public class Plate {
    private boolean boolGolod;
        private int food;
        public Plate(int food) {
            this.food = food;
        }
        public void decreaseFood(int n) {
            if (food - n > 0){
                food -= n;
                boolGolod = true;
            }
            else {
                System.out.println("No Much Food !!!");
                boolGolod = false;
                add50FoodInPlate();
                System.out.println("Added 50 food to plate !!!");
            }

        }
        public void info() {
            System.out.println("plate: " + food);
        }
        

    public boolean boolGolod(){
            return this.boolGolod;
    }

    public void add50FoodInPlate(){
            food += 50;
    }

       // public void infogolod() {
       //     Cat[].golod = true;
       // }

}
