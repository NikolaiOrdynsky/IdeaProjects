package AleksandrVasko.oop.polimorfizm_nasledovanie.pm2;

/**
 * The type Animal.
 */
abstract public class animal {
    /**
     * The Name.
     */
    String name;

    /**
     * Instantiates a new Animal.
     *
     * @param name the name
     */
    animal(String name) {
        this.name = name;
    }

    /**
     * Sleep.
     */
    abstract void sleep();

    /**
     * Eat.
     */
    abstract void eat();
}



