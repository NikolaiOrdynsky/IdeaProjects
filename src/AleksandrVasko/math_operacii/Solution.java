package AleksandrVasko.math_operacii;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.lang.Math;
import java.util.function.Consumer;

/*
Алгоритмы-числа
*/

public class Solution {
    public static long[] arrayNum(long N) {
        String[] num = String.valueOf(N).split("");
        long[] intNum = new long[num.length];
        for (int i = 0; i < num.length; i++) {
            intNum[i] = Long.parseLong(num[i]);
        }
        return intNum;
    }

    public static long[] getNumbers(long N) {
        List<Long> list = new ArrayList<>();
        for (long i = N - 1; i > 0; i--) {
            long[] array = arrayNum(i);
            long sum = 0;
            for (int j = 0; j < array.length; j++) {
                if (sum < N) {
                    sum = (long) (sum + Math.pow(array[j], array.length));
                } else {
                    break;
                }
            }
            if (sum == i) {
                list.add(sum);
            }
        }
        Collections.sort(list);
        long[] result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        long aa = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - aa));

        aa = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1500_000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - aa));


    }

}





























