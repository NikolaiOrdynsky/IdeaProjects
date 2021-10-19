package PracticalTask.Работа_со_строками.Проверка_расширения_файла;

import java.io.FileInputStream;
import java.io.IOException;

public class TxtInputStream extends FileInputStream {


    public TxtInputStream(String fileName) throws IOException {
        super(fileName);
        if (!fileName.endsWith(".txt")) {
            super.close();
        }

    }


    public static void main(String[] args) throws IOException {
        TxtInputStream stream = new TxtInputStream("Student.txt");
        byte[] bytes = stream.readAllBytes();
        for (byte el : bytes) {
            System.out.print((char) el);

        }

    }
}

