package AleksandrVasko.javarash.ChikenFabrica;

/**
 * The type Belarus hen.
 */
public class BelarusHen extends Hen {

    @Override
   public int getCountOfEggsPeronth() {
        return 300;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + " Я несу " + getCountOfEggsPeronth() + " яиц в месяц.";
    }

}
