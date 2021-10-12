package AleksandrVasko.javarash.ChikenFabrica;

/**
 * The type Ukrainian hen.
 */
public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPeronth() {
        return 330;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + " Я несу " + getCountOfEggsPeronth() + " яиц в месяц.";
    }
}
