package PracticalTask.Работа_с_массивами.Удаление_массива_из_массива;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DeleteArrayInArray {


        public static int[] arrayDiff(int[] a, int[] b) {
            int value =0;
            for(int i =0;i<b.length;i++){
                int offset =0;
                for(int j =0;j<a.length;j++){
                    if(a[j]==b[i]){
                        offset++;
                    }else{
                        a[j-offset]=a[j];
                    }
                }
                value +=offset;
            }

            return Arrays.copyOf(a,a.length-value);
        }

        public static int[] arrayDiffList(int[] a, int[] b){
            List<Integer> ferstArray =new ArrayList<>(Arrays.asList(Arrays.stream(a).boxed().toArray(el->new Integer[el])));
            List<Integer> lastArray =new ArrayList<>(Arrays.asList(Arrays.stream(b).boxed().toArray(el->new Integer[el])));
            ferstArray.removeAll(lastArray);
            int[] array = new int[ferstArray.size()];
            int i=0;
            for(Integer el:ferstArray){
                array[i++]=el;
            }

           return array;
        }

        public static int[] arrayDiffStream(int[] a, int[] b){
            // IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();

             Arrays.sort(b);
            return  Arrays.stream(a).filter(x-> Arrays.binarySearch(b,x)<0).toArray();
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiffStream(new int[]{2,3,1,4,5}, new int[]{5,2,3})));

    }
}
