package AleksandrVasko.oop.inerClass;


/**
 * The type Cell phone.
 */
public class CellPhone {
    private String make;
    private String model;
    private Displey display;
    private RadioModul gsm;
    private AbstractClass button;

    /**
     * Instantiates a new Cell phone.
     *
     * @param make  the make
     * @param model the model
     */
    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;

    }

    /**
     * The interface Abstract class.
     */
    public interface AbstractClass{
        /**
         * Click.
         */
        public void click();
    }

    /**
     * Turn on.
     */
    public void turnOn(){
initDispley();
}

    /**
     * Init displey.
     */
    public void initDispley(){
        display = new Displey();
}

    /**
     * Zvonit.
     *
     * @param number the number
     */
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


    /**
     * Gets make.
     *
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * Gets model.
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets display.
     *
     * @return the display
     */
    public Displey getDisplay() {
        return display;
    }

}
