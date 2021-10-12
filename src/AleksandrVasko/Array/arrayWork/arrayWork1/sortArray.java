package AleksandrVasko.Array.arrayWork.arrayWork1;

/**
 * The type Sort array.
 */
public class sortArray {
    /**
     * Sort.
     *
     * @param array the array
     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = array[i];
                    array[i] = min;
                    array[j] = index;
                }

            }
            System.out.print(array[i]+" ");
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] array = {0, -2, -9, 5, 9, 8, 4, 11, 56};
        sort(array);
    }
}
