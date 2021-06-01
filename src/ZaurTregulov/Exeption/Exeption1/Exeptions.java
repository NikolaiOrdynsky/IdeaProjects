package ZaurTregulov.Exeption.Exeption1;

import java.lang.RuntimeException ;

public class Exeptions {
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


    public static class NeMyasoExeption extends RuntimeException {
        NeMyasoExeption(String text) {
            super(text);
        }
    }

    public static class NeVodaExeption extends Exception {
        NeVodaExeption(String text) {
            super(text);
        }
    }


}
