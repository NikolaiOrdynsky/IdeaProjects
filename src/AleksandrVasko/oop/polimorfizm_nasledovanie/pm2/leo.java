package AleksandrVasko.oop.polimorfizm_nasledovanie.pm2;

/**
 * The type Leo.
 */
class leo extends mammal {
    /**
     * Instantiates a new Leo.
     *
     * @param name the name
     */
    leo(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит. ");
    }

    @Override
    void eat() {
        System.out.println("Лев, как и любой хищник, любит мясо. ");
    }

    @Override
    void run() {
        System.out.println("Лев, не самая быстрая кошка. ");
    }
}
