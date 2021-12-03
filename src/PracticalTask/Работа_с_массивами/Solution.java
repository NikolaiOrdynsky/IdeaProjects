package PracticalTask.Работа_с_массивами;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    /**
     * {1, 0, 0, 1},{0, 0, 0, 0},{0, 0, 0, 0},{1, 0, 0, 1}
     * <p>
     * {1, 1, 0, 0},{1, 1, 0, 0},{1, 1, 0, 0},{1, 1, 0, 1}
     */
    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        boolean value = true;
        boolean arrayValue = false;
        while (value) {
            byte[][] array = getRectangleInArray(a);//в массиве а ищем прямоугольник и создаем на его основе новый массив
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != 0) {
                        arrayValue = true;
                        break;
                    }
                }
            }//проверка на пустой массив или нет

            if (!arrayValue) {//если массив пустой завершаем метод,если нет прибавляем 1, снова ищем прямоуггольники
                value = false;
            } else {
                count++;
                a = getMinusArray(a, array);
                arrayValue = false;
            }
        }
        return count;
    }

    public static byte[][] getRectangleInArray(byte[][] a) {
        byte[][] clone = new byte[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    clone[i][j] = a[i][j];
                } else {
                    boolean next = false;
                    for (int m = a[i][j]; m < a[i].length; m++) {
                        if (a[i][m+1]<a[i].length&&a[i][m+1]!=0) {
                            next=true;
                        }
                    }
                    if(!next){
                        break;
                    }
                }
            }
        }

        return clone;
    }

    public static byte[][] getMinusArray(byte[][] a, byte[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == b[i][j]) {
                    a[i][j] = 0;
                }
            }
        }
        return a;
    }
}