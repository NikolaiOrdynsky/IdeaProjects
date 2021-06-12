package AleksandrVasko.oop.overloadOverrideExtendsEnum;

public class bus extends car {
    private final int sizePassanger;
    private int currentPassanger;

    public bus(String proizvoditel, String model, Engine engineType, int sizePassanger) {
        super(proizvoditel, model, engineType);
        this.sizePassanger = sizePassanger;
    }

    @Override
    public void minusSpeed(int speed) {
        if (speed > 0 && speed <= getCurrentSpeed()) {
            setCurrentSpeed(speed);
        }
        System.out.println("Скорость автобуса "+getCurrentSpeed());
    }

    @Override
    public void plusSpeed(int speed) {
        if (speed >= 0 && speed <= 100) {
            setCurrentSpeed(speed);
        }
        System.out.println("Скорость автобуса "+getCurrentSpeed());
    }

    public int getCurrentPassanger() {
        return this.currentPassanger;
    }

    public int getSizePassanger() {
        return sizePassanger;
    }

    public void start(int speed, int currentPassangerPlus) {
        if (speed > 0 && speed < 100) {
            setCurrentSpeed(speed);
        } else {
            System.out.println("Вы ввели неверное значение скорости.");
        }
        if (sizePassanger >= (currentPassanger + currentPassangerPlus)) {
            currentPassanger += currentPassangerPlus;
        } else {
            currentPassanger = sizePassanger;
            currentPassangerPlus -= currentPassanger;
            System.out.println("в автобусе не хватило места для " + currentPassangerPlus + " пассажиров.");
        }
        System.out.println("Колличество пассажиров " + currentPassanger);
    }

    public void stop(int currentPassangerMinus) {
        setCurrentSpeed(0);
        if (currentPassangerMinus <= currentPassanger) {
            currentPassanger -= currentPassangerMinus;
        }else{
            currentPassanger=0;
        }
        System.out.println(" Колличество пассажиров " + currentPassanger);
    }
}

