package AleksandrVasko.javarash;

import java.util.Scanner;

public class vvod_stroki_nyshnoe_kol_raz {
    public static void main(String[] args){
        Scanner console = new Scanner (System.in);
        String namestr = console.nextLine();
        int number = console.nextInt();
        while (number > 0 && number < 5){
            System.out.println(namestr);
            number --;
        }

    }
}
