package AleksandrVasko.Collections.Map.TreeMap;

public class PredmetGrade {
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
        return "predmet= " + predmet+ " grade= " + grade ;
    }
}
