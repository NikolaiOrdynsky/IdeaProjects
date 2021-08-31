package AleksandrVasko.javarash;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
public class iOReader {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            List<String> reader = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (String s : reader) {
                char[] arrayChar = s.toCharArray();
                for (char a : arrayChar) {
                    if (a!= ' ' && a!=',') {
                        System.out.print(a);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
