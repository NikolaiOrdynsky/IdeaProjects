package AleksandrVasko.oop.homeTask.task1;

import java.util.Scanner;

/**
 * Напишите программу которая принимает 3 числовых значения и проверяет, могут ли они быть
 * сторонами треугольника.
 * Для ввода значений с консоли Вам понадобится класс Scanner.
 * <code>Scanner scanner = new Scanner(System.in);</code>
 * <code>scanner.nextInt();</code>
 */
public class TriangleTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите число, которое будет являться стороной треугольника. ");
            int console = input.nextInt();
            if (console > 0) {
                array[i] = console;
            } else {
                System.out.println("Сторона треугольника не может иметь отрицательное значение.");
            }

        }
        if (array[0] + array[1] > array[2] && array[1] + array[2] > array[0] && array[0] + array[2] > array[1]) {
            System.out.println("Числа  "+ array[0]+", "+array[1]+", "+array[2]+", "+ "могут быть сторонами треугольника. ");

        }else {
            System.out.println("Числа "+ array[0]+", "+array[1]+", "+array[2]+", "+"не могуть быть сторонами треугольника. ");
        }

    }
}
