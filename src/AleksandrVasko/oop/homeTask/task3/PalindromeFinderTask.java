package AleksandrVasko.oop.homeTask.task3;


import java.util.Scanner;

/**
 * Напишите программу которая  проверяет введенное с клавиатуры число и говорит
 * является ли данное число палиндромом.
 * Палиндром - это число которое читается одинаково и спереди назад и сзади наперед.
 * Примеры 12321, 45654, 787 и т.д.
 * <p>
 * Дополнительное условие: программа принимает только числа длинной 5 знаков.
 * В случае если было введено число длинной != 5, программа должна выполнить еще
 * одно прохождение цикла и попросить снова ввести значение с клавиатуры.
 * У данной задачи есть разные варианты решения.
 * 1) С помощью конвертации чисел в строки и обратно.
 * 2) Решение с помощью щю использования остатка от деления на 10.
 * <p>
 * Вам нужно выполнить задания двумя способами.
 */
public class PalindromeFinderTask {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ведите число, длинной от 3 до 5 символов, для проверки на полиндромность. ");
        int a = console.nextInt();
        int b = a;
        String convertedInput = String.valueOf(a);
        int revers=0;
        if (convertedInput.length()>=3&&convertedInput.length()<=5) {
            int ostatok=0;
            while (b>0){
                ostatok = b%10;
                revers = revers *10+ ostatok;
                b = b/10;
            }
        }else{
            System.out.println("Введенное число не соответствует условию. ");
        }
        if(revers==a){
            System.out.println("Введенное число полиндром.");
        }else {
            System.out.println("Введенное число не полиндром.");
        }

    }
}
