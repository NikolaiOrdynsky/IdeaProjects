package AleksandrVasko.Array;

import java.util.Scanner;
import java.util.Arrays;

/**
 * The type Array.
 */
public class Array {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа от 0 до 99. ");
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Следующее число :");
            array[i] = scanner.nextInt();
        }
        for (int j : array) {
            System.out.println(j);

        }
        System.out.println(" ");
        int[] sortArray = sortArray(array);
        for (int j : sortArray) {
            System.out.println(j);
        }
    }

    /**
     * Sort array int [ ].
     *
     * @param array the array
     * @return the int [ ]
     */
    public static int[] sortArray(int[] array) { // Сортировка массива
        int[] newArrey = Arrays.copyOf(array,array.length);
        for (int i = 0; i < newArrey.length; i++) {
            for (int j = 0; j < newArrey.length - 1; j++) {
                if (newArrey[j] > newArrey[j + 1]) {
                    int buffer = newArrey[j];
                    newArrey[j] = newArrey[j + 1];
                    newArrey[j + 1] = buffer;
                }
            }
        }
        return newArrey;
    }
}
