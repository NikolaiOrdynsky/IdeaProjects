package AleksandrVasko.oop.polimorfizm_nasledovanie.pm2;

/**
 * The type Mammal.
 */
abstract class mammal extends animal implements speakable {
    /**
     * Instantiates a new Mammal.
     *
     * @param name the name
     */
    mammal(String name) {
        super(name);
    }

    /**
     * Run.
     */
    abstract void run();

    @Override
    public void speak() {
        System.out.println(name + " Поёт");
    }
}

