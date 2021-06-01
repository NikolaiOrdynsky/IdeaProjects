package AleksandrVasko.oop.inerClass;


public class CellPhone {
    private String make;
    private String model;
    private Displey display;

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;

    }
public void turnOn(){
initDispley();
}
public void initDispley(){
        display = new Displey();
}

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Displey getDisplay() {
        return display;
    }
}
