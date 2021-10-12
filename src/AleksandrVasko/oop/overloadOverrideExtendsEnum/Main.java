package AleksandrVasko.oop.overloadOverrideExtendsEnum;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Engine CarEngineType = new Engine(150, EngineType.PETROL, 3.0);
        Engine BusEngineType = new Engine(250, EngineType.DISEL, 5.0);


        auto car2 = new bus("volgabus", "t1000", BusEngineType, 100);
        auto car1 = new car("ford", "fokus", CarEngineType);
//        car2.setCurrentSpeed(10);
//        car2.setCurrentSpeed(0);
//        car2.getEngineType();
//        startBus(car2, 40, 50);
//
//        System.out.println(car2.getCurrentSpeed());
        start(car1);

    }

    /**
     * Start bus.
     *
     * @param a         the a
     * @param speed     the speed
     * @param passanger the passanger
     */
    public static void startBus(car a, int speed, int passanger) {
        if (a instanceof bus) {
            ((bus) a).start(speed, passanger);
        }
    }

    /**
     * Start.
     *
     * @param a the a
     */
    public static void start(auto a) {
        a.plusSpeed(40);
        a.minusSpeed(20);
    }
}