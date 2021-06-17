package AleksandrVasko.oop.polimorfizm_nasledovanie.pm2;

class leo extends mammal {
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
