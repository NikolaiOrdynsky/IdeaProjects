package AleksandrVasko.oop.overloadOverrideExtendsEnum;

public class car extends auto {

    private final String proizvoditel;
    private final String model;
    private final Engine engineType;
    private int currentSpeed;


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

    public String getProizvoditel() {
        return proizvoditel;
    }


    public String getModel() {
        return model;
    }


    public void getEngineType() {
        System.out.println(engineType.toString());
    }


    public int getCurrentSpeed() {
       return this.currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed >= 0 && currentSpeed <= 100) {
            this.currentSpeed = currentSpeed;
        } else {
            System.out.println("Неверная скорость. ");
        }

    }
}
