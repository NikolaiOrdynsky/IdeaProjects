package AleksandrVasko.oop.polimorfizm_nasledovanie.pm2;

public class Main {
    public static void main(String[] args) {
        animal p1 = new pingvin("ковальски");
        animal m1 = new mechenosec("акула");
        animal l1 = new leo("лёва");

        animal[] array = {p1, m1, l1};
        for (animal b : array)
            if (b instanceof leo) {
                leo l2 = (leo)b;
                System.out.println(b.name);
                b.eat();
                b.sleep();
            }
        animal[] array1 = {p1,m1,l1};
        for (animal b : array1)
            if (b instanceof speakable){
                speakable s1 =(speakable) b;
            s1.speak();
            }
    }
}
