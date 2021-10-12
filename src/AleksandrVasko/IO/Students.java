package AleksandrVasko.IO;

import AleksandrVasko.Collections.Map.TreeMap.PredmetGrade;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Students.
 */
public class Students implements Serializable {
   private String name;
   private float avgGrades;
    /**
     * The Predmet grade set.
     */
    public Set<PredmetGrade> predmetGradeSet ;

    /**
     * Instantiates a new Students.
     *
     * @param name            the name
     * @param avgGrades       the avg grades
     * @param predmetGradeSet the predmet grade set
     */
    public Students(String name, float avgGrades, Set<PredmetGrade> predmetGradeSet) {
        this.name = name;
        this.avgGrades = avgGrades;
        this.predmetGradeSet = predmetGradeSet;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets avg grades.
     *
     * @return the avg grades
     */
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
