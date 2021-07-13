package AleksandrVasko.IO.Formatter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassFormatter {
    public static void main(String[] args) {
    }

    private static void formatter() {
        System.out.println("Введите данные аккаунта в формате : 1.id(целое число), 2.имя(буквы), 3.фамилия(буквы),4.счет(дробное число)");
        try (Formatter formatter = new Formatter("BankAccaunt.txt")) {
            Scanner scanner = new Scanner(System.in);
            int a = 0;
            while (a < 3) {
                formatter.format("%d,%s,%s,%.2f,%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextFloat());
                scanner.nextLine();
                a++;
            }
        } catch (InputMismatchException | FileNotFoundException e) {
            System.out.println(e + "Данные введены некорректно.");

        }
    }
}
