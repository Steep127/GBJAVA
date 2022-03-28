public class Car {
    private String color;
    private String type;
    public Car(String _color, String _type){
        color = _color;
        type = _type;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }
}
