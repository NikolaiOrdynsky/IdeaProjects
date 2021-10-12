package AleksandrVasko.javarash.ChikenFabrica;

/**
 * The type Solution.
 */
public class Solution {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        System.out.println( hen.getCountOfEggsPeronth());
    }

    /**
     * The type Hen factory.
     */
    static class HenFactory {
        /**
         * Gets hen.
         *
         * @param country the country
         * @return the hen
         */
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
