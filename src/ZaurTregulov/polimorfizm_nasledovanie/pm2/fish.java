package ZaurTregulov.polimorfizm_nasledovanie.pm2;

abstract class fish extends animal {

    fish(String name) {
        super(name);
    }

    public void sleep() {
        System.out.println("Всегда интересно наблюдать, как спят рыбы. ");
    }

    abstract void swim();
}

