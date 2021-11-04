package PracticalTask.IO_Streams.Символьные_потоки;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Чтение_и_запись_файла_объединение_файлов_с_проверкой_удаленные_добавленные_равные_строки {


    public static void main(String[] args) {
        List<LineItem> lineItems = sumStringFiles("BankAccaunt.txt", "BankAccaunt2.txt");
        System.out.println(lineItems.toString());

    }
    //метод суммирует строки из двух файлов
public static List<LineItem> sumStringFiles(String path1,String path2){
    List<LineItem> lines = new ArrayList<LineItem>();
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    try (BufferedReader file1 = new BufferedReader(new FileReader(path1));
         BufferedReader file2 = new BufferedReader(new FileReader(path2))) {
        while (file1.ready()) {
            list1.add(file1.readLine());
        }
        while (file2.ready()) {
            list2.add(file2.readLine());
        }
        for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {//этот цикл проверяет:
            //если элементы равны.
            if (list1.get(i).equals(list2.get(i))) {
                lines.add(new LineItem(Type.SAME, list1.get(i)));
                // если элементы не равны и если след. элемент в певром списке равен элементу во втором списке.
            } else if (!list1.get(i).equals(list2.get(i)) && list1.get(i + 1).equals(list2.get(i))) {
                list2.add(i - 1, "");
                lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                // если элементы не равны и элемент в певром списке равен след.элементу во втором списке.
            } else if (!list1.get(i).equals(list2.get(i)) && list1.get(i).equals(list2.get(i + 1))) {
                list1.add(i - 1, "");
                lines.add(new LineItem(Type.ADDED, list2.get(i)));
            }
        }
        //так как цикл был по мин по длинне списку то надо добавить элементы из большего списка
        // если больше элементов в 1 списке, значит они удалены во втором, и наоборот.
        if (Math.max(list1.size(), list2.size()) == list1.size()) {
            int i1 = list1.size() - list2.size();
            for (int j = i1; j > 0; j--) {
                lines.add(new LineItem(Type.REMOVED, list1.get(list1.size() - j)));
            }
        } else if(Math.max(list1.size(), list2.size()) == list2.size()){
            int i1 = list2.size() - list1.size();
            for (int j = i1; j > 0; j--) {
                lines.add(new LineItem(Type.ADDED, list2.get(list2.size() - j)));
            }
        }

    } catch (IOException e) {
        e.printStackTrace();
    }

return lines;
}
    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return String.format("[Type - %7s. Lines - %s.]\n",type,line);
        }
    }


}
