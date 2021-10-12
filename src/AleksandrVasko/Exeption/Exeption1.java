package AleksandrVasko.Exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Exeption 1.
 */
public class Exeption1 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        do {
            try {
                System.out.println("Введите числитель. ");
                int chislitel = scanner.nextInt();
                System.out.println("Введите знаменатель. ");
                int znamenatel = scanner.nextInt();
                System.out.println(delenie(chislitel, znamenatel));
                a=false;
            } catch (ArithmeticException e) {
                System.out.println(e + " нельзя делить на 0.");
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e + " нельзя вводить символы, только целые числа.");
                scanner.nextLine();
            }
        } while (a);

    }

    /**
     * Delenie int.
     *
     * @param chislitel  the chislitel
     * @param znamenatel the znamenatel
     * @return the int
     */
    public static int delenie(int chislitel, int znamenatel) {
        return chislitel / znamenatel;

    }
}
