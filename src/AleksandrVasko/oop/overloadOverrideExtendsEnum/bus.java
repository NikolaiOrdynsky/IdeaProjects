package AleksandrVasko.oop.overloadOverrideExtendsEnum;

/**
 * The type Bus.
 */
public class bus extends car {
    private final int sizePassanger;
    private int currentPassanger;

    /**
     * Instantiates a new Bus.
     *
     * @param proizvoditel  the proizvoditel
     * @param model         the model
     * @param engineType    the engine type
     * @param sizePassanger the size passanger
     */
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

    /**
     * Gets current passanger.
     *
     * @return the current passanger
     */
    public int getCurrentPassanger() {
        return this.currentPassanger;
    }

    /**
     * Gets size passanger.
     *
     * @return the size passanger
     */
    public int getSizePassanger() {
        return sizePassanger;
    }

    /**
     * Start.
     *
     * @param speed                the speed
     * @param currentPassangerPlus the current passanger plus
     */
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

    /**
     * Stop.
     *
     * @param currentPassangerMinus the current passanger minus
     */
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

