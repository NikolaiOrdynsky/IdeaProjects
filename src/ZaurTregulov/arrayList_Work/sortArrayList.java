package ZaurTregulov.arrayList_Work;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {
    static void arrayListSort(String... str) {
        ArrayList<String> array1 = new ArrayList<>();
        for (String s : str) {
            if (!array1.contains(s))
                array1.add(s);
        }

        // String[] buf = array1.toArray(new String[array1.size()]);
        // for (int j = 0; j < buf.length; j++) {
        //   for (int i = j + 1; i < buf.length; i++) {
        //     if (buf[i].equals(buf[j])) {
        //       buf[i] = "clear";
        //    }
        //
        //  }
        //  ArrayList<String> array2 = new ArrayList<>();
        //  for (String s : buf) {
        //      array2.add(s);
        //     array2.remove("clear");
        //  }
        Collections.sort(array1);
        System.out.println(array1);
    }

    public static void main(String[] args) {
        arrayListSort("da", "be", "cv", "ag", "ag", "be", "fg");
        int i = 1;
        String s = new String[]{"as", "as", "tg"}[i];
        System.out.println();
    }
}
