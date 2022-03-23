package RU.GB.LESSON7;

public class Cat {
        String name;
        private int appetite;
        protected boolean golod;
        public Cat(String name, int appetite, boolean golod) {
            this.name = name;
            this.appetite = appetite;
            this.golod = golod;
        }


    public void eat(Plate p) {
            p.decreaseFood(appetite);
        }

        public void infogolod(){
            System.out.println(golod);
        }

        public void golodtrue(){
            golod = true;
        }

        public void golodfalse(){
            golod = false;
        }
}
