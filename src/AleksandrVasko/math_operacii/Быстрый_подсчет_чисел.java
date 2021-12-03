package AleksandrVasko.math_operacii;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Быстрый_подсчет_чисел {

/*
Алгоритмы-числа
*/

     static class Solution {


        private static long S;
        private static int N;
        private static int[] digitsMultiSet;
        private static int[] testMultiSet;

        private static List<Long> results;
        private static long maxPow;
        private static long minPow;

        private static long[][] pows;

        public static void main(String[] args) {
            long a = System.currentTimeMillis();
            System.out.println(Arrays.toString(getNumbers(1000)));
            long b = System.currentTimeMillis();
            System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
            System.out.println("time = " + (b - a) / 1000);

            a = System.currentTimeMillis();
            System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
            b = System.currentTimeMillis();
            System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
            System.out.println("time = " + (b - a) / 1000);

            Comparator<String> comparator = new Comparator<String>() {
                @Override public int compare(String s1, String s2) {
                    return s1.compareTo(s2);
                }
            };
        }

     /**Метод getNumbers преобразует список чисел в массив чисел. **/
        public static long[] getNumbers(long upperLimit) {
            if (upperLimit <= 1) return new long[0];

            S = upperLimit;
            List<Long> armstrongList = generate(String.valueOf(S).length() + 1);
            long[] result = new long[armstrongList.size()];

            for (int i = 0; i < armstrongList.size(); i++) {
                result[i] = armstrongList.get(i);
            }
            return result;
        }

        private static void genPows(int N) {
            if (N > 20) throw new IllegalArgumentException();
            pows = new long[10][N + 1];
            for (int i = 0; i < pows.length; i++) {
                long p = 1;
                for (int j = 0; j < pows[i].length; j++) {
                    pows[i][j] = p;
                    p *= i;
                }
            }
        }

        private static boolean check(long pow) {
            if (pow >= maxPow) return false;
            if (pow < minPow) return false;

            for (int i = 0; i < 10; i++) {
                testMultiSet[i] = 0;
            }

            while (pow > 0) {
                int i = (int) (pow % 10);
                testMultiSet[i]++;
                if (testMultiSet[i] > digitsMultiSet[i]) return false;
                pow = pow / 10;
            }

            for (int i = 0; i < 10; i++) {
                if (testMultiSet[i] != digitsMultiSet[i]) return false;
            }

            return true;
        }

        private static void search(int digit, int unused, long pow) {
            if (pow >= maxPow) return;

            if (digit == -1) {
                if (check(pow) && pow < S) results.add(pow);
                return;
            }

            if (digit == 0) {
                digitsMultiSet[digit] = unused;
                search(digit - 1, 0, pow + unused * pows[digit][N]);
            } else {
                // Check if we can generate more than minimum
                if (pow + unused * pows[digit][N] < minPow) return;

                long p = pow;
                for (int i = 0; i <= unused; i++) {
                    digitsMultiSet[digit] = i;
                    search(digit - 1, unused - i, p);
                    if (i != unused) {
                        p += pows[digit][N];
                        // Check maximum and break the loop - doesn't help
                        // if (p >= maxPow) break;
                    }
                }
            }
        }

        private static List<Long> generate(int maxN) {
            if (maxN >= 21) throw new IllegalArgumentException();//проверка на длинну числа - не более 20 символов

            genPows(maxN);
            results = new ArrayList<>();
            digitsMultiSet = new int[10];
            testMultiSet = new int[10];

            for (N = 1; N < maxN; N++) {
                minPow = (long) Math.pow(10, N - 1);
                maxPow = (long) Math.pow(10, N);

                search(9, N, 0);
            }

            Collections.sort(results);

            return results;
        }
    }
    public static void checkTheCode (String input) {
        boolean result = Boolean.parseBoolean(input);
        result = !result;
        String output = String.valueOf(result);
        System.out.println(output);
    }

}
