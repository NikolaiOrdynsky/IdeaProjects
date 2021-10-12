package AleksandrVasko.oop.homeTask.task3;

import java.util.Scanner;

/**
 * The type Palindrom finder task alternative.
 */
public class PalindromFinderTaskAlternative {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число от 100 до 99999.");
        int a = console.nextInt();
        String b = String.valueOf(a);
        String revers = "";
        if (b.length() >= 3 && b.length() <= 5) {
            for (int i = b.length() - 1; i >= 0; i--) {
                revers = revers + b.charAt(i);
            }

        } else {
            System.out.println("Вы ввели неверное число. ");
        }
        int c = Integer.parseInt(revers);
        if (c == a) {
            System.out.println("Введенное число палиндром. ");
        } else {
            System.out.println("Введенное число не палиндром. ");
        }


    }
}
