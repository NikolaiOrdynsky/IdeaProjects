package AleksandrVasko.math_operacii;

class arifmetika {

    static double umnogenie(double z, double x, double c) {
        System.out.println("результат умножения: " + z * x * c);
        return z * x * c;
    }

    static void delenie(int z, int x) {

        System.out.println("результат деления: " + z / x + " остаток: " + z % x);
    }
    public static final double PI = 3.14;

    public static double dlinnakryga(double x) {
        double d = 2 * PI * x;
        return d;
    }

    public double sKruga(double x) {
        double s = PI * x * x;
        return s;
    }

    public void rInfo(double x) {
        System.out.println("радиус: " + x + " Площадь круга: " + sKruga(x) + " Длинна окружности: " + dlinnakryga(x));
    }
    public static void main(String[] args) {

        umnogenie(2.5, 2.6, 3.5);
        delenie(14, 4);
        arifmetika ar = new arifmetika();
        ar.rInfo(5);
        ar.sKruga(6);
        arifmetika.dlinnakryga(8);
    }

}

