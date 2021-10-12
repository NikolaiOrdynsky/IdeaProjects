package AleksandrVasko.oop.polimorfizm_nasledovanie.pm2;

/**
 * The type Mechenosec.
 */
class mechenosec extends fish {
    /**
     * Instantiates a new Mechenosec.
     *
     * @param name the name
     */
    mechenosec(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Меченосец не хищная рыба и она ест обчный рыбий корм. ");
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба, колторая быстро плавает. ");
    }
}
