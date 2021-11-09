package PracticalTask.IO_Streams.Ищем_цифры_в_словах;

import java.io.*;

public class Solution {
    public static boolean numberInString(String string) {
        String s = string.replaceAll("\\d", "");//удаляем все цифры
        return s.length() < string.length();//если длинна строки изменилась возвращаем true, там есть цифры
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {

            while (reader.ready()) {
                String line = reader.readLine();
                String[] splitLine = line.split(" ");
                for (String el : splitLine) {
                    if (numberInString(el)) {
                        writer.write(el+" ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
