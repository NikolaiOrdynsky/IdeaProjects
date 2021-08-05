package AleksandrVasko.IO;

import AleksandrVasko.Collections.Map.TreeMap.PredmetGrade;
import AleksandrVasko.Collections.Map.TreeMap.Student;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NavigableMap;
import java.util.Set;

public class Reader {
    public static void fileReader(String file)  {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        }catch(IOException e){
            e.printStackTrace();

        }
    }

public static void objectReader(String track){
   try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(track)))){
       while(true){
          var i= (NavigableMap<Student, Set<PredmetGrade>>)in.readObject();
           for(Student s:i.keySet()){
               System.out.println(s.getName()+" "+s.getAvgGrade()+"\n"+i.get(s).toString());
           }
       }
   } catch(EOFException e){

   } catch (IOException | ClassNotFoundException e) {
       e.printStackTrace();
   }

}
}
