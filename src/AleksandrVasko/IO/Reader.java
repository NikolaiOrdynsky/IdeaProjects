package AleksandrVasko.IO;

import AleksandrVasko.Collections.Map.TreeMap.PredmetGrade;
import AleksandrVasko.Collections.Map.TreeMap.Student;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NavigableMap;
import java.util.Set;

/**
 * The type Reader.
 */
public class Reader {
    /**
     * File reader.
     *
     * @param file the file
     */
    public static void fileReader(String file) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    /**
     * Object reader.
     *
     * @param path the path
     */
    public static void objectReader(String path) {
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(path)))) {
            while (true) {
                var i = (NavigableMap<Student, Set<PredmetGrade>>) in.readObject();
                for (Student s : i.keySet()) {
                    System.out.println(s.getName() + " " + s.getAvgGrade() + "\n" + i.get(s).toString());
                }
            }
        } catch (EOFException e) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Chanel byte buffer read.
     *
     * @param path the path
     * @throws IOException the io exception
     */
    public static void chanelByteBufferRead(String path) throws IOException {
        
        try (RandomAccessFile file = new RandomAccessFile(path, "rw");//создается поток на чтение и запись данных побайтово
             FileChannel channel = file.getChannel()) {//создается канал у потока
            ByteBuffer buffer = ByteBuffer.allocate(10);//создается буффер 100 байт
            int read = channel.read(buffer);//читается и записывается в буффер 100 байт
            while (read > 0) {//пока в потоке есть данные read будет больше нуля
                buffer.flip();//изначально курсор находится на позиции которая является числом - размер буфера, нужно курсолр переместить в ноль.
                while (buffer.hasRemaining()) {//цикл пока в буффере есть данные
                    System.out.print((char) buffer.get());//выводить посимвольно данные из буффера

                }
                buffer.clear();//после того как буффер закончится очистить буффер
                read = channel.read(buffer);//считать из потока и записать в буффер следующую часть данных
            }
        }
    }
}
