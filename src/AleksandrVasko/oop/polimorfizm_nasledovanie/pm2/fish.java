package AleksandrVasko.oop.polimorfizm_nasledovanie.pm2;

/**
 * The type Fish.
 */
abstract class fish extends animal {

    /**
     * Instantiates a new Fish.
     *
     * @param name the name
     */
    fish(String name) {
        super(name);
    }

    public void sleep() {
        System.out.println("Всегда интересно наблюдать, как спят рыбы. ");
    }

    /**
     * Swim.
     */
    abstract void swim();
}

