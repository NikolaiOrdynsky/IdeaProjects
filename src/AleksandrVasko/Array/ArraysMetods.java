package AleksandrVasko.Array;

import java.util.Arrays;

/**
 * The type Arrays metods.
 */
public class ArraysMetods {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] array = {120,10,50,79,84,555};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
