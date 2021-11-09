package PracticalTask.IO_Streams.Замена_цифр_на_слова;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static Map<Integer, String> map = new HashMap<>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }
    public static void main(String[] args) {
        try (BufferedReader path = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(path.readLine()))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] splitLine = line.split(" ");//делим строку на элементы, разделитель пробелы
                for (int i = 0; i < splitLine.length; i++) {
                    try {
                        String s = splitLine[i].replaceAll("[^0-9a-zA-Zа-яА-Я]", "");//если в элементе есть знак препинания - удаляем его
                        if (map.containsKey(Integer.parseInt(s))) {//ищем в мар текущий элемнт без лишних знаков
                            String s1 = map.get(Integer.parseInt(s));//получаем строковое значение текущего элемента
                            splitLine[i] = splitLine[i].replace(s,s1);//заменяем элемент из строки на значение из мар
                        }
                    } catch (NumberFormatException e) {
                    }
                }
                System.out.println(String.join(" ",splitLine));//соединяем массив элементов обратно в строку
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
