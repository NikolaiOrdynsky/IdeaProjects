package PracticalTask.IO_Streams.Байтовые_потоки;
import java.io.*;
public class Подсчет_запятых_в_файле {
/*
       Символ ',' в десятичной системе ASCII имеет значение 44
* */
        public static void main(String[] args)throws IOException{
            BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream reader = new FileInputStream(name.readLine());
            int count =0;
            while(reader.available()>0){
                if(44==reader.read()){
                    count++;
                }
            }
            System.out.println(count);
            reader.close();
        }

}
