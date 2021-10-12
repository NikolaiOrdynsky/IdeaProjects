package AleksandrVasko.oop.overloadOverrideExtendsEnum;

/**
 * The type Engine.
 */
public class Engine {
    private  int power;
    private EngineType engineType;
    private double size;

    /**
     * Instantiates a new Engine.
     *
     * @param power      the power
     * @param engineType the engine type
     * @param size       the size
     */
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
