package AleksandrVasko.javarash;

import java.util.Scanner;

/**
 * The type Delenie chisel.
 */
public class delenieChisel {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        double z = x * 1.0 / y;
        System.out.println(z);

    }
}
