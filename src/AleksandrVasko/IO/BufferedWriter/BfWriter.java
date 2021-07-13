package AleksandrVasko.IO.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/*Класс BufferedWriter записывает текст в поток, предварительно буферизируя записываемые символы,
тем самым снижая количество обращений к физическому носителю для записи данных.

Класс BufferedWriter имеет следующие конструкторы:
BufferedWriter(Writer out)
BufferedWriter(Writer out, int sz)
В качестве параметра он принимает поток вывода, в который надо осуществить запись. Второй параметр указывает на размер буфера.*/
public class BfWriter {
    public static void main(String[] args) {

        try (BufferedWriter bfWritter = new BufferedWriter(new FileWriter("BankAccaunt2.txt"))){
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
}
