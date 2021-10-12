package AleksandrVasko.Exeption.Exeption.Exeption1;
import AleksandrVasko.Exeption.Exeption.Exeption1.Exeptions.*;

/**
 * The type Tiger.
 */
public class tiger {
    /**
     * Eats.
     *
     * @param eat the eat
     * @throws NeMyasoExeption the ne myaso exeption
     */
    public void eats(String eat) throws NeMyasoExeption {
            if (!eat.equals("myaso")) {
                throw new Exeptions.NeMyasoExeption("tiger ne est " + eat);
            } else {
                System.out.println("tiger est " + eat);
            }

        }

    /**
     * Drink.
     *
     * @param drink the drink
     * @throws NeVodaExeption the ne voda exeption
     */
    public void drink(String drink) throws NeVodaExeption {
            if(!drink.equals("voda")){
                throw new NeVodaExeption("tiger ne piet "+drink);
            }else{
                System.out.println("tiger piet "+drink);
            }

        }

    }

