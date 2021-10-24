package PracticalTask.IO_Streams.Байтовые_потоки;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Подсчет_символов_в_файле {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()) { //если потоку есть что читать
            int value = reader.read(); // читаем символ в виде байта
            if (map.containsKey(value)) {//если в коллекции есть такой символ
                map.put(value,map.get(value)+1);//тогда добавляем этот символ в коллекцию, а к значению прибавляем 1
            }else{
                map.put(value,1);// иначе добавляем символ и в значение записываем 1
            }
        }
        for(Integer el:map.keySet()){
            char chars = (char)el.intValue();
            System.out.println(chars+" "+ map.get(el));
        }
        reader.close();
    }
}
