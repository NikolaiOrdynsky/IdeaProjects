package AleksandrVasko.IO.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BfReader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Test.txt"))) {
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        }catch(NullPointerException | IOException s){
            System.out.println(s.getMessage());
        }
    }
}
