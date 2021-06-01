package ZaurTregulov.javarash;

import java.sql.SQLOutput;
import java.util.Scanner;

public class maks_iz_chisel_massiv {
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
