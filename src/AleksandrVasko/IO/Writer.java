package AleksandrVasko.IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * The type Writer.
 */
/*Класс BufferedWriter записывает текст в поток, предварительно буферизируя записываемые символы,
тем самым снижая количество обращений к физическому носителю для записи данных.

Класс BufferedWriter имеет следующие конструкторы:
BufferedWriter(Writer out)
BufferedWriter(Writer out, int sz)
В качестве параметра он принимает поток вывода, в который надо осуществить запись. Второй параметр указывает на размер буфера.*/
public class Writer {
    /**
     * Bf write student.
     *
     * @param <K>  the type parameter
     * @param <V>  the type parameter
     * @param map  the map
     * @param path the path
     */
    public static <K, V> void bfWriteStudent(Map<K,V> map, String path)  {
        try (BufferedWriter writer = new BufferedWriter( new FileWriter(path))) {
            for (Map.Entry<K, V> s : map.entrySet()) {
                writer.write(s.getKey() + "\n"+ s.getValue()+"\n");


            }
//            for (Student s : map1.keySet()) {
//                writer.write("key: " + s.getName() + " " + " AvgGrade " + s.getAvgGrade() + "\n");
//                writer.write("Value: ");
//                for (PredmetGrade a : map1.get(s)) {
//                    writer.write(a.getPredmet() + " " + a.getGrade() + ". ");
//                }
//                writer.write("\n" + "-------------------------------------------------------------------------" + "\n");
//            }
        }catch(IOException e){
            e.printStackTrace();

        }
    }

    /**
     * Bf write bank accaunt.
     *
     * @param track the track
     */
    public static void bfWriteBankAccaunt(String track){
        try (BufferedWriter bfWritter = new BufferedWriter(new FileWriter(track))){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите id аккаунта: ");
            bfWritter.write("id accaunt: "+scanner.nextInt());
            bfWritter.write("\n");
            scanner.nextLine();
            System.out.println("Введите имя аккаунта: ");
            bfWritter.write("name accaunt: ");
            bfWritter.write(scanner.nextLine());
            bfWritter.write("\n");
            System.out.println("Введите Фамилию аккаунта: ");
            bfWritter.write("surname accaunt: ");
            bfWritter.write(scanner.nextLine());
            bfWritter.write("\n");
            System.out.println("Введите Счет аккаунта: ");
            bfWritter.write("many accaunt: ");
            bfWritter.write(String.valueOf(scanner.nextFloat()));
            bfWritter.write("\n");
            scanner.nextLine();
        }catch (NullPointerException| IOException | InputMismatchException s){
            System.out.println(s.getMessage());
        }
    }

    /**
     * Bf write formatter.
     *
     * @param track the track
     */
    public static void bfWriteFormatter(String track) {
        System.out.println("Введите данные аккаунта в формате : 1.id(целое число), 2.имя(буквы), 3.фамилия(буквы),4.счет(дробное число)");
        try (Formatter formatter = new Formatter(track)) {
            Scanner scanner = new Scanner(System.in);
            int a = 0;
            while (a < 2) {
                formatter.format("%d,%s,%s,%.2f,%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextFloat());
                scanner.nextLine();
                a++;
            }
        } catch (InputMismatchException | FileNotFoundException e) {
            System.out.println(e + "Данные введены некорректно.");

        }
    }

    /**
     * Object writer.
     *
     * @param nameObj the name obj
     * @param track   the track
     */
    public static void objectWriter(Object nameObj,String track) {
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(track)))){
            out.writeObject(nameObj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
