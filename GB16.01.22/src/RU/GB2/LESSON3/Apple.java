package RU.GB2.LESSON3;

public class Apple extends Fruit{
    private float appleWeight;
    private int appleAll;
    public Apple (float _appleWeight, int _appleAll){
        appleWeight = _appleWeight;
        appleAll = _appleAll;
    }

    public float getAppleWeight() {
        return appleWeight;
    }

    public int getAppleAll() {
        return appleAll;
    }

}
