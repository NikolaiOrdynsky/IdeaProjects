package AleksandrVasko.oop.polimorfizm_nasledovanie.pm2;

abstract class mammal extends animal implements speakable {
    mammal(String name) {
        super(name);
    }

    abstract void run();

    @Override
    public void speak() {
        System.out.println(name + " Поёт");
    }
}

