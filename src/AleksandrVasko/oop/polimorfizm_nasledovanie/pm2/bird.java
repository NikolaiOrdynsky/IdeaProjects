package AleksandrVasko.oop.polimorfizm_nasledovanie.pm2;

abstract  class bird extends animal implements speakable {
    bird(String name) {
        super(name);
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " Поёт!");
    }
}


