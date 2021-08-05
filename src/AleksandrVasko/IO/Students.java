package AleksandrVasko.IO;

import AleksandrVasko.Collections.Map.TreeMap.PredmetGrade;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Students implements Serializable {
   private String name;
   private float avgGrades;
   public Set<PredmetGrade> predmetGradeSet ;

    public Students(String name, float avgGrades, Set<PredmetGrade> predmetGradeSet) {
        this.name = name;
        this.avgGrades = avgGrades;
        this.predmetGradeSet = predmetGradeSet;
    }

    public String getName() {
        return name;
    }

    public float getAvgGrades() {
        return avgGrades;
    }

    @Override
    public String toString() {

        return "Student{" +
                "name='" + name + '\'' +
                ", avgGrades=" + avgGrades +"\n"+"PredmetGrades "+ predmetGradeSet.toString()+
                '}';
    }
}
