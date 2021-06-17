package AleksandrVasko.Collections.arrayList_Work;

import java.util.ArrayList;
import java.util.Collections;
// метод sortArrayList создает список с переданными строками в параметре, удаляет одинаковые элементы и сортирует их .

public class sortArrayList {
    public static void arrayListSort(String... str) {
        ArrayList<String> array1 = new ArrayList<>();
        for (String s : str) {                               // В параметр метода arraylistSort передается масиив строк warargs str, с неопределенной длинной,
                                                             // в цикле выполняется пробежка по всем элементам - s копия текущего элемента.
            if (!array1.contains(s))                        // проверяется есть ли элемент s в списке, тоесть нет ли повторяющихся элементов
                array1.add(s);                              // добавить элемент s в список
        }

        String[] buf = array1.toArray(new String[array1.size()]); //Создать массив с элементами которые копируются из списка array1 , в параметрах метода указывается тип и размер массива
        for (int j = 0; j < buf.length; j++) {                    //два цикла для сравнения одного  элемента со вторым
            for (int i = j + 1; i < buf.length; i++) {            //[1 цикл] [2 цикл]
                if (buf[i].equals(buf[j])) {                      // условие, если два элемента массива равны то ,
                    buf[i] = "clear";                             //первый из них примет значение "clear"
                }
            }

            array1.remove("clear");
        }
        Collections.sort(array1); // сортировка списка с помощью класса Collections и его метода sort.
        System.out.println(array1);
    }


}


