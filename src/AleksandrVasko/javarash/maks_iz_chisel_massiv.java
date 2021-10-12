package AleksandrVasko.javarash;

import java.util.Scanner;

/**
 * The type Maks iz chisel massiv.
 */
public class maks_iz_chisel_massiv {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int[] array = new int[x];
        for (int i =0; i < x; i++) {
        array[i] = console.nextInt();
        }
      int min =  array[0];
        for(int j =1; j < array.length; j++){
            if (array[j]<min){
               array[j]= min;
            }
        }
        System.out.println(min);
    }
}
