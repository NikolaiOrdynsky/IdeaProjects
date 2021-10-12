package AleksandrVasko.javarash;

import java.util.Scanner;

/**
 * The type Ploshad kruga.
 */
public class ploshadKruga {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int x = console.nextInt();
        double pi = 3.14;
        double S = pi * x * x;


        System.out.println("Площадь круга " + x + " равна " + S);
    }
}
