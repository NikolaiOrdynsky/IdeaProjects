package AleksandrVasko.Exeption.Exeption.Exeption1;

import java.lang.RuntimeException ;

/**
 * The type Exeptions.
 */
public class Exeptions {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        tiger kisa = new tiger();
        kisa.eats("myaso");
        try {
            kisa.drink("vod");
            try {
                kisa.drink("pivo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("eto blok inner finally, stop.");
            }

        } catch (NeVodaExeption e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("eto blok outer finally, stop.");
        }

    }


    /**
     * The type Ne myaso exeption.
     */
    public static class NeMyasoExeption extends RuntimeException {
        /**
         * Instantiates a new Ne myaso exeption.
         *
         * @param text the text
         */
        NeMyasoExeption(String text) {
            super(text);
        }
    }

    /**
     * The type Ne voda exeption.
     */
    public static class NeVodaExeption extends Exception {
        /**
         * Instantiates a new Ne voda exeption.
         *
         * @param text the text
         */
        NeVodaExeption(String text) {
            super(text);
        }
    }


}
