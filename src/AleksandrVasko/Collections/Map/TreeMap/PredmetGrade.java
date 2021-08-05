package AleksandrVasko.Collections.Map.TreeMap;

import java.io.Serializable;
import java.util.Objects;

public class PredmetGrade implements Serializable {
    private final String predmet;
    private final int grade;

    public PredmetGrade(String predmet, int grade) {
        this.predmet = predmet;
        this.grade = grade;
    }

    public String getPredmet() {
        return predmet;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "predmet= " + predmet+ " grade= " + grade+ "."+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PredmetGrade that = (PredmetGrade) o;
        return grade == that.grade && Objects.equals(predmet, that.predmet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(predmet, grade);
    }
}
