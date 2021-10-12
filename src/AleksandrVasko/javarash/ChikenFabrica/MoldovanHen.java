package AleksandrVasko.javarash.ChikenFabrica;

/**
 * The type Moldovan hen.
 */
public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPeronth() {
        return 310;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + " Я несу " + getCountOfEggsPeronth() + " яиц в месяц.";
    }
}
