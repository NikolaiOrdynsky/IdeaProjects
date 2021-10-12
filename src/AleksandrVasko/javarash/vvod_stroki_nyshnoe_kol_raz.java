package AleksandrVasko.javarash;

import java.util.Scanner;

/**
 * The type Vvod stroki nyshnoe kol raz.
 */
public class vvod_stroki_nyshnoe_kol_raz {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        Scanner console = new Scanner (System.in);
        String nameStr = console.nextLine();
        int number = console.nextInt();
        while (number > 0 && number < 5){
            System.out.println(nameStr);
            number --;
        }

    }
}
