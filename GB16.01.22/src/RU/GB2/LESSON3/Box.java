package RU.GB2.LESSON3;

public class Box<S> {
    private S ArrayList;
    private float weightBox;
    private String type;


    public Box(S _ArrayList, float _weightBox, String _type){
        this.ArrayList = _ArrayList;
        this.weightBox = _weightBox;
        this.type = _type;

    }

    public float getWeightBox() {
        return weightBox;
    }

    public String getType() {
        return type;
    }

    public void setWeightBox(float weightBox) {
        this.weightBox = weightBox;
    }

    public boolean comapre(Box<?> another, Box<?> another2){
        if (another.getWeightBox() == another2.getWeightBox()){
            System.out.println("Box of: " + another.getType() + " = Box of : " + another2.getType());
            return true;
        }
        else {
            System.out.println("Box of: " + another.getType() + " != Box of : " + another2.getType());
            return false;
        }
    }

    public void sum (Box<?> another, Box<?> another2){
        if (another.type == another2.type){
            another.setWeightBox(another.weightBox + another2.weightBox);
            System.out.println("Box of: " + another.type + " + Box of: " + another2.type + " = Succseesss" );
            System.out.println("Weight of box is: " + another.getWeightBox() );
        }
        else {
            System.out.println("Box of: " + another.type + " + Box of: " + another2.type + " = Falseeeee" );

        }
    }

    public S getArrayList() {
        return ArrayList;
    }
}
