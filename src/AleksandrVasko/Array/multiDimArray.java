package AleksandrVasko.Array;

/**
 * The type Multi dim array.
 */
public class multiDimArray {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
//    array[0][0], array[0][1],array[0][2],
//    array[1][0],array[1][1],array[1][2],array[1][3],array[1][4],
//    array[2][0],array[2][1],array[2][2],array[2][3].
        int[][] array = new int[3][];
        array[0] = new int[3];
        array[1] = new int[5];
        array[2] = new int[4];
        for (int[] stroka : array) {
            for (int stolbec : stroka) {
                System.out.print(stolbec + " ");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------");
        int[][] multiDimArray = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        for (int[] stroka : multiDimArray) {
            for (int stolbec : stroka) {
                System.out.print(stolbec + " ");
            }
            System.out.println(" ");
        }
    }
}
