package PracticalTask.IO_Streams.Чтение_файла_класс_Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String s = reader.readLine();
                String[] split = s.split(" ");
                String dr = split[split.length-3]+" "+split[split.length-2]+" "+split[split.length-1];
                String name = s.replaceAll(dr,"").trim();
                Calendar cal = new GregorianCalendar(Integer.parseInt(split[split.length-1]),Integer.parseInt(split[split.length-2])-1,Integer.parseInt(split[split.length-3]));
                PEOPLE.add(new Person(name,cal.getTime()));
            }
        } catch (IOException  e) {
            e.printStackTrace();
        }
        System.out.println(PEOPLE.toString());
    }
}
