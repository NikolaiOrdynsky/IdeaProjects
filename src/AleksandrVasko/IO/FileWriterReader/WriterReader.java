package AleksandrVasko.IO.FileWriterReader;

import AleksandrVasko.Collections.Map.TreeMap.PredmetGrade;
import AleksandrVasko.Collections.Map.TreeMap.StudentAvgGrade;
import java.io.*;
import java.util.*;

import static AleksandrVasko.Collections.Map.TreeMap.Main.map1;

public class WriterReader {
    private static Map<StudentAvgGrade, Set<PredmetGrade>> map = new TreeMap<>(map1);

    public static void FileWrite() throws IOException {
        try (FileWriter writer = new FileWriter("Test.txt")) {
//            for (Map.Entry<StudentAvgGrade, Set<PredmetGrade>> s : map.entrySet()) {
//                writer.write(s.getKey() + " " + s.getValue() + "\n");
//            }
            for (StudentAvgGrade s : map.keySet()) {
                writer.write("key: " + s.getName() + " " + " AvgGrade " + s.getAvgGrade() + "\n");
                writer.write("Value: ");
                for (PredmetGrade a : map.get(s)) {
                    writer.write(a.getPredmet() + " " + a.getGrade() + ". ");
                }
                writer.write("\n" + "-------------------------------------------------------------------------" + "\n");
            }
        }
    }

    public static void FileReader() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("Test.txt"))) {
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        FileWrite();
         FileReader();

    }
}
