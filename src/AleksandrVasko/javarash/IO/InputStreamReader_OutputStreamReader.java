package AleksandrVasko.javarash.IO;

import java.io.*;

/**
 * The type Input stream reader output stream reader.
 */
public class InputStreamReader_OutputStreamReader {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int value;
        int min =Integer.MAX_VALUE;
        while ((value = file.read()) > 0) {
            System.out.print(value+" ");
            if (value < min) {
                min = value;
            }
        }
        file.close();
        System.out.println(" ");
        System.out.println(min);
    }
}
