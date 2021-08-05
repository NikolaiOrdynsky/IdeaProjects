package AleksandrVasko.Collections.Map.TreeMap;

import java.io.Serializable;
import java.util.*;

public class Student implements Comparable<Student>, Serializable {
    private final String name;
    private final float avgGrade;



    public Student(String name, float avgGrade) {
        this.name = name;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return this.name;
    }

    public float getAvgGrade() {
        return this.avgGrade;
    }

    private static float averageGrade(Set<PredmetGrade> alex) {
        float sum = 0f;
        for (PredmetGrade pg : alex) {
            sum = sum + pg.getGrade();
        }
        return sum / alex.size();
    }

    public static NavigableMap<Student, Set<PredmetGrade>> addStudent() {
        Set<PredmetGrade> alex = new HashSet<>();
        alex.add(new PredmetGrade("история", 8));
        alex.add(new PredmetGrade("физика", 7));
        alex.add(new PredmetGrade("математика", 6));
        alex.add(new PredmetGrade("география", 9));
        alex.add(new PredmetGrade("информатика", 10));

        Set<PredmetGrade> nik = new HashSet<>();
        nik.add(new PredmetGrade("история", 7));
        nik.add(new PredmetGrade("физика", 8));
        nik.add(new PredmetGrade("математика", 7));
        nik.add(new PredmetGrade("география", 5));
        nik.add(new PredmetGrade("информатика", 9));

        Set<PredmetGrade> fil = new HashSet<>();
        fil.add(new PredmetGrade("история", 9));
        fil.add(new PredmetGrade("физика", 6));
        fil.add(new PredmetGrade("математика", 7));
        fil.add(new PredmetGrade("география", 10));
        fil.add(new PredmetGrade("информатика", 10));

        Set<PredmetGrade> mary = new HashSet<>();
        mary.add(new PredmetGrade("история", 9));
        mary.add(new PredmetGrade("физика", 9));
        mary.add(new PredmetGrade("математика", 7));
        mary.add(new PredmetGrade("география", 7));
        mary.add(new PredmetGrade("информатика", 7));

        Set<PredmetGrade> fiona = new HashSet<>();
        fiona.add(new PredmetGrade("история", 10));
        fiona.add(new PredmetGrade("физика", 10));
        fiona.add(new PredmetGrade("математика", 7));
        fiona.add(new PredmetGrade("география", 9));
        fiona.add(new PredmetGrade("информатика", 10));

        NavigableMap<Student, Set<PredmetGrade>> map = new TreeMap<>();
        map.put(new Student("Alex", averageGrade(alex)), alex);
        map.put(new Student("Nik", averageGrade(nik)), nik);
        map.put(new Student("Fil", averageGrade(fil)), fil);
        map.put(new Student("Fiona", averageGrade(fiona)), fiona);
        map.put(new Student("Mary", averageGrade(mary)), mary);

        return map;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Student object = (Student) obj;
        return this.name.equals(object.getName()) && this.avgGrade != object.getAvgGrade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avgGrade);//Генерирует хэш-код для последовательности входных значений.
    }

    @Override
    public int compareTo(Student studentAvgGrade) {
        if (this.avgGrade > studentAvgGrade.getAvgGrade()) {
            return 1;
        }
        if (this.avgGrade < studentAvgGrade.getAvgGrade()) {
            return -1;
        }
        return this.name.compareTo(studentAvgGrade.getName());
    }

    @Override
    public String toString() {
        return "name= " + name  + " avgGrade " + avgGrade;
    }
}
