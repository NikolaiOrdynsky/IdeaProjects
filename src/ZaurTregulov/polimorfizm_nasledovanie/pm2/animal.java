package ZaurTregulov.polimorfizm_nasledovanie.pm2;

abstract public class animal {
    String name;

    animal(String name) {
        this.name = name;
    }

    abstract void sleep();

    abstract void eat();
}



