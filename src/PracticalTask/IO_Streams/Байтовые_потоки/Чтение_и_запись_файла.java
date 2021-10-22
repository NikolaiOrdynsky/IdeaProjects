package PracticalTask.IO_Streams.Байтовые_потоки;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Чтение_и_запись_файла {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader nameFile = new BufferedReader(new InputStreamReader(System.in));
        String file = nameFile.readLine();
        FileReader reader = new FileReader(file);
        FileWriter write = new FileWriter(file, true);
        if ("-c".equals(args[0])) {
            int id = idNew(list, reader);
            write.write(String.format("\n%8s%30s%8s%4s", id, args[1], args[2], args[3]));
        }
        reader.close();
        write.close();
    }

    private static int idNew(List<Integer> list, FileReader reader) throws IOException {
        String number = "";
        while (reader.ready()) {
            char value = (char) reader.read();
            number = number + String.valueOf(value);
        }
        String collect = Arrays.stream(number.split("")).filter(el -> !el.equals("\n")).filter(el -> !el.equals("\r")).collect(Collectors.joining());
        for (int i = 0; i < collect.length()-1; i = i + 50) {
            String s1 = collect.substring(i, i + 8);
            String s = Arrays.stream(s1.split("")).filter(el -> !el.equals(" ")).collect(Collectors.joining());
            System.out.println(s);
            list.add(Integer.parseInt(s));
        }


        Integer max = Collections.max(list);
        return max + 1;
    }
}
