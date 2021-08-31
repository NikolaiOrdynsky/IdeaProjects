package AleksandrVasko.javarash.ChikenFabrica;

public class RussianHen extends Hen{

    @Override
   public int getCountOfEggsPeronth() {
        return 320;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + " Я несу " + getCountOfEggsPeronth() + " яиц в месяц.";
    }
}
