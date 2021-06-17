package AleksandrVasko.Exeption.Exeption.Exeption1;
import AleksandrVasko.Exeption.Exeption.Exeption1.Exeptions.*;
public class tiger {
        public void eats(String eat) throws NeMyasoExeption {
            if (!eat.equals("myaso")) {
                throw new Exeptions.NeMyasoExeption("tiger ne est " + eat);
            } else {
                System.out.println("tiger est " + eat);
            }

        }
        public void drink(String drink) throws NeVodaExeption {
            if(!drink.equals("voda")){
                throw new NeVodaExeption("tiger ne piet "+drink);
            }else{
                System.out.println("tiger piet "+drink);
            }

        }

    }

