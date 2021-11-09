package PracticalTask.IO_Streams.Ищем_совпадение_строк;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {

        try (BufferedReader path = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(path.readLine()))) {
            while (reader.ready()) {
                String line = reader.readLine();
                int count = 0;
                String[] s = line.split(" ");
                for (String el : s) {
                    if (words.contains(el)) {
                        count++;
                    }
                }
                if (count==2) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

