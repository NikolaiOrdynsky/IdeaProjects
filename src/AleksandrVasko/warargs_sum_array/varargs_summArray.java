package AleksandrVasko.warargs_sum_array;

/**
 * The type Varargs summ array.
 */
public class varargs_summArray {
    /**
     * Sum.
     *
     * @param array the array
     */
    static void sum(int[]... array) {
        int lenght = 0;
        for (int[] buf : array) {
            lenght += buf.length;
        }
        int[] sumArray = new int[lenght];
        int count =0;
        for (int[]buf1:array) {
            for (int s: buf1) {
                sumArray[count]=s;
                System.out.println(sumArray[count]);
                count++;
            }

        }

    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array3 = {11, 12, 13, 14, 15};
        sum(array1, array2,array3);
    }
}
