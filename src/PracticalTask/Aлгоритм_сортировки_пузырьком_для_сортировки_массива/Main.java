package PracticalTask.Aлгоритм_сортировки_пузырьком_для_сортировки_массива;

public class Main {
    public static void main(String[] args) {

        int[] array ={100,14,189,126,1000,1556,1325,1223,14,15,178};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
