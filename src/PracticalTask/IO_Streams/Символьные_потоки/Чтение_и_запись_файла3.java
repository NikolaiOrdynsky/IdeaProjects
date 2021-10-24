package PracticalTask.IO_Streams.Символьные_потоки;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Чтение_и_запись_файла3 {
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static Product readFile(String line) {
        int id = Integer.parseInt(line.substring(0, 8).trim());
        String name = line.substring(8, 38).trim();
        String price = line.substring(38, 46).trim();
        String quontity = line.substring(46, 50).trim();
        return new Product(id, name, price, quontity);
    }//метод расчленяет строку и создает объект Product

    public static void main(String[] args) throws IOException {
        List<Product> list = new ArrayList<>();                         //Список с объектами класса Product
        BufferedReader reader = new BufferedReader(new FileReader("shop.txt"));//поток для чтение из файла
        FileWriter writer = new FileWriter("shop.txt");//создаем поток записи в файл
        while (reader.ready()) {                 //пока поток может прочесть
            String line = reader.readLine();     //читаем строку
            list.add(readFile(line));            //добавляем в список объект Product созданный из переданной строки
        }
        switch (args[0]) {
            case "-u" : { // если программа запущена с параметрами -u
                int id = Integer.parseInt(args[1].trim()); // из массива args берем id без пробелов
                for (Product el : list) {
                    int index;
                    if (el.id == id) {//если какой либо объект в списке имеет такой же id
                        index = list.indexOf(el);//находим индекс этого объекта
                        String name = "";
                        name = args[2];//присваиваем переменной name -значение из массива args
                        if(name.length()>30){ //проверка длинны строки
                            name.substring(0,30);//если больше 30 - обрезаем
                        }
                        String price = "";
                        price = args[3];
                        if(price.length()>8){
                            price.substring(0,8);
                        }
                        String quantity = "";
                        quantity = args[4];
                        if(quantity.length()>4){
                            quantity.substring(0,4);
                        }
                        list.remove(index); // удаляем объект с совпадающим index
                        list.add(new Product(id,name,price,quantity));//добавляем новый объект с новыми значениями
                        for(Product e:list){
                            writer.write(e.toString());//перезаписываем файл
                            writer.write("\n");
                        }
                    }
                }
            }
            case "-d" : {
                int id = Integer.parseInt(args[1].trim()); // из массива args берем id без пробелов
                int index=0;
                for (Product el : list) {
                    if (el.id == id) {//если какой либо объект в списке имеет такой же id
                        index = list.indexOf(el);//находим индекс этого объекта
                    }
                }
                list.remove(index); // удаляем объект с совпадающим index
                for(Product e:list){
                    writer.write(e.toString());//перезаписываем файл
                    writer.write("\n");
                }
            }
            default : {
                return;
            }
        }

    }


}
