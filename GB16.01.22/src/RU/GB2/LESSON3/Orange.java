package RU.GB2.LESSON3;

public class Orange extends Fruit {
    private float orangeWeight;
    private int orangeAll;
    public Orange (float _orangeWeight, int _orangeAll){
        orangeWeight = _orangeWeight;
        orangeAll = _orangeAll;
    }

    public float getOrangeWeight() {
        return orangeWeight;
    }

    public int getOrangeAll() {
        return orangeAll;
    }

}
