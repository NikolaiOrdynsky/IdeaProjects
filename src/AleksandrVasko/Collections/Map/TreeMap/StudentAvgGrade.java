package AleksandrVasko.Collections.Map.TreeMap;

import java.util.Objects;

public class StudentAvgGrade implements Comparable<StudentAvgGrade> {
    private final String name;
    private final float avgGrade;

     public StudentAvgGrade(String name, float avgGrade) {
        this.name = name;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return this.name;
    }

    public float getAvgGrade() {
        return this.avgGrade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        StudentAvgGrade object = (StudentAvgGrade) obj;
        return this.name.equals(object.getName()) && this.avgGrade != object.getAvgGrade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avgGrade);//Генерирует хэш-код для последовательности входных значений.
    }

    @Override
    public int compareTo(StudentAvgGrade studentAvgGrade) {
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
