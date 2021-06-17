package AleksandrVasko.oop.polimorfizm_nasledovanie.pm2;

class mechenosec extends fish {
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
