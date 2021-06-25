package AleksandrVasko.Collections.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAsList {
    public static void main(String[] args) {
        String [] array = {"red","blue","yolow"};
        ArrayList<String> al = new ArrayList<>(Arrays.asList(array));
        al.add("black");
        array = al.toArray(new String[0]);
        Arrays.sort(array);
            System.out.println(Arrays.toString(array));

    }
}
