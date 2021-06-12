package AleksandrVasko.oop.overloadOverrideExtendsEnum;

public class Engine {
    private  int power;
    private EngineType engineType;
    private double size;

    public Engine(int power, EngineType engineType, double size) {
        this.power = power;
        this.engineType = engineType;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", engineType=" + engineType +
                ", size=" + size +
                '}';
    }
}
