package AleksandrVasko.Array;

public class MultiDimArray2 {
    public static void main(String[] args) {
        int[][] array = {{10, 11, 12}, {7, 8, 9}, {4, 5, 6}, {-1, 2, 3}};
        System.out.println("Минимальное число в массиве array = "+minArray(array));
        System.out.println("Среднее значение введенных чисел = "+avgArray(4.1,5.9,5.0,9));
    }

    private static int minArray(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int[] i : array) {
            for (int j : i) {
                if (min > j) {
                    min = j;
                }
            }
        }
        return min;
    }

    private static double avgArray(double... array) {
        double sum = 0;
        for (double i : array) {
            sum = sum + i;
        }
        return sum / array.length;
    }
}
