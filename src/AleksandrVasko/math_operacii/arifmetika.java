package AleksandrVasko.math_operacii;

/**
 * The type Arifmetika.
 */
class arifmetika {

    /**
     * Umnogenie double.
     *
     * @param z the z
     * @param x the x
     * @param c the c
     * @return the double
     */
    static double umnogenie(double z, double x, double c) {
        System.out.println("результат умножения: " + z * x * c);
        return z * x * c;
    }

    /**
     * Delenie.
     *
     * @param z the z
     * @param x the x
     */
    static void delenie(int z, int x) {

        System.out.println("результат деления: " + z / x + " остаток: " + z % x);
    }

    /**
     * The constant PI.
     */
    public static final double PI = 3.14;

    /**
     * Dlinnakryga double.
     *
     * @param x the x
     * @return the double
     */
    public static double dlinnakryga(double x) {
        double d = 2 * PI * x;
        return d;
    }

    /**
     * S kruga double.
     *
     * @param x the x
     * @return the double
     */
    public double sKruga(double x) {
        double s = PI * x * x;
        return s;
    }

    /**
     * R info.
     *
     * @param x the x
     */
    public void rInfo(double x) {
        System.out.println("радиус: " + x + " Площадь круга: " + sKruga(x) + " Длинна окружности: " + dlinnakryga(x));
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        umnogenie(2.5, 2.6, 3.5);
        delenie(14, 4);
        arifmetika ar = new arifmetika();
        ar.rInfo(5);
        ar.sKruga(6);
        arifmetika.dlinnakryga(8);
    }

}

