package AleksandrVasko.javarash.ChikenFabrica;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        System.out.println( hen.getCountOfEggsPeronth());
    }

    static class HenFactory {
        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.UKRAINE)) {
                hen = new UkrainianHen();
            } else if (country.equals(Country.RUSSIA)) {
                hen = new RussianHen();
            } else if (country.equals(Country.MOLDOVA)) {
                hen = new MoldovanHen();
            } else if (country.equals(Country.BELARUS)) {
                hen = new BelarusHen();
            }
            return hen;
        }

    }
}
