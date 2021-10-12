package AleksandrVasko.oop.polimorfizm_nasledovanie.pm2;

/**
 * The type Bird.
 */
abstract  class bird extends animal implements speakable {
    /**
     * Instantiates a new Bird.
     *
     * @param name the name
     */
    bird(String name) {
        super(name);
    }

    /**
     * Fly.
     */
    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " Поёт!");
    }
}


