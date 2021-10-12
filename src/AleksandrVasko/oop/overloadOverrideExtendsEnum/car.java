package AleksandrVasko.oop.overloadOverrideExtendsEnum;

/**
 * The type Car.
 */
public class car extends auto {

    private final String proizvoditel;
    private final String model;
    private final Engine engineType;
    private int currentSpeed;


    /**
     * Instantiates a new Car.
     *
     * @param proizvoditel the proizvoditel
     * @param model        the model
     * @param engineType   the engine type
     */
    public car(String proizvoditel, String model, Engine engineType) {
        this.proizvoditel = proizvoditel;
        this.model = model;
        this.engineType = engineType;
        this.currentSpeed = currentSpeed;

    }

    @Override
    public void plusSpeed(int speed) {
        if (speed >= 0 && speed <= 100) {
            this.currentSpeed=speed;
        }
        System.out.println("Скорость машины "+getCurrentSpeed());
    }



    @Override
    public void minusSpeed(int speed) {
        if (speed > 0 && speed <= this.currentSpeed) {
            this.currentSpeed -= speed;
        }
        System.out.println("Скорость машины "+getCurrentSpeed());
    }

    /**
     * Gets proizvoditel.
     *
     * @return the proizvoditel
     */
    public String getProizvoditel() {
        return proizvoditel;
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
     * Gets engine type.
     */
    public void getEngineType() {
        System.out.println(engineType.toString());
    }


    /**
     * Gets current speed.
     *
     * @return the current speed
     */
    public int getCurrentSpeed() {
       return this.currentSpeed;
    }

    /**
     * Sets current speed.
     *
     * @param currentSpeed the current speed
     */
    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed >= 0 && currentSpeed <= 100) {
            this.currentSpeed = currentSpeed;
        } else {
            System.out.println("Неверная скорость. ");
        }

    }
}
