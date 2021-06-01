package AleksandrVasko.oop;

public class Main {
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

    public static void startBus(car a, int speed, int passanger) {
        if (a instanceof bus) {
            ((bus) a).start(speed, passanger);
        }
    }

    public static void start(auto a) {
        a.plusSpeed(40);
        a.minusSpeed(20);
    }
}