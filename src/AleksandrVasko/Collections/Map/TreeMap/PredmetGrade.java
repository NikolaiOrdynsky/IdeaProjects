package AleksandrVasko.Collections.Map.TreeMap;

import java.io.Serializable;
import java.util.Objects;

/**
 * The type Predmet grade.
 */
public class PredmetGrade implements Serializable {
    private final String predmet;
    private final int grade;

    /**
     * Instantiates a new Predmet grade.
     *
     * @param predmet the predmet
     * @param grade   the grade
     */
    public PredmetGrade(String predmet, int grade) {
        this.predmet = predmet;
        this.grade = grade;
    }

    /**
     * Gets predmet.
     *
     * @return the predmet
     */
    public String getPredmet() {
        return predmet;
    }

    /**
     * Gets grade.
     *
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "predmet= " + predmet+ " grade= " + grade+ ".";
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
