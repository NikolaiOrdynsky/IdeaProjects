package AleksandrVasko.Array;

public class multiDimArray {
    public static void main(String[] args) {
//    array[0][0], array[0][1],array[0][2],
//    array[1][0],array[1][1],array[1][2],array[1][3],array[1][4],
//    array[2][0],array[2][1],array[2][2],array[2][3].
        int[][] array = new int[3][];
        array[0] = new int[3];
        array[1] = new int[5];
        array[2] = new int[4];
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
        int[][] multiDimArray = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        for(int i=0;i< multiDimArray.length;i++){
            for(int j=0;j<multiDimArray[i].length;j++){
                System.out.print(multiDimArray[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
