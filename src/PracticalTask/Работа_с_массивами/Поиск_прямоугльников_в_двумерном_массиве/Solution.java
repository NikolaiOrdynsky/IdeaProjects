package PracticalTask.Работа_с_массивами.Поиск_прямоугльников_в_двумерном_массиве;


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


    /*** метод ведет подсчет кол-ва прямоугольников.*/
    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        while (getIsEmpty(a)) {//цикл работает пока в массиве из параметров метода есть 1.
            getMinusArray(a, getSearchRectangleInArray(a));//удаляем найденный прямоугольник в массиве a, из него же.
            count++;//подсчет прямоугльников.
        }
        return count;
    }

    /*** метод возвращает первый найденный слева на право сверху - вниз,прямоугольник в виде двумерного массива.*/
    public static byte[][] getSearchRectangleInArray(byte[][] a) {
        int leftCorner = 0;
        int rightCorner = 0;
        int downRightCorner = 0;
        int line = 0;
        byte[][] clone = new byte[a.length][a[0].length];//создаем массив по параметрам приходящего в параметрах метода.

        for (int i = 0; i < a.length; i++) {
            boolean create = false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    line = i;
                    create = true;
                    leftCorner = j;
                    for (int l = j; l < a[i].length; l++) {
                        if (a[i][l] != 0) {
                            rightCorner = l;
                        } else {
                            break;
                        }
                    }
                    break;
                }
            }
            if (create) {
                break;
            }
        }//находим левый и правый угол прямойголника.

        for (int i = line; i < a.length; i++) {
            if (a[i][rightCorner] != 0) {
                downRightCorner = i;
            } else {
                break;
            }
        }//находим правый нижний угол прямоугольника.

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i >= (byte) line) {
                    if (i <= downRightCorner && j >= leftCorner && j <= rightCorner) {
                        clone[i][j] = 1;
                    }
                }
            }

        }//создаем новый масиив по полученным углам.
        return clone;
    }

    /*** метод удаляет найденный массив(те ячейки где есть 1) из массива в котором ищем прямоугольники.*/
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

    /*** метод проверяет есть ли еще 1 в прямоугольнике.*/
    public static boolean getIsEmpty(byte[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}