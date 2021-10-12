package AleksandrVasko.StreamLamda.Stream;

import AleksandrVasko.Collections.Map.TreeMap.PredmetGrade;
import AleksandrVasko.Collections.Map.TreeMap.Student;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static AleksandrVasko.Collections.Map.TreeMap.Student.addStudent;

/**
 * The type Streams.
 */
public class Streams {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        NavigableMap<Student, Set<PredmetGrade>> map = addStudent();
        map.forEach((s,i)->{
            for(var w:map.keySet()){
                //System.out.println(w.getName()+" "+w.getAvgGrade());
                for(var z:map.get(w)){
                   // System.out.println(z.getPredmet()+" "+z.getGrade());
                }
                System.out.println();
            }
        });
        Set<Map.Entry<Student, Set<PredmetGrade>>> set = map.entrySet();
       // System.out.println(set.stream().sorted((s,q)-> (int) (s.getKey().getAvgGrade()-q.getKey().getAvgGrade())).collect(Collectors.toList()));
        set.forEach(System.out::println);

        //System.out.println( set.stream().sorted(Comparator.comparing(s -> s.getKey().getAvgGrade())).collect(Collectors.toList()));
    }
}
