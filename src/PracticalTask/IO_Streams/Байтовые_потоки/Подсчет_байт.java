package PracticalTask.IO_Streams.Байтовые_потоки;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Подсчет_байт {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new TreeMap<>();                                  //Создаем Treemap чтобы результаты были отсортированы.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Создаем поток ввода с консоли.
        FileInputStream file = new FileInputStream(reader.readLine());                //Создаем поток чтение байт из файла.
        while (file.available() > 0) {                                                //Цикл - пока в файле есть непрочитанные байты.
            int key = file.read();                                                    //Читаем байт.
            if (map.containsKey(key)) {                                               //Условие - если в map уже есть такой байт.
                map.put(key,map.get(key)+1);                                          //То, к value такого key прибавляем 1.
            }else{
                map.put(key,1);                                                       //Иначе добавляем 1 в value такого key.
            }
        }
        Set<Integer> integers = map.keySet();
        int max = 0;
        for(Integer el:integers){
            if(map.get(el)>max){
                max=map.get(el);
            }
        }
        for(Integer el:integers){
            if(map.get(el)==max){
                System.out.print(el+" ");
            }
        }
        file.close();
    }
}
