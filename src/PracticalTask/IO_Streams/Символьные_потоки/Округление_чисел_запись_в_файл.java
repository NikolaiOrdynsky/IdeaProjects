package PracticalTask.IO_Streams.Символьные_потоки;

import java.io.*;


public class Округление_чисел_запись_в_файл {
    public static void main(String[] args) throws IOException {
        BufferedReader path = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader("shopNew.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("shop.txt"));
        String number = "";
        while (reader.ready()) {
            number += reader.readLine();
        }
        String[] stringArray = number.split(" ");
        for (int i = 0; i < stringArray.length ; i++) {
            double parseDouble = Double.parseDouble(stringArray[i]);
            long round = Math.round(parseDouble);
               writer.write(round + " ");
        }
        reader.close();
        writer.close();
    }

}
