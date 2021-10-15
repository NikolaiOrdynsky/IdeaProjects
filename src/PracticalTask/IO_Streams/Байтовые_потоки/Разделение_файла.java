package PracticalTask.IO_Streams.Байтовые_потоки;

import java.io.*;

public class Разделение_файла {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream name1 = new FileInputStream(reader.readLine());
            FileOutputStream name2 = new FileOutputStream(reader.readLine());
            FileOutputStream name3 = new FileOutputStream(reader.readLine());
            int size = name1.available();                        //Вычисляем кол-во байт в файле.
            while(name1.available()>0){
                if(name1.available()>size/2){                    //Если оставшееся кол-во байт больше половины
                    name2.write(name1.read());                   //Тогда записываем байты в name2.
                } else{
                    name3.write(name1.read());                   //Иначе в файл name3.
                }
            }
            name1.close();
            name2.close();
            name3.close();
        }
}
