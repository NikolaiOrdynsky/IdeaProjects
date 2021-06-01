package ZaurTregulov.polimorfizm_nasledovanie.pm2;

class pingvin extends bird {
    pingvin(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать. ");
    }

    @Override
    void eat() {
        System.out.println("Пингвины дюбят есть рыбу. ");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу. ");
    }

    @Override
    public void speak() {
        System.out.println("Пингвины не умеют петь как соловьи. ");
    }
}
