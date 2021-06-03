package AleksandrVasko.oop.inerClass;


public class CellPhone {
    private String make;
    private String model;
    private Displey display;
    private RadioModul gsm;
    private AbstractClass button;

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;

    }
    public interface AbstractClass{
        public void click();
    }
public void turnOn(){
initDispley();
}
public void initDispley(){
        display = new Displey();
}
public void zvonit(String number){
        button = new AbstractClass() {
            @Override
            public void click() {
                System.out.println("click button.");
            }
        };
        button.click();
        gsm = new RadioModul();
        gsm.call(number);
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
